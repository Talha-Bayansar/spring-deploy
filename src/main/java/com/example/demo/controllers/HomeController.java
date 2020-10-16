package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${message}")
    private String message;

    @GetMapping({"/", "/home"})
    public String home(Model model) {

        model.addAttribute("message", message);
        return "index";
    }

}
