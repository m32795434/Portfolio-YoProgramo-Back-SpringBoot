package com.ManuelBravard.Portfolio.model;

import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Setter
@Getter
@Entity
public class Section {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String imgMobile;
    private String imgDesktop;
    private String en;
    private String es;

    public Section(String id, String imgMobile, String imgDesktop, String en, String es) {
        this.id = id;
        this.imgMobile = imgMobile;
        this.imgDesktop = imgDesktop;
        this.en = en;
        this.es = es;
    }
}
