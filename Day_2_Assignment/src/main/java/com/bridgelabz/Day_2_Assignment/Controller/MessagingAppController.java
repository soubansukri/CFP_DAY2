package com.bridgelabz.Day_2_Assignment.Controller;

import com.bridgelabz.Day_2_Assignment.UserDto.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessagingAppController {

    // UC-1=Welcome message
    @RequestMapping("/")
    public String welcomeMessage(){
        return "Hello from Bridgelabz";
    }

    // UC-2=Get Request Param Method
    @RequestMapping(value = "/Param",method = RequestMethod.GET)
    public String ReqParamMessage(@RequestParam String name){
        return "Hello" +" "+name+" from Bridgelabz";
    }

}
