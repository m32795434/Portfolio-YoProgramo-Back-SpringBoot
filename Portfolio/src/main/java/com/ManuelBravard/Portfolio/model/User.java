package com.ManuelBravard.Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    @Max(value = 10)
    private Integer id;

    @Column(nullable = false, length = 10)
    @Size(min = 1, max = 10)
    private String level;

    @Column(nullable = false, length = 50)
    @Email(message = "not a valid email type")
    private String userName;

    @Column(nullable = false, length = 30)
    @Size(min = 8, max = 30)
    private String userPass;

    public User() {
    }

    public User(String level, String userName, String userPass) {
        this.level = level;
        this.userName = userName;
        this.userPass = userPass;
    }
}
