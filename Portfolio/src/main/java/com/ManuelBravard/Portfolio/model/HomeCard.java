package com.ManuelBravard.Portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "homecard")
public class HomeCard {
    @Id
    private String id;
    private String phEs;
    private String phEn;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id")
    private Section section;

    public HomeCard() {
    }

    public HomeCard(String id, String en, String es, Section section) {
        this.id = id;
        this.phEn = en;
        this.phEs = es;
        this.section = section;
    }

}
