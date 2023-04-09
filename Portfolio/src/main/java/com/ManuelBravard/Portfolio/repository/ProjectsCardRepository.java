package com.ManuelBravard.Portfolio.repository;

import com.ManuelBravard.Portfolio.model.ProjectsCard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsCardRepository extends JpaRepository<ProjectsCard, String> {

}
