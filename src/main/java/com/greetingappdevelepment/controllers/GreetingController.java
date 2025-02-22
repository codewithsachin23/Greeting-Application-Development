package com.greetingappdevelepment.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private String greetingMessage;

    @GetMapping
    public String greeting() {
        return greetingMessage;
    }

    @PostMapping
    public String createGreeting(@RequestBody String message) {
        greetingMessage=message;
        return "Greeting received "+message;
    }
    @PutMapping
    public String updateGreeting(@RequestBody String message) {
        this.greetingMessage=message;
        return "updated "+message;
    }
    @DeleteMapping
    public String deleteGreeting() {
        greetingMessage=null;
        return "Greeting deleted";
    }
}
