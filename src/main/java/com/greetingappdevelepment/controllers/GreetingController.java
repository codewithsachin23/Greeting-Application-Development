package com.greetingappdevelepment.controllers;

import com.greetingappdevelepment.services.ServicesLayerGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private ServicesLayerGreeting servicesLayerGreeting;
@GetMapping
    public String sayGreeting() {
        return servicesLayerGreeting.getGreeting();
    }

}
