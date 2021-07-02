package com.company.starwars.model;

import com.company.starwars.dto.PersonaDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Repository
public class PersonaRepositoryImple implements PersonaRepository{

    @Override
    public List<PersonaDto> listAll() {
        return loadDataBase();
    }

    @Override
    public List<PersonaDto> findByName(String name) {

        List<PersonaDto> retorno;

        List<PersonaDto> personas = loadDataBase();

        retorno = personas.stream().filter(x->x.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))).collect(Collectors.toList());

        return !retorno.isEmpty() ? retorno:null;
    }

    private List<PersonaDto> loadDataBase() {

        File FILE = null;

        try {

            FILE = ResourceUtils.getFile("./src/main/resources/starwars.json");

        }catch (FileNotFoundException e){

            e.printStackTrace();

        }

        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<PersonaDto>> typeReference = new TypeReference<>() {};

        List<PersonaDto> personas = null;

        try{
            FileInputStream is = new FileInputStream(FILE);
            personas = mapper.readValue(is, typeReference);
            is.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return personas;

    }

}
