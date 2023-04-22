package com.ManuelBravard.Portfolio.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
// not in use
public class AuthRequest {

    private boolean auth;
    private String level;

    public AuthRequest() {
    }

    public AuthRequest(boolean auth, String level) {
        this.auth = auth;
        this.level = level;
    }
}
