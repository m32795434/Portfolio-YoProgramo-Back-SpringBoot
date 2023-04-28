package com.ManuelBravard.Portfolio.model;

import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Setter
@Getter
@Entity
@Table(name = "section")
public class Section {
    @Id
    // Because I have 5 sections, and maybe will be another more, but not hundred of
    // sections, I decided to use string ids!😃
    // It's more transparent, ease-to-read, and ease-to-code this way in the
    // frontend (Using typescript I think it's secure)

    @Column(nullable = false, length = 20)
    @Size(min = 1, max = 20)
    private String id;

    @Column(length = 150)
    @Size(max = 150)
    private String imgMobile;

    @Column(length = 150)
    @Size(max = 150)
    private String imgDesktop;

    @Column(length = 200)
    @Size(max = 200)
    private String en;

    @Column(length = 200)
    @Size(max = 200)
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
