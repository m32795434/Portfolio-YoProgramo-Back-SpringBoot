package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ManuelBravard.Portfolio.model.QPDCard;

@Repository
public interface QPDCardRepository extends JpaRepository<QPDCard, String> {

}
