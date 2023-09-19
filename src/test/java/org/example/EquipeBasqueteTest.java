package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeBasqueteTest {

    @Test
    void deveRetornarEquipeJogando() {
        Equipe equipe = EquipeFactory.obterEquipe("Basquete");
        assertEquals("Equipe de basquete jogando", equipe.equipeJogando());
    }
    @Test
    void deveRetornarEquipeTreinando() {
        Equipe equipe = EquipeFactory.obterEquipe("Basquete");
        assertEquals("Equipe de basquete treinando", equipe.equipeTreinando());
    }
}