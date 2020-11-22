package com.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/")
    public ModelAndView index() {
        var model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
