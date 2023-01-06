package com.admint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {

    @GetMapping("/")
    public String index() {
        return "/";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String list() {
        return "hello";
    }

    @GetMapping(value = "/list")
    public String indexPage() {
        return "list";
    }
}
