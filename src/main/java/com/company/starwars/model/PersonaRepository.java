package com.company.starwars.model;

import com.company.starwars.dto.PersonaDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository {

    public List<PersonaDto> listAll();
    public List<PersonaDto> findByName(String name);

}
