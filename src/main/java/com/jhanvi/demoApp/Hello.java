package com.jhanvi.demoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet() {
        return "Hello World, It's Jhanviba! ";
    }
    @RequestMapping("/hi")
    public String hi() {
        return "this is a hi message";
    }
    @GetMapping("/user")
    public Map<String,String> user() {
        return Map.of("name", "Jhanviba", "role", "SDE-1");
    }
}
