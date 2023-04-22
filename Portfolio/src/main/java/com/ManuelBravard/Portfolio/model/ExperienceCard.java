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
@Table(name = "experiencecard")
public class ExperienceCard {
    // The ids are string type, because in the first version o this app, I used the
    // alements'
    // "contentEditable" atts, to update the content, and I used to reference/link
    // them with a button'data-set-id which matched with the element(p-h1-h2)'id
    // and, it
    // was better to do this if the id was a string. Otherwise it was uggly to read
    // and code in the frontend. (I start to code this app in Vanilla Js.)I have
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
    @JsonIgnore
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
