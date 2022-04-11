package com.egrasoft.tamafriends.controllers;

import com.egrasoft.tamafriends.models.User;
import com.egrasoft.tamafriends.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    private UserRepository usersDao;

    public UserController(UserRepository usersDao){
        this.usersDao = usersDao;
    }

    @GetMapping("/sign-up")
    public String showSignup(Model model){
        model.addAttribute("user", new User());
        return "users/sign-up";
    }


}
