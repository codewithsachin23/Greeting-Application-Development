package com.greetingappdevelepment.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private HashMap<Integer,String> map=new HashMap<>();
    private int key;
    @GetMapping
    public Map<Integer, String> getMessage(){
        return map;
    }
    @PostMapping
    public String createGreeting(@RequestBody String message){
        map.put(key,message);
        return "Greeting message was added"+key++;
    }

    @GetMapping("/{id}")

    public String getByID(@PathVariable int id){
        return map.get(id);


}
}
