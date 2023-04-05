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
@Table(name = "skillscard")
public class SkillsCard {
    @Id
    private String id;
    private String imgSrc;
    private String imgAltEs;
    private String imgAltEn;
    private int value;
    private String bkColor;
    private String outStrokeColor;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id")
    private Section section;

    public SkillsCard() {
    }

    public SkillsCard(String id, String imgSrc, String imgAltEs, String imgAltEn, int value, String bkColor,
            String outStrokeColor, Section section) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAltEs = imgAltEs;
        this.imgAltEn = imgAltEn;
        this.value = value;
        this.bkColor = bkColor;
        this.outStrokeColor = outStrokeColor;
        this.section = section;
    }
}
