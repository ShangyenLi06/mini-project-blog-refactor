package com.practice.demo.sean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping(value = {"/selectPage"})
    public String selectPage() {
        return "sean/selectPage";
    }

}
