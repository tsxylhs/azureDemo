package com.example.demo.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authController {

    @GetMapping("/auth")
    @ResponseBody
    //@PreAuthorize("hasAuthority('roleTest')")
    public String authTest(){
        return "Authing";
    }


}
