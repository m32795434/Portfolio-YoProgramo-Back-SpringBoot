package com.ManuelBravard.Portfolio.security.config;

import jakarta.servlet.Filter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import static com.ManuelBravard.Portfolio.security.user.Permission.ADMIN_CREATE;
import static com.ManuelBravard.Portfolio.security.user.Permission.ADMIN_DELETE;
import static com.ManuelBravard.Portfolio.security.user.Permission.ADMIN_READ;
import static com.ManuelBravard.Portfolio.security.user.Permission.ADMIN_UPDATE;
import static com.ManuelBravard.Portfolio.security.user.Permission.MANAGER_CREATE;
import static com.ManuelBravard.Portfolio.security.user.Permission.MANAGER_DELETE;
import static com.ManuelBravard.Portfolio.security.user.Permission.MANAGER_READ;
import static com.ManuelBravard.Portfolio.security.user.Permission.MANAGER_UPDATE;
import static com.ManuelBravard.Portfolio.security.user.Role.ADMIN;
import static com.ManuelBravard.Portfolio.security.user.Role.MANAGER;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfiguration {

  private final JwtAuthenticationFilter jwtAuthFilter;
  private final AuthenticationProvider authenticationProvider;
  private final LogoutHandler logoutHandler;

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.cors().and()
        .csrf()
        .disable()
        .authorizeHttpRequests()
        .requestMatchers(
            "/getComplete/**", "/api/v1/auth/**",
            "/v2/api-docs",
            "/v3/api-docs",
            "/v3/api-docs/**",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui/**",
            "/webjars/**",
            "/swagger-ui.html")
        .permitAll()

        // No es necesario definir hasAnyAuthority() si solo debo verificar los roles de
        // los usuarios. hasAnyRole() es una forma abreviada de hasAnyAuthority("ROLE_"
        // + role) que se usa para verificar roles específicos
        .requestMatchers("/api/v1/admin/**").hasAnyRole(ADMIN.name())
        .requestMatchers("/api/v1/management/**").hasAnyRole(MANAGER.name(), ADMIN.name())

        // .requestMatchers(GET,
        // "/api/v1/management/**").hasAnyAuthority(ADMIN_READ.name(),
        // MANAGER_READ.name())
        // .requestMatchers(POST,
        // "/api/v1/management/**").hasAnyAuthority(ADMIN_CREATE.name(),
        // MANAGER_CREATE.name())
        // .requestMatchers(PUT,
        // "/api/v1/management/**").hasAnyAuthority(ADMIN_UPDATE.name(),
        // MANAGER_UPDATE.name())
        // .requestMatchers(DELETE,
        // "/api/v1/management/**").hasAnyAuthority(ADMIN_DELETE.name(),
        // MANAGER_DELETE.name())

        /*
         * .requestMatchers("/api/v1/admin/**").hasRole(ADMIN.name())
         * 
         * .requestMatchers(GET, "/api/v1/admin/**").hasAuthority(ADMIN_READ.name())
         * .requestMatchers(POST, "/api/v1/admin/**").hasAuthority(ADMIN_CREATE.name())
         * .requestMatchers(PUT, "/api/v1/admin/**").hasAuthority(ADMIN_UPDATE.name())
         * .requestMatchers(DELETE,
         * "/api/v1/admin/**").hasAuthority(ADMIN_DELETE.name())
         */

        .anyRequest()
        .authenticated()
        .and()
        .sessionManagement()
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .authenticationProvider(authenticationProvider)
        .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
        .logout()
        .logoutUrl("/api/v1/auth/logout")
        .addLogoutHandler(logoutHandler)
        .logoutSuccessHandler((request, response, authentication) -> SecurityContextHolder.clearContext());

    return http.build();
  }

  @Bean
  public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
    configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
    configuration.setAllowedHeaders(Arrays.asList("*"));
    configuration.setAllowCredentials(false);
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
  }
}
