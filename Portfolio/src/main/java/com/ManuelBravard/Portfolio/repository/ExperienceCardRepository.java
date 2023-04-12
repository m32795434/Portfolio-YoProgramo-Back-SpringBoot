package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManuelBravard.Portfolio.model.ExperienceCard;

// @Repository
public interface ExperienceCardRepository extends JpaRepository<ExperienceCard, String> {

}
