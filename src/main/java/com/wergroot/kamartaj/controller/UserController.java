package com.wergroot.kamartaj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String test(){
        return "We-R-Groot";
    }
}
