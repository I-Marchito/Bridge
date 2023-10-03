package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void deveRetornarPontosAtributosPokemonStarter() {
        Rank rank = new Starter();
        Pokemon pokemon = new Pokemon(10,0);
        pokemon.setRank(rank);
        assertEquals(10, pokemon.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsPokemonStarter() {
        Rank rank = new Starter();
        Pokemon pokemon = new Pokemon(10, 0);
        pokemon.setRank(rank);
        assertEquals(5, pokemon.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosPokemonBeginner() {
        Rank rank = new Beginner();
        Pokemon pokemon = new Pokemon(10,0);
        pokemon.setRank(rank);
        assertEquals(12, pokemon.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsPokemonBeginner() {
        Rank rank = new Beginner();
        Pokemon pokemon = new Pokemon(10, 0);
        pokemon.setRank(rank);
        assertEquals(9, pokemon.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosPokemonAmateur() {
        Rank rank = new Amateur();
        Pokemon pokemon = new Pokemon(10,0);
        pokemon.setRank(rank);
        assertEquals(14, pokemon.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsPokemonAmateur() {
        Rank rank = new Amateur();
        Pokemon pokemon = new Pokemon(10, 0);
        pokemon.setRank(rank);
        assertEquals(12, pokemon.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosPokemonAce() {
        Rank rank = new Ace();
        Pokemon pokemon = new Pokemon(10,0);
        pokemon.setRank(rank);
        assertEquals(16, pokemon.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsPokemonAce() {
        Rank rank = new Ace();
        Pokemon pokemon = new Pokemon(10, 0);
        pokemon.setRank(rank);
        assertEquals(14, pokemon.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosPokemonPro() {
        Rank rank = new Pro();
        Pokemon pokemon = new Pokemon(10,0);
        pokemon.setRank(rank);
        assertEquals(18, pokemon.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsPokemonPro() {
        Rank rank = new Pro();
        Pokemon pokemon = new Pokemon(10, 0);
        pokemon.setRank(rank);
        assertEquals(15, pokemon.pontosSkill());
    }
}