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
    private String vmp4Src;
    private String vwebSrc;
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
    private String codeUrl;
    private String deployUrl;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id")
    private Section section;

    public ProjectsCard() {
    }

    public ProjectsCard(String id, String vwebSrc, String vmp4Src, String phEs,
            String phEn, String h2En, String h2Es, Section section, int startDateYear,
            int startDateMonth, int startDateDay, int endDateYear, int endDateMonth, int endDateDay, String codeUrl,
            String deployUrl) {
        this.id = id;
        this.vwebSrc = vwebSrc;
        this.vmp4Src = vmp4Src;
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
        this.codeUrl = codeUrl;
        this.deployUrl = deployUrl;
    }
}
