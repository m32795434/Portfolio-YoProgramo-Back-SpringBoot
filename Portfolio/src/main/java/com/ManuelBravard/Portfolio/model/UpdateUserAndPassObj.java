package com.ManuelBravard.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserAndPassObj {
    private Integer id;
    private String userName;
    private String userPass;

    public UpdateUserAndPassObj() {
    }

    public UpdateUserAndPassObj(Integer id, String userName, String userPass) {
        this.id = id;
        this.userName = userName;
        this.userPass = userPass;
    }
}
