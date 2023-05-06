package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManuelBravard.Portfolio.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
