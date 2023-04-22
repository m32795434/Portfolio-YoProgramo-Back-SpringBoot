package com.ManuelBravard.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelBravard.Portfolio.model.User;
import com.ManuelBravard.Portfolio.repository.UsersRepository;

@Service
public class UsersService implements IUsersService {

    @Autowired
    public UsersRepository userRepo;

    @Override
    public List<User> returnAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void saveUsers(List<User> users) {
        for (User user : users) {
            User tempUser = new User(user.getId(), user.getUserName(), user.getUserPass());
            userRepo.save(tempUser);
        }
    }

}
