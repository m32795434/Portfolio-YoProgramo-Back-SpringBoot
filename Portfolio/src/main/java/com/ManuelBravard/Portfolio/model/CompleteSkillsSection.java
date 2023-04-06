package com.ManuelBravard.Portfolio.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompleteSkillsSection {
    private Section section;
    private List<SkillsCard> skillsCardList;

    public CompleteSkillsSection(Section section, List<SkillsCard> skillsCardList) {
        this.section = section;
        this.skillsCardList = skillsCardList;
    }
}
