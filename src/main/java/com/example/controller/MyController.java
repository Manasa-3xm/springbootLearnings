package com.example.controller;

import com.example.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    MyComponent myComponent;
    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/")
    public String home() {
        return "Hello World from " + serverPort + myComponent.getMyName();
    }
}
