package com.ManuelBravard.Portfolio;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
// @EnableWebMvc
public class CorsPolicy implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // .allowedOrigins("https://manuel-bravard.web.app/",
                // "https://manuel-bravard.firebaseapp.com/")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
