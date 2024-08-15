package com.example.drawingapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerGeneric {
    @GetMapping("/testerson")
    public String nada(){

        System.out.print("acesso");
        return "teste";
    }
}
