package com.gordonzu.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gordonzu.mvc.data.entities.Project;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String home(Model model) {
        Project project = new Project();
        project.setName("First Project");
        project.setSponsor("Nasa");
        project.setDescription("This is a simple project sponsored by NASA");
        model.addAttribute("currentProject", project);
        return "index";
    }
}



