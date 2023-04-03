package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ManuelBravard.Portfolio.model.SkillsCard;

@Repository
public interface SkillsCardRepository extends JpaRepository<SkillsCard, String> {

}
