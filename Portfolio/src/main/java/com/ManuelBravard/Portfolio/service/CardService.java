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

    // ------------------------------//FALTAN LOS OTROS!!!!!!!
    @Override
    public void deleteExperienceCard(Integer id) {
        // experienceRepo.deleteById(id);
        ExperienceCard cardToDelete = experienceRepo.findById(id).orElse(null);
        if (cardToDelete == null) {
            return;
        }
        experienceRepo.delete(cardToDelete);// 4-1=3
        // APPLY THIS TO OTHERS!
        List<ExperienceCard> cardsToUpdate = experienceRepo.findAll();// 3
        int size = cardsToUpdate.size();// 3 items, maxindex=2
        for (int i = id; i < size + 1; i++) {// si eliminamos la 2. arranca i=2 // i=3
            // if (card.getId() > id) {
            ExperienceCard copy = cardsToUpdate.get(i - 1).clone();// card3, index=1// card4, i=2
            copy.setId(i);// 2 //3
            experienceRepo.save(copy);
            // }
            if (i == size) {// 3
                ExperienceCard cardToDelete2 = experienceRepo.findById(i + 1).orElse(null);// 4
                if (cardToDelete2 == null) {
                    return;
                }
                experienceRepo.delete(cardToDelete2);
            }
        }
        // for (int index = 0; index < size; index++) {
        // ExperienceCard tempCard = cardsToUpdate .get(index);
        // tempCard.setId(index + 1);
        // experienceRepo.save(tempCard);
        // }
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
        homeRepo.deleteById(id);
        List<HomeCard> expCardArray = homeRepo.findAll();
        int size = expCardArray.size();
        for (int index = 0; index < size; index++) {
            HomeCard tempCard = expCardArray.get(index);
            tempCard.setId(index + 1);
            homeRepo.save(tempCard);
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
        qPDRepo.deleteById(id);
        List<QPDCard> expCardArray = qPDRepo.findAll();
        int size = expCardArray.size();
        for (int index = 0; index < size; index++) {
            QPDCard tempCard = expCardArray.get(index);
            tempCard.setId(index + 1);
            qPDRepo.save(tempCard);
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
        SkillsRepo.deleteById(id);
        List<SkillsCard> expCardArray = SkillsRepo.findAll();
        int size = expCardArray.size();
        for (int index = 0; index < size; index++) {
            SkillsCard tempCard = expCardArray.get(index);
            tempCard.setId(index + 1);
            SkillsRepo.save(tempCard);
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
        projectsRepo.deleteById(id);
        List<ProjectsCard> expCardArray = projectsRepo.findAll();
        int size = expCardArray.size();
        for (int index = 0; index < size; index++) {
            ProjectsCard tempCard = expCardArray.get(index);
            tempCard.setId(index + 1);
            projectsRepo.save(tempCard);
        }
    }

}
