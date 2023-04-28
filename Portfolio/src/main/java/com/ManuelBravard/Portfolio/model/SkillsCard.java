package com.ManuelBravard.Portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "skillscard")
public class SkillsCard {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 1)
    @Min(value = 1, message = "The card id should be greater than 0")
    @Max(value = 9, message = "The card id should be lower than 9")
    private Integer id;

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

    public SkillsCard(Integer id, String imgSrc, String imgAltEs, String imgAltEn, int value, String bkColor,
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
