package com.ManuelBravard.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String sectionId;

    public SkillsCard(String id, String imgSrc, String imgAltEs, String imgAltEn, int value, String bkColor,
            String outStrokeColor, String sectionId) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAltEs = imgAltEs;
        this.imgAltEn = imgAltEn;
        this.value = value;
        this.bkColor = bkColor;
        this.outStrokeColor = outStrokeColor;
        this.sectionId = sectionId;
    }
}
