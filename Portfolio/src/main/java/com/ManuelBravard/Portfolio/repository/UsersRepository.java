package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManuelBravard.Portfolio.model.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
