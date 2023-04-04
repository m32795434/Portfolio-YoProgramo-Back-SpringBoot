package com.ManuelBravard.Portfolio.model;

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
@Table(name = "experiencecard")
public class ExperienceCard {
    @Id
    private String id;
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
    @ManyToOne
    @JoinColumn(name = "Section_id")
    private Section section;

    public ExperienceCard() {
    }

    public ExperienceCard(String id, String imgSrc, String imgAltEs, String imgAltEn, int startDateYear,
            int startDateMonth, int startDateDay, int endDateYear, int endDateMonth, int endDateDay, String phEs,
            String phEn, Section section) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAltEs = imgAltEs;
        this.imgAltEn = imgAltEn;
        this.startDateYear = startDateYear;
        this.startDateMonth = startDateMonth;
        this.startDateDay = startDateDay;
        this.endDateYear = endDateYear;
        this.endDateMonth = endDateMonth;
        this.endDateDay = endDateDay;
        this.phEs = phEs;
        this.phEn = phEn;
        this.section = section;
    }
}
