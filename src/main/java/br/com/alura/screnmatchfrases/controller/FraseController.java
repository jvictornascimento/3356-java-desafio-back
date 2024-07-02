package br.com.alura.screnmatchfrases.controller;

import br.com.alura.screnmatchfrases.model.dto.FraseDTO;
import br.com.alura.screnmatchfrases.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("series")
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/frases")
    public FraseDTO frases(){
        return service.getOneFraseRandon();
    }


}
