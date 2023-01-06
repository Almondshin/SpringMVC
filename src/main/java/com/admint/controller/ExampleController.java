package com.admint.controller;

import com.admint.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class ExampleController {
    @Autowired
    private DataService dataService;

    @RequestMapping("/order/{orderId}")
    public String handleRequest (@PathVariable("orderId") String orderId) {
        return dataService.getOrderDetail(orderId);
    }

    @RequestMapping("/data/{id}")
    public String testHandler (@PathVariable("id") String id) {
        return dataService.getData(id);
    }

    @RequestMapping("/test")
    public void testHandler2 () {
        throw new RuntimeException("test exception");
    }
}
