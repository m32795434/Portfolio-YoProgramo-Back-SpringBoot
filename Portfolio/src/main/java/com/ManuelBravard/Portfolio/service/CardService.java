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
    public ExperienceCard returnExperienceCard(Integer id) {
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
    public void deleteExperienceCard(Integer id) {
        ExperienceCard cardToDelete = experienceRepo.findById(id).orElse(null);
        if (cardToDelete == null) {
            return;
        }
        experienceRepo.delete(cardToDelete);// 4-1=3
        List<ExperienceCard> cardsToUpdate = experienceRepo.findAll();// 3
        int size = cardsToUpdate.size();// 3 items, maxindex=2
        for (int i = id; i < size + 1; i++) {// si eliminamos la 2. arranca i=2 // i=3
            ExperienceCard copy = cardsToUpdate.get(i - 1).clone();// card3, index=1// card4, i=2
            copy.setId(i);// 2 //3
            experienceRepo.save(copy);
            if (i == size) {// 3
                experienceRepo.deleteById(i + 1);// 4
            }
        }
    }

    @Override
    public List<HomeCard> returnAllHomeCards() {
        return homeRepo.findAll();
    }

    @Override
    public HomeCard returnHomeCard(Integer id) {
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
    public void deleteHomeCard(Integer id) {
        HomeCard cardToDelete = homeRepo.findById(id).orElse(null);
        if (cardToDelete == null) {
            return;
        }
        homeRepo.delete(cardToDelete);// 4-1=3
        List<HomeCard> cardsToUpdate = homeRepo.findAll();// 3
        int size = cardsToUpdate.size();// 3 items, maxindex=2
        for (int i = id; i < size + 1; i++) {// si eliminamos la 2. arranca i=2 // i=3
            HomeCard copy = cardsToUpdate.get(i - 1).clone();// card3, index=1// card4, i=2
            copy.setId(i);// 2 //3
            homeRepo.save(copy);
            if (i == size) {// 3
                homeRepo.deleteById(i + 1);// 4
            }
        }
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
    public void deleteQPDCard(Integer id) {
        QPDCard cardToDelete = qPDRepo.findById(id).orElse(null);
        if (cardToDelete == null) {
            return;
        }
        qPDRepo.delete(cardToDelete);// 4-1=3
        List<QPDCard> cardsToUpdate = qPDRepo.findAll();// 3
        int size = cardsToUpdate.size();// 3 items, maxindex=2
        for (int i = id; i < size + 1; i++) {// si eliminamos la 2. arranca i=2 // i=3
            QPDCard copy = cardsToUpdate.get(i - 1).clone();// card3, index=1// card4, i=2
            copy.setId(i);// 2 //3
            qPDRepo.save(copy);
            if (i == size) {// 3
                qPDRepo.deleteById(i + 1);// 4
            }
        }
    }

    @Override
    public List<QPDCard> returnAllQPDCards() {
        return qPDRepo.findAll();
    }

    @Override
    public QPDCard returnQPDCard(Integer id) {
        return qPDRepo.findById(id).orElse(null);
    }

    @Override
    public SkillsCard returnSkillsCard(Integer id) {
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
    public void deleteSkillsCard(Integer id) {
        SkillsCard cardToDelete = SkillsRepo.findById(id).orElse(null);
        if (cardToDelete == null) {
            return;
        }
        SkillsRepo.delete(cardToDelete);// 4-1=3
        List<SkillsCard> cardsToUpdate = SkillsRepo.findAll();// 3
        int size = cardsToUpdate.size();// 3 items, maxindex=2
        for (int i = id; i < size + 1; i++) {// si eliminamos la 2. arranca i=2 // i=3
            SkillsCard copy = cardsToUpdate.get(i - 1).clone();// card3, index=1// card4, i=2
            copy.setId(i);// 2 //3
            SkillsRepo.save(copy);
            if (i == size) {// 3
                SkillsRepo.deleteById(i + 1);// 4
            }
        }
    }

    @Override
    public List<ProjectsCard> returnAllProjectsCards() {
        return projectsRepo.findAll();
    }

    @Override
    public ProjectsCard returnProjectsCard(Integer id) {
        return projectsRepo.findById(id).orElse(null);
    }

    @Override
    public void saveProjectsCard(ProjectsCard card) {
        Section section = secRepo.findById("projects").orElse(null);
        ProjectsCard projectsCard = new ProjectsCard(card.getId(), card.getVwebSrc(), card.getVmp4Src(), card.getPhEs(),
                card.getPhEn(), card.getH2En(), card.getH2Es(),
                section, card.getStartDateYear(), card.getStartDateMonth(), card.getStartDateDay(),
                card.getEndDateYear(), card.getEndDateMonth(), card.getEndDateDay(), card.getCodeUrl(),
                card.getDeployUrl());
        projectsRepo.save(projectsCard);
    }

    @Override
    public void deleteProjectsCard(Integer id) {
        ProjectsCard cardToDelete = projectsRepo.findById(id).orElse(null);
        if (cardToDelete == null) {
            return;
        }
        projectsRepo.delete(cardToDelete);// 4-1=3
        List<ProjectsCard> cardsToUpdate = projectsRepo.findAll();// 3
        int size = cardsToUpdate.size();// 3 items, maxindex=2
        for (int i = id; i < size + 1; i++) {// si eliminamos la 2. arranca i=2 // i=3
            ProjectsCard copy = cardsToUpdate.get(i - 1).clone();// card3, index=1// card4, i=2
            copy.setId(i);// 2 //3
            projectsRepo.save(copy);
            if (i == size) {// 3
                projectsRepo.deleteById(i + 1);// 4
            }
        }
    }

}
