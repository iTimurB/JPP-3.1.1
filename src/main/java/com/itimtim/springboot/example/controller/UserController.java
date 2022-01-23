package com.itimtim.springboot.example.controller;

import com.itimtim.springboot.example.model.User;
import com.itimtim.springboot.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home (){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/home_page_for_all")
    public String homePage(ModelMap modelMap, Principal principal){
        User user = userService.getUserByNameWithRoles(principal.getName());
        modelMap.addAttribute("user", user);
        return "home_page_for_all";
    }
}