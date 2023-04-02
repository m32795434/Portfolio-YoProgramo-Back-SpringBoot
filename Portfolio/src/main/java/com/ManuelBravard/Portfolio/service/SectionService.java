package com.ManuelBravard.Portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.repository.SectionRepository;

@Service
public class SectionService implements ISectionService {

    @Autowired
    public SectionRepository secRepo;

    @Override
    public List<Section> returnSections() {
        // TODO Auto-generated method stub
        return secRepo.findAll();
    }

    @Override
    public void saveSection(Section sec) {
        // TODO Auto-generated method stub
        secRepo.save(sec);
    }

    @Override
    public void deleteSection(String id) {
        // TODO Auto-generated method stub
        secRepo.deleteById(id);
    }

    @Override
    public Section returnSection(String id) {
        // TODO Auto-generated method stub
        return secRepo.findById(id).orElse(null);
    }

}
