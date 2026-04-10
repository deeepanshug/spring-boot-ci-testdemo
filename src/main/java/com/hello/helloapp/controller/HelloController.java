package com.hello.helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    private String hello() {
        return "Hello from CI/CD pipeline....From Github repo /n" +
                "A little update.";
    }
}
