package com.jenkins_project.demo_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String getMsg() {
        return "Hello Deepak..This is jenkins demo project..";
    }
}