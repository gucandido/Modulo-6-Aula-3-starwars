package com.company.starwars.model;

import com.company.starwars.dto.PersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImple implements PersonaService{

    @Autowired
    private PersonaRepositoryImple repo;

    public PersonaServiceImple(PersonaRepositoryImple repo) {
        this.repo = repo;
    }

    @Override
    public List<PersonaDto> listAllPersonas() {
        return repo.listAll();
    }

    @Override
    public List<PersonaDto> findPersonaByName(String name) {
        return repo.findByName(name);
    }

}
