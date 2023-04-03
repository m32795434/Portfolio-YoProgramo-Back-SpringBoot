package com.ManuelBravard.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.SkillsCard;
import com.ManuelBravard.Portfolio.repository.ExperienceCardRepository;
import com.ManuelBravard.Portfolio.repository.HomeCardRepository;
import com.ManuelBravard.Portfolio.repository.QPDCardRepository;
import com.ManuelBravard.Portfolio.repository.SkillsCardRepository;

@Service
public class CardService implements ICardService {

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
        experienceRepo.save(card);
    }

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
    public void saveHomeCard(HomeCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveHomeCard'");
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
    public void saveQPDCard(QPDCard card) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveQPDCard'");
    }

    @Override
    public void deleteQPDCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteQPDCard'");
    }

    @Override
    public ExperienceCard returnSkillsCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnSkillsCard'");
    }

    @Override
    public List<SkillsCard> returnAllSkillsCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnSkillsCards'");
    }

    @Override
    public void saveSkillsCard(SkillsCard sec) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveSkillsCard'");
    }

    @Override
    public void deleteSkillsCard(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSkillsCard'");
    }

}
