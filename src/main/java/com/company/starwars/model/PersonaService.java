package com.company.starwars.model;

import com.company.starwars.dto.PersonaDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonaService {

    public List<PersonaDto> listAllPersonas();
    public List<PersonaDto> findPersonaByName(String name);

}
