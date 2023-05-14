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
@Table(name = "qpdcard")
public class QPDCard implements Cloneable {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Min(value = 1, message = "The card id should be greater than 0")
    @Max(value = 9, message = "The card id should be lower than 9")
    private Integer id;

    @Column(length = 200)
    @Size(max = 200)
    private String imgSrc;

    @Column(length = 100)
    @Size(max = 100)
    private String imgAltEs;

    @Column(length = 100)
    @Size(max = 100)
    private String imgAltEn;

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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id", nullable = false)
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

    @Override
    public QPDCard clone() {
        try {
            return (QPDCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Unable to clone QPDCard", e);
        }
    }
}
