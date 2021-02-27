package com.nina.app.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinaInfService {

    @RequestMapping("/getNinaInf")
    public String getNinaInf(){
        return "nina's inf";
    }
}
