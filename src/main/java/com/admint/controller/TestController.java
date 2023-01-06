package com.admint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class TestController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
