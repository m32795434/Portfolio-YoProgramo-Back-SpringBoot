package com.ManuelBravard.Portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.model.SkillsCard;
import com.ManuelBravard.Portfolio.service.ICardService;
import com.ManuelBravard.Portfolio.service.ISectionService;

@RestController
public class Controller {
    @Autowired
    private ISectionService sectionServ;
    @Autowired
    private ICardService cardServ;
    // List<Section> sectionList = new ArrayList<Section>();

    // GET
    // @GetMapping("/hola/{name}/{edad}")
    // public String decirHola(@PathVariable String name, @PathVariable int edad) {

    // return "hola " + name + '!' + "tu tienes: " + edad + "años de edad !";
    // }

    // @GetMapping("/")
    // public String sendSection(@RequestParam String section) {
    // return "Section " + section;
    // }

    // SECTIONS
    @GetMapping("/allsections")
    @ResponseBody
    public List<Section> returnAllSections() {
        return sectionServ.returnAllSections();
    }

    @GetMapping("/section/{id}")
    @ResponseBody
    public Section returnSection(@PathVariable String id) {
        return sectionServ.returnSection(id);
    }

    @PostMapping("/new/section")
    public void createSection(@RequestBody Section sec) {
        sectionServ.saveSection(sec);
    }

    @PutMapping("/update/section/")
    public void updateSection(@RequestBody Section sec) {
        sectionServ.saveSection(sec);
    }

    @DeleteMapping("/delete/section/{id}")
    public void deleteSection(@PathVariable String id) {
        sectionServ.deleteSection(id);
    }

    // ExperienceCard
    @GetMapping("/allExperienceCards")
    @ResponseBody
    public List<ExperienceCard> returnAllExperienceCards() {
        return cardServ.returnAllExperienceCards();
    }

    @GetMapping("/experienceCard/{id}")
    @ResponseBody
    public ExperienceCard returnExperienceCard(@PathVariable String id) {
        return cardServ.returnExperienceCard(id);
    }

    @PostMapping("/new/experienceCard")
    public void createExperienceCard(@RequestBody ExperienceCard card) {
        cardServ.createExperienceCard(card);
    }

    @PutMapping("/update/ExperienceCard/")
    public void updateExperienceCard(@RequestBody ExperienceCard card) {
        cardServ.updateExperienceCard(card);
    }

    @DeleteMapping("/delete/experienceCard/{id}")
    public void deleteExperienceCard(@PathVariable String id) {
        cardServ.deleteExperienceCard(id);
    }

    // SkillsCard
    @PostMapping("/new/skillsCard")
    public void createSkillsCard(@RequestBody SkillsCard card) {
        cardServ.createSkillsCard(card);
    }
}
