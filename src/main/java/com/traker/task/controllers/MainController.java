package com.traker.task.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @GetMapping("/")
    public String greeting(Model model) {
        return "index";
    }

    @GetMapping("/index")
    public String about(Model model) {
        return "index";
    }

    @GetMapping("/list")
    public String listTask(Model model) {
        return "redirect:/project";
    }
}

