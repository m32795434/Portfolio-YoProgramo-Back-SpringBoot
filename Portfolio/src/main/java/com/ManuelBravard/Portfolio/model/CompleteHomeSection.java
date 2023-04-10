package com.ManuelBravard.Portfolio.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompleteHomeSection {
    private Section section;
    private List<HomeCard> cards;

    public CompleteHomeSection(Section section, List<HomeCard> homeCardList) {
        this.section = section;
        this.cards = homeCardList;
    }
}
