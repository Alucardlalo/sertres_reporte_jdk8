package com.sertres.reporte;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class prueba {

    @GetMapping("/prueba")
    public String prueba(){
        return "funciona el spring";
    }
}
