package com.example.entities;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;



@MappedEntity
public class Pokemon {

    @Id
    private Long pokemon_id;

    private String name;
    private String type;
    public Long getPokemon_id() {
        return pokemon_id;
    }
    public void setPokemon_id(Long pokemon_id) {
        this.pokemon_id = pokemon_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Pokemon() {
    }
    public Pokemon(Long pokemon_id, String name, String type) {
        this.pokemon_id = pokemon_id;
        this.name = name;
        this.type = type;
    }
    
}