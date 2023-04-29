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
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "skillscard")
public class SkillsCard implements Cloneable {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Min(value = 1, message = "The card id should be greater than 0")
    @Max(value = 9, message = "The card id should be lower than 9")
    private Integer id;

    @Column(length = 150)
    @Size(max = 150)
    private String imgSrc;

    @Column(length = 100, nullable = false)
    @Size(max = 100)
    private String imgAltEs;

    @Column(length = 100, nullable = false)
    @Size(max = 100)
    private String imgAltEn;

    @Column(nullable = false)
    @Min(value = 1, message = "The value should be greater than 0")
    @Max(value = 100, message = "The value should be lower than 101")
    private int value;

    @Column(length = 10)
    @Size(max = 10)
    private String bkColor;

    @Column(length = 10)
    @Size(max = 10)
    private String outStrokeColor;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id", nullable = false)
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

    @Override
    public SkillsCard clone() {
        try {
            return (SkillsCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Unable to clone SkillsCard", e);
        }
    }
}
