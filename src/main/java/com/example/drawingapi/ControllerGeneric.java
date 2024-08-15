package com.example.drawingapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGeneric {
    @GetMapping("")
    public String nada(){
        return "teste";
    }
}
