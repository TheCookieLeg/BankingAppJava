package com.thecookielegend.bank.web.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
public class UserController {
    @GetMapping("/user")
    public String index(Model model) {
        model.addAttribute("name", "Mikkel");
        return "user/user";
    }

}