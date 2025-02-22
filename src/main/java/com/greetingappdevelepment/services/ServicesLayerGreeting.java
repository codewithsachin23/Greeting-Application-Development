package com.greetingappdevelepment.services;

import org.springframework.stereotype.Service;

@Service
public class ServicesLayerGreeting {
    public String getGreeting() {
        return "Hello this greeting from Service layer";
    }
}
