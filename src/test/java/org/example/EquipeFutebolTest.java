package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeFutebolTest {

    @Test
    void deveRetornarEquipeJogando() {
        Equipe equipe = EquipeFactory.obterEquipe("Futebol");
        assertEquals("Equipe de futebol jogando", equipe.equipeJogando());
    }
    @Test
    void deveRetornarEquipeTreinando() {
        Equipe equipe = EquipeFactory.obterEquipe("Futebol");
        assertEquals("Equipe de futebol treinando", equipe.equipeTreinando());
    }
}