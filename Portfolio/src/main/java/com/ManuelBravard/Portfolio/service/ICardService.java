package com.ManuelBravard.Portfolio.service;

import java.util.List;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.SkillsCard;

public interface ICardService {

    // public Section returnSection(String id);
    public List<ExperienceCard> returnAllExperienceCards();

    public List<HomeCard> returnAllHomeCards();

    public List<QPDCard> returnAllQPDCards();

    public List<SkillsCard> returnAllSkillsCards();

    public void saveExperienceCard(ExperienceCard card);

    public void saveHomeCard(HomeCard card);

    public void saveQPDCard(QPDCard card);

    public void saveSkillsCard(SkillsCard sec);

    public void deleteExperienceCard(String id);

    public void deleteHomeCard(String id);

    public void deleteQPDCard(String id);

    public void deleteSkillsCard(String id);

    public ExperienceCard returnExperienceCard(String id);

    public HomeCard returnHomeCard(String id);

    public QPDCard returnQPDCard(String id);

    public ExperienceCard returnSkillsCard(String id);
}
