package com.forms.survey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Test {
    @GetMapping("/")
    public ModelAndView getForm() {
        return new ModelAndView("form");
    }
}
