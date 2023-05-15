package com.ManuelBravard.Portfolio.security.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelBravard.Portfolio.model.ExperienceCard;
import com.ManuelBravard.Portfolio.model.HomeCard;
import com.ManuelBravard.Portfolio.model.ProjectsCard;
import com.ManuelBravard.Portfolio.model.QPDCard;
import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.model.SkillsCard;
import com.ManuelBravard.Portfolio.service.ICardService;
import com.ManuelBravard.Portfolio.service.ISectionService;

@RestController
@RequestMapping("/api/v1/management")
@Tag(name = "Management")
public class ManagementController {

    @Autowired
    private ISectionService sectionServ;
    @Autowired
    private ICardService cardServ;

    @Operation(description = "Get endpoint for manager", summary = "This is a summary for management get endpoint", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
            @ApiResponse(description = "Unauthorized / Invalid Token", responseCode = "403")
    })

    @PutMapping("/update/section")
    public void updateSection(@RequestBody Section sec) {
        sectionServ.saveSection(sec);
    }

    // SORT CARDS

    @PutMapping("/projects/sortCards")
    public void updateProjectsCard(@RequestBody List<ProjectsCard> cardList) {
        for (ProjectsCard projectsCard : cardList) {
            cardServ.saveProjectsCard(projectsCard);
        }
    }

    @PutMapping("/experience/sortCards")
    public void updateExperienceCard(@RequestBody List<ExperienceCard> cardList) {
        for (ExperienceCard experienceCard : cardList) {
            cardServ.saveExperienceCard(experienceCard);
        }
    }

    @PutMapping("/skills/sortCards")
    public void updateSkillsCard(@RequestBody List<SkillsCard> cardList) {
        for (SkillsCard skillsCard : cardList) {
            cardServ.saveSkillsCard(skillsCard);
        }
    }

    @PutMapping("/home/sortCards")
    public void updateHomeCard(@RequestBody List<HomeCard> cardList) {
        for (HomeCard homeCard : cardList) {
            cardServ.saveHomeCard(homeCard);
        }
    }

    @PutMapping("/qPD/sortCards")
    public void updateQPDCard(@RequestBody List<QPDCard> cardList) {
        for (QPDCard qpdCard : cardList) {
            cardServ.saveQPDCard(qpdCard);
        }
    }

}
