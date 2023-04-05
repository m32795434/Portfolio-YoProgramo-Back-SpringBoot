package com.ManuelBravard.Portfolio.service;

import java.util.List;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.SkillsCard;

public interface ICardService {

    // public Section returnSection(String id);
    public List<ExperienceCard> returnAllExperienceCards();

    public ExperienceCard returnExperienceCard(String id);

    public void saveExperienceCard(ExperienceCard card);

    public void deleteExperienceCard(String id);

    public List<HomeCard> returnAllHomeCards();

    public void saveHomeCard(HomeCard card);

    public void deleteHomeCard(String id);

    public HomeCard returnHomeCard(String id);

    public List<QPDCard> returnAllQPDCards();

    public void saveQPDCard(QPDCard card);

    public void deleteQPDCard(String id);

    public QPDCard returnQPDCard(String id);

    public List<SkillsCard> returnAllSkillsCards();

    public SkillsCard returnSkillsCard(String id);

    public void saveSkillsCard(SkillsCard card);

    public void deleteSkillsCard(String id);

}
