package com.ManuelBravard.Portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.repository.SectionRepository;

public class SectionService implements ISectionService {

    @Autowired
    public SectionRepository secRepo;

    // 1.23.34
    @Override
    public List<Section> returnSections() {
        // TODO Auto-generated method stub
        return secRepo.findAll();
    }

    @Override
    public void addSection(Section sec) {
        // TODO Auto-generated method stub
        secRepo.save(sec);
    }

    @Override
    public void deleteSection(String id) {
        // TODO Auto-generated method stub
        secRepo.deleteById(id);
    }

    @Override
    public Optional<Section> returnSection(String id) {
        // TODO Auto-generated method stub
        return secRepo.findById(id);
    }
    // 1.29
}
