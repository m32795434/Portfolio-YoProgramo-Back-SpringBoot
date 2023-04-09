package com.ManuelBravard.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.ProjectsCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.model.SkillsCard;
import com.ManuelBravard.Portfolio.repository.ExperienceCardRepository;
import com.ManuelBravard.Portfolio.repository.HomeCardRepository;
import com.ManuelBravard.Portfolio.repository.ProjectsCardRepository;
import com.ManuelBravard.Portfolio.repository.QPDCardRepository;
import com.ManuelBravard.Portfolio.repository.SectionRepository;
import com.ManuelBravard.Portfolio.repository.SkillsCardRepository;

@Service
public class CardService implements ICardService {

    @Autowired
    public SectionRepository secRepo;
    @Autowired
    public HomeCardRepository homeRepo;
    @Autowired
    public ExperienceCardRepository experienceRepo;
    @Autowired
    public QPDCardRepository qPDRepo;
    @Autowired
    public SkillsCardRepository SkillsRepo;
    @Autowired
    public ProjectsCardRepository projectsRepo;

    @Override
    public List<ExperienceCard> returnAllExperienceCards() {
        return experienceRepo.findAll();
    }

    @Override
    public ExperienceCard returnExperienceCard(String id) {
        return experienceRepo.findById(id).orElse(null);
    }

    @Override
    public void saveExperienceCard(ExperienceCard card) {
        Section section = secRepo.findById("experience").orElse(null);
        ExperienceCard experienceCard = new ExperienceCard(card.getId(), card.getImgSrc(), card.getImgAltEs(),
                card.getImgAltEn(), card.getStartDateYear(), card.getStartDateMonth(), card.getStartDateDay(),
                card.getEndDateYear(), card.getEndDateMonth(), card.getEndDateDay(), card.getPhEs(), card.getPhEn(),
                section);
        experienceRepo.save(experienceCard);
    }

    @Override
    public void deleteExperienceCard(String id) {
        experienceRepo.deleteById(id);
    }

    @Override
    public List<HomeCard> returnAllHomeCards() {
        return homeRepo.findAll();
    }

    @Override
    public HomeCard returnHomeCard(String id) {
        return homeRepo.findById(id).orElse(null);
    }

    @Override
    public void saveHomeCard(HomeCard card) {
        Section section = secRepo.findById("home").orElse(null);
        HomeCard homeCard = new HomeCard(card.getId(), card.getPhEn(), card.getPhEs(),
                section);
        homeRepo.save(homeCard);
    }

    @Override
    public void deleteHomeCard(String id) {
        homeRepo.deleteById(id);
    }

    @Override
    public void saveQPDCard(QPDCard card) {
        Section section = secRepo.findById("qPD").orElse(null);
        QPDCard qPDCard = new QPDCard(card.getId(), card.getImgSrc(), card.getImgAltEn(), card.getImgAltEs(),
                card.getStartDateYear(),
                card.getStartDateMonth(), card.getStartDateDay(),
                card.getEndDateYear(), card.getEndDateMonth(), card.getEndDateDay(), card.getPhEs(), card.getPhEn(),
                card.getH2En(), card.getH2Es(),
                section);
        qPDRepo.save(qPDCard);
    }

    @Override
    public void deleteQPDCard(String id) {
        qPDRepo.deleteById(id);
    }

    @Override
    public List<QPDCard> returnAllQPDCards() {
        return qPDRepo.findAll();
    }

    @Override
    public QPDCard returnQPDCard(String id) {
        return qPDRepo.findById(id).orElse(null);
    }

    @Override
    public SkillsCard returnSkillsCard(String id) {
        return SkillsRepo.findById(id).orElse(null);
    }

    @Override
    public List<SkillsCard> returnAllSkillsCards() {
        return SkillsRepo.findAll();
    }

    @Override
    public void saveSkillsCard(SkillsCard card) {
        Section section = secRepo.findById("skills").orElse(null);
        SkillsCard skillsCard = new SkillsCard(card.getId(), card.getImgSrc(), card.getImgAltEs(), card.getImgAltEn(),
                card.getValue(), card.getBkColor(),
                card.getOutStrokeColor(), section);
        SkillsRepo.save(skillsCard);
    }

    @Override
    public void deleteSkillsCard(String id) {
        SkillsRepo.deleteById(id);
    }

    @Override
    public List<ProjectsCard> returnAllProjectsCards() {
        return projectsRepo.findAll();
    }

    @Override
    public ProjectsCard returnProjectsCard(String id) {
        return projectsRepo.findById(id).orElse(null);
    }

    @Override
    public void saveProjectsCard(ProjectsCard card) {
        Section section = secRepo.findById("projects").orElse(null);
        ProjectsCard projectsCard = new ProjectsCard(card.getId(), card.getImgSrc(),
                card.getImgAltEn(), card.getImgAltEs(), card.getPhEs(), card.getPhEn(), card.getH2En(), card.getH2Es(),
                section);
        projectsRepo.save(projectsCard);
    }

    @Override
    public void deleteProjectsCard(String id) {
        projectsRepo.deleteById(id);
    }

}
