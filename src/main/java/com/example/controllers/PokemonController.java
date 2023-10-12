package com.example.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import com.example.entities.Pokemon;
import com.example.repositories.PokemonRepository;

import java.util.List;

@Controller("/pokemon")
public class PokemonController {

    private final PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Get
    public List<Pokemon> getAllPokemon() {
        return (List<Pokemon>) pokemonRepository.findAll();
    }
}