package com.ManuelBravard.Portfolio.security.demo;

import io.swagger.v3.oas.annotations.Hidden;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.ProjectsCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.SkillsCard;
import com.ManuelBravard.Portfolio.service.ICardService;
import com.ManuelBravard.Portfolio.service.ISectionService;
import com.ManuelBravard.Portfolio.service.IUsersService;

@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @Autowired
    private ISectionService sectionServ;
    @Autowired
    private ICardService cardServ;
    @Autowired
    private IUsersService userServ;

    // ExperienceCard
    @PostMapping("/experience/createCard")
    public void createExperienceCard(@RequestBody ExperienceCard card) {
        cardServ.saveExperienceCard(card);
    }

    @PutMapping("/experience/updateCard")
    public void updateExperienceCard(@RequestBody ExperienceCard card) {
        cardServ.saveExperienceCard(card);
    }

    @DeleteMapping("/experience/deleteCard/{id}")
    public void deleteExperienceCard(@PathVariable Integer id) {
        cardServ.deleteExperienceCard(id);
    }

    @GetMapping("/allExperienceCards")
    @ResponseBody
    public List<ExperienceCard> returnAllExperienceCards() {
        return cardServ.returnAllExperienceCards();
    }

    @GetMapping("/experienceCard/{id}")
    @ResponseBody
    public ExperienceCard returnExperienceCard(@PathVariable Integer id) {
        return cardServ.returnExperienceCard(id);
    }

    // SkillsCard
    @PostMapping("/skills/createCard")
    public void createSkillsCard(@RequestBody SkillsCard card) {
        cardServ.saveSkillsCard(card);
    }

    @PutMapping("/skills/updateCard")
    public void updateSkillsCard(@RequestBody SkillsCard card) {
        cardServ.saveSkillsCard(card);
    }

    @DeleteMapping("/skills/deleteCard/{id}")
    public void deleteSkillsCard(@PathVariable Integer id) {
        cardServ.deleteSkillsCard(id);
    }

    @GetMapping("/allSkillsCards")
    @ResponseBody
    public List<SkillsCard> returnAllSkillsCards() {
        return cardServ.returnAllSkillsCards();
    }

    @GetMapping("/skillsCard/{id}")
    @ResponseBody
    public SkillsCard returnSkillsCard(@PathVariable Integer id) {
        return cardServ.returnSkillsCard(id);
    }

    // homeCard

    @PostMapping("/home/createCard")
    public void createHomeCard(@RequestBody HomeCard card) {
        cardServ.saveHomeCard(card);
    }

    @PutMapping("/home/updateCard")
    public void updateHomeCard(@RequestBody HomeCard card) {
        cardServ.saveHomeCard(card);
    }

    @DeleteMapping("/home/deleteCard/{id}")
    public void deleteHomeCard(@PathVariable Integer id) {
        cardServ.deleteHomeCard(id);
    }

    @GetMapping("/allHomeCards")
    @ResponseBody
    public List<HomeCard> returnAllHomeCards() {
        return cardServ.returnAllHomeCards();
    }

    @GetMapping("/homeCard/{id}")
    @ResponseBody
    public HomeCard returnHomeCard(@PathVariable Integer id) {
        return cardServ.returnHomeCard(id);
    }

    // QPDCard
    @PostMapping("/qPD/createCard")
    public void createQPDCard(@RequestBody QPDCard card) {
        cardServ.saveQPDCard(card);
    }

    @PutMapping("/qPD/updateCard")
    public void updateQPDCard(@RequestBody QPDCard card) {
        cardServ.saveQPDCard(card);
    }

    @DeleteMapping("/qPD/deleteCard/{id}")
    public void deleteQPDCard(@PathVariable Integer id) {
        cardServ.deleteQPDCard(id);
    }

    @GetMapping("/allQPDCards")
    @ResponseBody
    public List<QPDCard> returnAllQPDCards() {
        return cardServ.returnAllQPDCards();
    }

    @GetMapping("/qPDCard/{id}")
    @ResponseBody
    public QPDCard returnQPDCard(@PathVariable Integer id) {
        return cardServ.returnQPDCard(id);
    }

    // PROJECTS
    @PostMapping("/projects/createCard")
    public void createProjectsCard(@RequestBody ProjectsCard card) {
        cardServ.saveProjectsCard(card);
    }

    @PutMapping("/projects/updateCard")
    public void updateProjectsCard(@RequestBody ProjectsCard card) {
        cardServ.saveProjectsCard(card);
    }

    @DeleteMapping("/projects/deleteCard/{id}")
    public void deleteProjectsCard(@PathVariable Integer id) {
        cardServ.deleteProjectsCard(id);
    }

    @GetMapping("/allProjectsCards")
    @ResponseBody
    public List<ProjectsCard> returnAllProjectsCards() {
        return cardServ.returnAllProjectsCards();
    }

    @GetMapping("/ProjectsCard/{id}")
    @ResponseBody
    public ProjectsCard returnProjectsCard(@PathVariable Integer id) {
        return cardServ.returnProjectsCard(id);
    }

}

// SECTIONS

// @PostMapping("/new/section")
// public void createSection(@RequestBody Section sec) {
// sectionServ.saveSection(sec);
// }

// @DeleteMapping("/delete/section/{id}")
// public void deleteSection(@PathVariable String id) {
// sectionServ.deleteSection(id);
// }

// other previous methods

// @GetMapping
// @PreAuthorize("hasAuthority('admin:read')")
// public String get() {
// return "GET:: admin controller";
// }

// @PostMapping
// @PreAuthorize("hasAuthority('admin:create')")
// @Hidden
// public String post() {
// return "POST:: admin controller";
// }

// @PutMapping
// @PreAuthorize("hasAuthority('admin:update')")
// @Hidden
// public String put() {
// return "PUT:: admin controller";
// }

// @DeleteMapping
// @PreAuthorize("hasAuthority('admin:delete')")
// @Hidden
// public String delete() {
// return "DELETE:: admin controller";
// }