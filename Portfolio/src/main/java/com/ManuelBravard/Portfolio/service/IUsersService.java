package com.ManuelBravard.Portfolio.service;

import com.ManuelBravard.Portfolio.model.UpdateUserAndPassObj;
import com.ManuelBravard.Portfolio.model.User;

public interface IUsersService {
    public boolean checkAuth(User user);

    public void saveUser(UpdateUserAndPassObj user);
}
