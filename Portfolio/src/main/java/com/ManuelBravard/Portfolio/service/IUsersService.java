package com.ManuelBravard.Portfolio.service;

import com.ManuelBravard.Portfolio.model.UpdateUserAndPassObj;
import com.ManuelBravard.Portfolio.model.Users;

public interface IUsersService {
    public boolean checkAuth(Users user);

    // public void saveUser(UpdateUserAndPassObj user);
}
