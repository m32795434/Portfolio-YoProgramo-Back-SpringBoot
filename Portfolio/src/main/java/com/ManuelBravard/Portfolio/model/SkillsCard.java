package com.ManuelBravard.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "skillscard")
public class SkillsCard {
    private String id;
    private String imgSrc;
    private String imgAltEs;
    private String imgAltEn;
    private int value;
    private String bkColor;
    private String outStrokeColor;

    public SkillsCard(String id, String imgSrc, String imgAltEs, String imgAltEn, int value, String bkColor,
            String outStrokeColor) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAltEs = imgAltEs;
        this.imgAltEn = imgAltEn;
        this.value = value;
        this.bkColor = bkColor;
        this.outStrokeColor = outStrokeColor;
    }
}
