package com.example.everton.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.everton.Entities.Users;
@Controller
@RestController("/user")
public class UserController {


    @GetMapping("/list")
    private Users u(){

        return u();
    }
    
}
