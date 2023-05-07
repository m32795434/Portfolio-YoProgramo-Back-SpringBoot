package com.ManuelBravard.Portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
import com.ManuelBravard.Portfolio.model.UpdateUserAndPassObj;
import com.ManuelBravard.Portfolio.model.Users;
import com.ManuelBravard.Portfolio.service.ICardService;
import com.ManuelBravard.Portfolio.service.ISectionService;
import com.ManuelBravard.Portfolio.service.IUsersService;

@RestController
public class Controller {

    @Autowired
    private ISectionService sectionServ;
    @Autowired
    private ICardService cardServ;
    @Autowired
    private IUsersService userServ;

    @GetMapping("/getComplete/completeHomeSection")
    @ResponseBody
    public CompleteHomeSection returnCompleteHomeSection() {
        Section section = sectionServ.returnSection("home");
        List<HomeCard> cardList = cardServ.returnAllHomeCards();
        CompleteHomeSection completeSec = new CompleteHomeSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/getComplete/completeExperienceSection")
    @ResponseBody
    public CompleteExperienceSection returnCompleteExperienceSection() {
        Section section = sectionServ.returnSection("experience");
        List<ExperienceCard> cardList = cardServ.returnAllExperienceCards();
        CompleteExperienceSection completeSec = new CompleteExperienceSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/getComplete/completeQPDSection")
    @ResponseBody
    public CompleteQPDSection returnCompleteQPDSection() {
        Section section = sectionServ.returnSection("qPD");
        List<QPDCard> cardList = cardServ.returnAllQPDCards();
        CompleteQPDSection completeSec = new CompleteQPDSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/getComplete/completeSkillsSection")
    @ResponseBody
    public CompleteSkillsSection returnCompleteSkillsSection() {
        Section section = sectionServ.returnSection("skills");
        List<SkillsCard> cardList = cardServ.returnAllSkillsCards();
        CompleteSkillsSection completeSec = new CompleteSkillsSection(section, cardList);
        return completeSec;
    }

    @GetMapping("/getComplete/completeProjectsSection")
    @ResponseBody
    public CompleteProjectsSection returnCompleteProjectsSection() {
        Section section = sectionServ.returnSection("projects");
        List<ProjectsCard> cardList = cardServ.returnAllProjectsCards();
        CompleteProjectsSection completeSec = new CompleteProjectsSection(section, cardList);
        return completeSec;
    }

    // USERS
    // @PutMapping("/user")
    // public void saveUser(@RequestBody UpdateUserAndPassObj user) {
    // userServ.saveUser(user);
    // }

    // @PostMapping("/login")
    // @ResponseBody
    // public Boolean checkAuth(@RequestBody Users user) {
    // return userServ.checkAuth(user);
    // }
}

// other previous methods
// @GetMapping("/allsections")
// @ResponseBody
// public List<Section> returnAllSections() {
// return sectionServ.returnAllSections();
// }

// @GetMapping("/section/{id}")
// @ResponseBody
// public Section returnSection(@PathVariable String id) {
// return sectionServ.returnSection(id);
// }

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