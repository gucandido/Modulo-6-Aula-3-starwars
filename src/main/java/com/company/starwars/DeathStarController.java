package com.company.starwars;

import com.company.starwars.dto.PersonaDto;
import com.company.starwars.model.PersonaServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/star")
public class DeathStarController {

    @Autowired
    private PersonaServiceImple service;

    @GetMapping()
    public ResponseEntity<?> get(){
        return new ResponseEntity<List<PersonaDto>>(service.listAllPersonas(), HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getByName(@PathVariable String name){
        return new ResponseEntity<List<PersonaDto>>(service.findPersonaByName(name), HttpStatus.OK);
    }

}
