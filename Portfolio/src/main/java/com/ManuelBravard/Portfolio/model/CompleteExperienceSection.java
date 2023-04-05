package com.ManuelBravard.Portfolio.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompleteExperienceSection {
    private Section section;
    private List<ExperienceCard> experienceCardList;

    public CompleteExperienceSection(Section section, List<ExperienceCard> experienceCardList) {
        this.section = section;
        this.experienceCardList = experienceCardList;
    }
}
