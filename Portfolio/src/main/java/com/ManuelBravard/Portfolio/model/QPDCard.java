package com.ManuelBravard.Portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "qpdcard")
public class QPDCard {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    @Max(value = 10)
    private Integer id;

    private String imgSrc;
    private String imgAltEs;
    private String imgAltEn;
    private int startDateYear;
    private int startDateMonth;
    private int startDateDay;
    private int endDateYear;
    private int endDateMonth;
    private int endDateDay;
    private String phEs;
    private String phEn;
    private String h2En;
    private String h2Es;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id")
    private Section section;

    public QPDCard() {
    }

    public QPDCard(Integer id, String imgSrc, String imgAltEn, String imgAltEs, int startDateYear,
            int startDateMonth, int startDateDay, int endDateYear, int endDateMonth, int endDateDay, String phEs,
            String phEn, String h2En, String h2Es, Section section) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAltEn = imgAltEn;
        this.imgAltEs = imgAltEs;
        this.startDateYear = startDateYear;
        this.startDateMonth = startDateMonth;
        this.startDateDay = startDateDay;
        this.endDateYear = endDateYear;
        this.endDateMonth = endDateMonth;
        this.endDateDay = endDateDay;
        this.phEs = phEs;
        this.phEn = phEn;
        this.h2En = h2En;
        this.h2Es = h2Es;
        this.section = section;
    }
}
