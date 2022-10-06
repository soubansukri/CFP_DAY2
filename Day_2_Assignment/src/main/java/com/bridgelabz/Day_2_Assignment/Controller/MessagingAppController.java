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
    public String reqParamMessage(@RequestParam String name){
        return "Hello" +" "+name+" from Bridgelabz";
    }

    //UC-3=Path Variable

    @RequestMapping(value = "/path/{name}",method = RequestMethod.GET)
    public String pathVariableMessage(@PathVariable String name){
        return "Hello" +" "+name+" from Bridgelabz";
    }

    //UC-4=Post mapping using DTO
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String postMessage(@RequestBody User user){
        return "Hello" +" "+user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }

    //UC-5=Put mapping using path variable and request param
    @RequestMapping(value = "/put/{firstName}",method = RequestMethod.PUT)
    public String putMessage(@PathVariable String firstName,@RequestParam String lastName){
        return "Hello" +" "+firstName+" "+lastName+" from Bridgelabz";
    }
}
