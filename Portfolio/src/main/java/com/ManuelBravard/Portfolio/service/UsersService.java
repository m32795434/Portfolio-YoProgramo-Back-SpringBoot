package com.ManuelBravard.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelBravard.Portfolio.model.UpdateUserAndPassObj;
import com.ManuelBravard.Portfolio.model.User;
import com.ManuelBravard.Portfolio.repository.UsersRepository;

@Service
public class UsersService implements IUsersService {

    @Autowired
    public UsersRepository userRepo;

    @Override
    public boolean checkAuth(User user) {
        User resp = userRepo.findById(user.getId()).orElse(null);
        if (resp.getUserName().equals(user.getUserName()) && resp.getUserPass().equals(user.getUserPass())
                && resp.getLevel().equals(user.getLevel())) {
            return true;
        }
        return false;
    }

    @Override
    public void saveUser(UpdateUserAndPassObj user) {
        User tempUser = userRepo.findById(user.getId()).orElse(null);
        tempUser.setUserName(user.getUserName());
        tempUser.setUserPass(user.getUserPass());
        userRepo.save(tempUser);
    }

}
