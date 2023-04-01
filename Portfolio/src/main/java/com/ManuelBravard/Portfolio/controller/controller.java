package com.ManuelBravard.Portfolio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ManuelBravard.Portfolio.model.Section;

@RestController
public class Controller {

    List<Section> sectionList = new ArrayList<Section>();

    // GET
    @GetMapping("/hola/{name}/{edad}")
    public String decirHola(@PathVariable String name, @PathVariable int edad) {

        return "hola " + name + '!' + "tu tienes: " + edad + "años de edad !";
    }

    @GetMapping("/")
    public String sendSection(@RequestParam String section) {
        return "Section " + section;
    }

    // POST
    @PostMapping("/new/section")
    public void addSection(@RequestBody Section sec) {
        sectionList.add(sec);
    }

    @GetMapping("/sections")
    @ResponseBody
    public List<Section> returnSections() {
        return sectionList;
    }
}
