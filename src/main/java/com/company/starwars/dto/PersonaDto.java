package com.company.starwars.dto;

import java.util.Objects;

public class PersonaDto {

    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private String species;

    public PersonaDto(String name, String height, String mass, String hair_color, String skin_color, String eye_color, String birth_year, String gender, String homeworld, String species) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.species = species;
    }

    public PersonaDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaDto that = (PersonaDto) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
