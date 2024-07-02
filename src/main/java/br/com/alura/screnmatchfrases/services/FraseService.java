package br.com.alura.screnmatchfrases.services;

import br.com.alura.screnmatchfrases.model.dto.FraseDTO;
import br.com.alura.screnmatchfrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO getOneRandon(){
        return null;

    }

}
