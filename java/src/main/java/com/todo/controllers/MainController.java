package com.todo.controllers;

import com.todo.entities.User;
import com.todo.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.todo.services.UserService;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
      @Autowired
      private UserServiceImpl userService;

    @PostMapping(path = "/add")
    public @ResponseBody User addNewUser(
            @RequestParam String name, @RequestParam String email) {

        User user = new User(name, email);
        return userService.save(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return this.userService.findAll();
    }
}
