package com.greetingappdevelepment.controllers;

import com.greetingappdevelepment.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

@PostMapping
public String greeting(@RequestBody User user) {
    if (user.getFirstName() != null && !user.getFirstName().isEmpty() &&
            user.getLastName() != null && !user.getLastName().isEmpty()) {
        return "Hello, " + user.getFirstName() + " " + user.getLastName() + "!";
    } else if (user.getFirstName() != null && !user.getFirstName().isEmpty()) {
        return "Hello, " + user.getFirstName() + "!";
    } else if (user.getLastName() != null && !user.getLastName().isEmpty()) {
        return "Hello, " + user.getLastName() + "!";
    } else {
        return "Hello World!";
    }
}

}
