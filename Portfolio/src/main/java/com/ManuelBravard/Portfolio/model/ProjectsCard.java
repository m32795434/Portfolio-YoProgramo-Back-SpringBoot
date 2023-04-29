package com.ManuelBravard.Portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "projectscard")
public class ProjectsCard implements Cloneable {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Min(value = 1, message = "The card id should be greater than 0")
    @Max(value = 9, message = "The card id should be lower than 9")
    private Integer id;

    @Column(length = 150)
    @Size(max = 150)
    private String vmp4Src;

    @Column(length = 150)
    @Size(max = 150)
    private String vwebSrc;

    @Column(nullable = false)
    @Min(value = 2010)
    private int startDateYear;

    @Column(nullable = false)
    @Min(value = 1)
    private int startDateMonth;

    @Column(nullable = false)
    @Min(value = 1)
    private int startDateDay;

    private int endDateYear;
    private int endDateMonth;
    private int endDateDay;

    @Column(columnDefinition = "text")
    private String phEs;

    @Column(columnDefinition = "text")
    private String phEn;

    @Column(length = 100)
    @Size(max = 100)
    private String h2En;

    @Column(length = 100)
    @Size(max = 100)
    private String h2Es;

    @Column(length = 150)
    @Size(max = 150)
    private String codeUrl;

    @Column(length = 150)
    @Size(max = 150)
    private String deployUrl;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id", nullable = false)
    private Section section;

    public ProjectsCard() {
    }

    public ProjectsCard(Integer id, String vwebSrc, String vmp4Src, String phEs,
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

    @Override
    public ProjectsCard clone() {
        try {
            return (ProjectsCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Unable to clone ProjectsCard", e);
        }
    }
}
