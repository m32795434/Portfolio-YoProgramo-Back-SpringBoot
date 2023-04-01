package com.ManuelBravard.Portfolio.service;

import java.util.List;

import com.ManuelBravard.Portfolio.model.Section;

public interface ISectionService {
    public List<Section> returnSections();

    public void addSection(Section sec);

    public void deleteSection(String id);

    public Section returnSection(String id);
}
