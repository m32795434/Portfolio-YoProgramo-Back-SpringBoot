package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ManuelBravard.Portfolio.model.HomeCard;

@Repository
public interface HomeCardRepository extends JpaRepository<HomeCard, String> {

}
