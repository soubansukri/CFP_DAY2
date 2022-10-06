package com.bridgelabz.Day_2_Assignment.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingAppController {

    @RequestMapping("/")
    public String welcomeMessage(){
        return "Hello from Bridgelabz";
    }
}
