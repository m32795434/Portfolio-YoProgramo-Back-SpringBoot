package com.ManuelBravard.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "homecard")
public class HomeCard {
    @Id
    private String id;
    private String en;
    private String es;

    public HomeCard(String id, String en, String es) {
        this.id = id;
        this.en = en;
        this.es = es;
    }

}
