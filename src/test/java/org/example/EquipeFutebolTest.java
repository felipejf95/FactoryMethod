package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeFutebolTest {

    @Test
    void deveRetornarNomeTreinador() {
        Equipe equipe = EquipeFactory.obterEquipe("Futebol");
        equipe.setTreinador("Marcos");
        assertEquals("Marcos", equipe.getTreinador());
    }
    @Test
    void deveRetornarTotalJogadores() {
        Equipe equipe = EquipeFactory.obterEquipe("Futebol");
        equipe.setTotalJogadores(38);
        assertEquals(38, equipe.getTotalJogadores());
    }
}