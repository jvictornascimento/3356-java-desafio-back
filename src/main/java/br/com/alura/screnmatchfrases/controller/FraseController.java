package br.com.alura.screnmatchfrases.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("series")
public class FraseController {

    @GetMapping("/frases")
    public String frases(){
        return "chagamos aqui!";
    }


}
