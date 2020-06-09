package com.saidus.serveurgestionstockproduits.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

// @CrossOrigin
@RestController
@RequestMapping("/api")  // @RequestMapping("/api/user")
public class UserController {

    // @RequestMapping("/api/user")
    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
