package com.larrysss.accounting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("v1/hello")
    public String greetName(@RequestParam("name") String name) {
        return name;
    }
}
