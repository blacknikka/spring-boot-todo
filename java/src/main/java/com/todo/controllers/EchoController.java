package com.todo.controllers;

import com.todo.controllers.Forms.EchoForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("echo")
public class EchoController {

    @ModelAttribute
    public EchoForm setUpEchoForm() {
        return new EchoForm();
    }

    @GetMapping
    public String index(Model model) {
        return "echo/index";
    }

    @PostMapping(value = "hello")
    public String hello(EchoForm form, Model model) {
        model.addAttribute("name", form.getName());
        return "echo/hello";
    }
}
