package com.ManuelBravard.Portfolio.model;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class Section {
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
