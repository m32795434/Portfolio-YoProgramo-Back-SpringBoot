package com.ManuelBravard.Portfolio.service;

import java.util.List;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.ProjectsCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.SkillsCard;

public interface ICardService {

    // public Section returnSection(String id);
    public List<ExperienceCard> returnAllExperienceCards();

    public ExperienceCard returnExperienceCard(Integer id);

    public void saveExperienceCard(ExperienceCard card);

    public void deleteExperienceCard(Integer id);

    public List<HomeCard> returnAllHomeCards();

    public void saveHomeCard(HomeCard card);

    public void deleteHomeCard(Integer id);

    public HomeCard returnHomeCard(Integer id);

    public List<QPDCard> returnAllQPDCards();

    public void saveQPDCard(QPDCard card);

    public void deleteQPDCard(Integer id);

    public QPDCard returnQPDCard(Integer id);

    public List<SkillsCard> returnAllSkillsCards();

    public SkillsCard returnSkillsCard(Integer id);

    public void saveSkillsCard(SkillsCard card);

    public void deleteSkillsCard(Integer id);

    public List<ProjectsCard> returnAllProjectsCards();

    public ProjectsCard returnProjectsCard(Integer id);

    public void saveProjectsCard(ProjectsCard card);

    public void deleteProjectsCard(Integer id);

}
