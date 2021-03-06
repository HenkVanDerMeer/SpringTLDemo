package com.example.SpringTLDemo.controller;

import com.example.SpringTLDemo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public String root(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
}
