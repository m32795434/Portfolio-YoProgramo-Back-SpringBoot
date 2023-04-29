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
@Table(name = "homecard")
public class HomeCard implements Cloneable {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Min(value = 1, message = "The card id should be greater than 0")
    @Max(value = 9, message = "The card id should be lower than 9")
    private Integer id;

    @Column(columnDefinition = "text")
    private String phEs;

    @Column(columnDefinition = "text")
    private String phEn;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Section_id", nullable = false)
    private Section section;

    public HomeCard() {
    }

    public HomeCard(Integer id, String en, String es, Section section) {
        this.id = id;
        this.phEn = en;
        this.phEs = es;
        this.section = section;
    }

    @Override
    public HomeCard clone() {
        try {
            return (HomeCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Unable to clone HomeCard", e);
        }
    }

}
