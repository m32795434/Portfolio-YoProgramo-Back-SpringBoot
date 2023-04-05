package com.ManuelBravard.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.model.SkillsCard;
import com.ManuelBravard.Portfolio.repository.ExperienceCardRepository;
import com.ManuelBravard.Portfolio.repository.HomeCardRepository;
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

    // @Override
    // public void updateExperienceCard(ExperienceCard card) {
    // experienceRepo.save(card);
    // }

    @Override
    public void deleteExperienceCard(String id) {
        experienceRepo.deleteById(id);
    }

    @Override
    public List<HomeCard> returnAllHomeCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnHomeCards'");
    }

    @Override
    public HomeCard returnHomeCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnHomeCard'");
    }

    @Override
    public void createHomeCard(HomeCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveHomeCard'");
    }

    @Override
    public void udpateHomeCard(HomeCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'udpateHomeCard'");
    }

    @Override
    public void deleteHomeCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteHomeCard'");
    }

    @Override
    public List<QPDCard> returnAllQPDCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnQPDCards'");
    }

    @Override
    public QPDCard returnQPDCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnQPDCard'");
    }

    @Override
    public void createQPDCard(QPDCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveQPDCard'");
    }

    @Override
    public void updateQPDCard(QPDCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateQPDCard'");
    }

    @Override
    public void deleteQPDCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteQPDCard'");
    }

    @Override
    public SkillsCard returnSkillsCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnSkillsCard'");
    }

    @Override
    public List<SkillsCard> returnAllSkillsCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnSkillsCards'");
    }

    @Override
    public void createSkillsCard(SkillsCard card) {
        Section section = secRepo.findById("skills").orElse(null);
        SkillsCard skillsCard = new SkillsCard(card.getId(), card.getImgSrc(), card.getImgAltEs(), card.getImgAltEn(),
                card.getValue(), card.getBkColor(),
                card.getOutStrokeColor(), section);
        // section.getSkillsCards().add(skillsCard);
        SkillsRepo.save(skillsCard);
        // secRepo.save(section);
    }

    @Override
    public void updateSkillsCard(SkillsCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSkillsCard'");
    }

    @Override
    public void deleteSkillsCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSkillsCard'");
    }

}
