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

import com.ManuelBravard.Portfolio.model.CompleteExperienceSection;
import com.ManuelBravard.Portfolio.model.CompleteHomeSection;
import com.ManuelBravard.Portfolio.model.CompleteProjectsSection;
import com.ManuelBravard.Portfolio.model.CompleteQPDSection;
import com.ManuelBravard.Portfolio.model.CompleteSkillsSection;
import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.ProjectsCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
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
    @PostMapping("/new/section")
    public void createSection(@RequestBody Section sec) {
        sectionServ.saveSection(sec);
    }

    @PutMapping("/update/section")
    public void updateSection(@RequestBody Section sec) {
        sectionServ.saveSection(sec);
    }

    @DeleteMapping("/delete/section/{id}")
    public void deleteSection(@PathVariable String id) {
        sectionServ.deleteSection(id);
    }

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

    @GetMapping("/completeHomeSection")
    @ResponseBody
    public CompleteHomeSection returnCompleteHomeSection() {
        Section section = sectionServ.returnSection("home");
        List<HomeCard> cardList = cardServ.returnAllHomeCards();
        CompleteHomeSection completeSec = new CompleteHomeSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/completeExperienceSection")
    @ResponseBody
    public CompleteExperienceSection returnCompleteExperienceSection() {
        Section section = sectionServ.returnSection("experience");
        List<ExperienceCard> cardList = cardServ.returnAllExperienceCards();
        CompleteExperienceSection completeSec = new CompleteExperienceSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/completeQPDSection")
    @ResponseBody
    public CompleteQPDSection returnCompleteQPDSection() {
        Section section = sectionServ.returnSection("qPD");
        List<QPDCard> cardList = cardServ.returnAllQPDCards();
        CompleteQPDSection completeSec = new CompleteQPDSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/completeSkillsSection")
    @ResponseBody
    public CompleteSkillsSection returnCompleteSkillsSection() {
        Section section = sectionServ.returnSection("skills");
        List<SkillsCard> cardList = cardServ.returnAllSkillsCards();
        CompleteSkillsSection completeSec = new CompleteSkillsSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/completeProjectsSection")
    @ResponseBody
    public CompleteProjectsSection returnCompleteProjectsSection() {
        Section section = sectionServ.returnSection("projects");
        List<ProjectsCard> cardList = cardServ.returnAllProjectsCards();
        CompleteProjectsSection completeSec = new CompleteProjectsSection(section, cardList);
        return completeSec;
    }

    // ExperienceCard
    @PostMapping("/new/experienceCard")
    public void createExperienceCard(@RequestBody ExperienceCard card) {
        cardServ.saveExperienceCard(card);
    }

    @PutMapping("/update/ExperienceCard")
    public void updateExperienceCard(@RequestBody ExperienceCard card) {
        cardServ.saveExperienceCard(card);
    }

    @DeleteMapping("/delete/experienceCard/{id}")
    public void deleteExperienceCard(@PathVariable String id) {
        cardServ.deleteExperienceCard(id);
    }

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

    // SkillsCard
    @PostMapping("/new/skillsCard")
    public void createSkillsCard(@RequestBody SkillsCard card) {
        cardServ.saveSkillsCard(card);
    }

    @PutMapping("/update/skillsCard")
    public void updateSkillsCard(@RequestBody SkillsCard card) {
        cardServ.saveSkillsCard(card);
    }

    @DeleteMapping("/delete/skillsCard/{id}")
    public void deleteSkillsCard(@PathVariable String id) {
        cardServ.deleteSkillsCard(id);
    }

    @GetMapping("/allSkillsCards")
    @ResponseBody
    public List<SkillsCard> returnAllSkillsCards() {
        return cardServ.returnAllSkillsCards();
    }

    @GetMapping("/skillsCard/{id}")
    @ResponseBody
    public SkillsCard returnSkillsCard(@PathVariable String id) {
        return cardServ.returnSkillsCard(id);
    }

    // homeCard

    @PostMapping("/new/homeCard")
    public void createHomeCard(@RequestBody HomeCard card) {
        cardServ.saveHomeCard(card);
    }

    @PutMapping("/update/homeCard")
    public void updateHomeCard(@RequestBody HomeCard card) {
        cardServ.saveHomeCard(card);
    }

    @DeleteMapping("/delete/homeCard/{id}")
    public void deleteHomeCard(@PathVariable String id) {
        cardServ.deleteHomeCard(id);
    }

    @GetMapping("/allHomeCards")
    @ResponseBody
    public List<HomeCard> returnAllHomeCards() {
        return cardServ.returnAllHomeCards();
    }

    @GetMapping("/homeCard/{id}")
    @ResponseBody
    public HomeCard returnHomeCard(@PathVariable String id) {
        return cardServ.returnHomeCard(id);
    }

    // QPDCard
    @PostMapping("/new/qPDCard")
    public void createQPDCard(@RequestBody QPDCard card) {
        cardServ.saveQPDCard(card);
    }

    @PutMapping("/update/qPDCard")
    public void updateQPDCard(@RequestBody QPDCard card) {
        cardServ.saveQPDCard(card);
    }

    @DeleteMapping("/delete/qPDCard/{id}")
    public void deleteQPDCard(@PathVariable String id) {
        cardServ.deleteQPDCard(id);
    }

    @GetMapping("/allQPDCards")
    @ResponseBody
    public List<QPDCard> returnAllQPDCards() {
        return cardServ.returnAllQPDCards();
    }

    @GetMapping("/qPDCard/{id}")
    @ResponseBody
    public QPDCard returnQPDCard(@PathVariable String id) {
        return cardServ.returnQPDCard(id);
    }

    // PROJECTS
    @PostMapping("/new/projectsCard")
    public void createProjectsCard(@RequestBody ProjectsCard card) {
        cardServ.saveProjectsCard(card);
    }

    @PutMapping("/update/ProjectsCard")
    public void updateProjectsCard(@RequestBody ProjectsCard card) {
        cardServ.saveProjectsCard(card);
    }

    @DeleteMapping("/delete/ProjectsCard/{id}")
    public void deleteProjectsCard(@PathVariable String id) {
        cardServ.deleteProjectsCard(id);
    }

    @GetMapping("/allProjectsCards")
    @ResponseBody
    public List<ProjectsCard> returnAllProjectsCards() {
        return cardServ.returnAllProjectsCards();
    }

    @GetMapping("/ProjectsCard/{id}")
    @ResponseBody
    public ProjectsCard returnProjectsCard(@PathVariable String id) {
        return cardServ.returnProjectsCard(id);
    }
}
