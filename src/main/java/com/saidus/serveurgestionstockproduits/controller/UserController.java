package com.saidus.serveurgestionstockproduits.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

// @CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
