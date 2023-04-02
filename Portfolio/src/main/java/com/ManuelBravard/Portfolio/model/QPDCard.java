package com.ManuelBravard.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "qpdcard")
public class QPDCard {
    @Id
    private String id;
    private String imgSrc;
    private String imgAlt;
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
    private String sectionId;

    public QPDCard(String id, String imgSrc, String imgAlt, int startDateYear,
            int startDateMonth, int startDateDay, int endDateYear, int endDateMonth, int endDateDay, String phEs,
            String phEn, String h2En, String h2Es, String sectionId) {
        this.id = id;
        this.imgSrc = imgSrc;
        this.imgAlt = imgAlt;
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
        this.sectionId = sectionId;
    }
}
