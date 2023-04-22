package com.ManuelBravard.Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(nullable = false, length = 3)
    @Size(max = 3)
    private String id;
    @Column(nullable = false, length = 50)
    @Email
    private String userName;
    @Column(nullable = false, length = 30)
    @Size(min = 8, max = 30)
    private String userPass;

    public Users() {
    }

    public Users(String id, String userName, String userPass) {
        this.id = id;
        this.userName = userName;
        this.userPass = userPass;
    }
}
