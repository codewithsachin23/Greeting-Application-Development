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
    @PutMapping("/{id}")
    public String updateGreeting(@PathVariable int id,@RequestBody String newMessage){
        if (map.containsKey(id)){
            map.put(id,newMessage);
        }
        return "new message added";
    }
    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable int id){
        if (map.containsKey(id)){
            map.remove(id);
        }
        return "greeting is deleted";
    }

}
