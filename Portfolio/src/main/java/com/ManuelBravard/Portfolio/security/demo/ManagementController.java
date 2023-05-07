package com.ManuelBravard.Portfolio.security.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelBravard.Portfolio.model.Section;
import com.ManuelBravard.Portfolio.service.ISectionService;

@RestController
@RequestMapping("/api/v1/management")
@Tag(name = "Management")
public class ManagementController {

    @Autowired
    private ISectionService sectionServ;

    @Operation(description = "Get endpoint for manager", summary = "This is a summary for management get endpoint", responses = {
            @ApiResponse(description = "Success", responseCode = "200"),
            @ApiResponse(description = "Unauthorized / Invalid Token", responseCode = "403")
    })

    @PutMapping("/update/section")
    public void updateSection(@RequestBody Section sec) {
        sectionServ.saveSection(sec);
    }

}
