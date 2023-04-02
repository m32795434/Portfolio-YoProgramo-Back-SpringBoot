package com.ManuelBravard.Portfolio.model;

import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Setter
@Getter
@Entity
@Table(name = "section")
public class Section {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String imgMobile;
    private String imgDesktop;
    private String en;
    private String es;

    public Section() {
    }

    public Section(String id, String imgMobile, String imgDesktop, String en, String es) {
        this.id = id;
        this.imgMobile = imgMobile;
        this.imgDesktop = imgDesktop;
        this.en = en;
        this.es = es;
    }
}
