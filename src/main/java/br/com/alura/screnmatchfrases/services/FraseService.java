package br.com.alura.screnmatchfrases.services;

import br.com.alura.screnmatchfrases.model.dto.FraseDTO;
import br.com.alura.screnmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO getOneFraseRandom(){
        var total = repository.findAll().size();
        var random = new Random();

        var frase = repository. getReferenceById(1+random.nextLong(total));
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonagem(),frase.getPoster());

    }

}
