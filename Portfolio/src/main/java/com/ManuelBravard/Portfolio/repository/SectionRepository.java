package com.ManuelBravard.Portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManuelBravard.Portfolio.model.Section;

// @Repository
public interface SectionRepository extends JpaRepository<Section, String> {

}
