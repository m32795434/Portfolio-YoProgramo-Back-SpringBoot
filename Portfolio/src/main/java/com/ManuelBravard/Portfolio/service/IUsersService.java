package com.ManuelBravard.Portfolio.service;

import java.util.List;

import com.ManuelBravard.Portfolio.model.User;

public interface IUsersService {
    public List<User> returnAllUsers();

    public void saveUsers(List<User> users);
}
