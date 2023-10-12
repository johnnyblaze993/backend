package com.example.repositories;


import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;
import com.example.entities.Pokemon;
import io.micronaut.data.model.query.builder.sql.Dialect;

@JdbcRepository(dialect = Dialect.POSTGRES)
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
