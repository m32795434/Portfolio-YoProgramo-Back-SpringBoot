package com.ManuelBravard.Portfolio.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompleteProjectsSection {
    private Section section;
    private List<ProjectsCard> projectsCardList;

    public CompleteProjectsSection(Section section, List<ProjectsCard> projectsCardList) {
        this.section = section;
        this.projectsCardList = projectsCardList;
    }
}
