package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreinadorTest {

    @Test
    void deveRetornarPontosAtributosTreinadorStarter() {
        Rank rank = new Starter();
        Treinador treinador = new Treinador(5,0);
        treinador.setRank(rank);
        assertEquals(5, treinador.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsTreinadorStarter() {
        Rank rank = new Starter();
        Treinador treinador = new Treinador(5, 0);
        treinador.setRank(rank);
        assertEquals(5, treinador.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosTreinadorBeginner() {
        Rank rank = new Beginner();
        Treinador treinador = new Treinador(5, 0);
        treinador.setRank(rank);
        assertEquals(7, treinador.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsTreinadorBeginner() {
        Rank rank = new Beginner();
        Treinador treinador = new Treinador(5,0);
        treinador.setRank(rank);
        assertEquals(9, treinador.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosTreinadorAmateur() {
        Rank rank = new Amateur();
        Treinador treinador = new Treinador(5, 0);
        treinador.setRank(rank);
        assertEquals(9, treinador.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsTreinadorAmateur() {
        Rank rank = new Amateur();
        Treinador treinador = new Treinador(5,0);
        treinador.setRank(rank);
        assertEquals(12, treinador.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosTreinadorAce() {
        Rank rank = new Ace();
        Treinador treinador = new Treinador(5, 0);
        treinador.setRank(rank);
        assertEquals(11, treinador.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsTreinadorAce() {
        Rank rank = new Ace();
        Treinador treinador = new Treinador(5,0);
        treinador.setRank(rank);
        assertEquals(14, treinador.pontosSkill());
    }

    @Test
    void deveRetornarPontosAtributosTreinadorPro() {
        Rank rank = new Pro();
        Treinador treinador = new Treinador(5,0);
        treinador.setRank(rank);
        assertEquals(13, treinador.pontosAtributos());
    }

    @Test
    void deveRetornarPontosSkillsTreinadorPro() {
        Rank rank = new Pro();
        Treinador treinador = new Treinador(5,0);
        treinador.setRank(rank);
        assertEquals(15, treinador.pontosSkill());
    }

}