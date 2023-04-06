package com.ManuelBravard.Portfolio.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompleteQPDSection {
    private Section section;
    private List<QPDCard> qPDCardList;

    public CompleteQPDSection(Section section, List<QPDCard> qPDCardList) {
        this.section = section;
        this.qPDCardList = qPDCardList;
    }
}
