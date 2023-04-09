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
@Table(name = "projectscard")
public class ProjectsCard {
    @Id
    private String id;
    private String imgSrc;
    private String imgAltEs;
    private String imgAltEn;
    private String phEs;
    private String phEn;
    private String h2En;
    private String h2Es;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id")
    private Section section;

    public ProjectsCard() {
    }

    public ProjectsCard(String id, String imgSrc, String imgAltEn, String imgAltEs, String phEs,
            String phEn, String h2En, String h2Es, Section section) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAltEn = imgAltEn;
        this.imgAltEs = imgAltEs;
        this.phEs = phEs;
        this.phEn = phEn;
        this.h2En = h2En;
        this.h2Es = h2Es;
        this.section = section;
    }
}
