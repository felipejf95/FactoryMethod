package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeNatacaoTest {

    @Test
    void deveRetornarEquipeJogando() {
        Equipe equipe = EquipeFactory.obterEquipe("Natacao");
        assertEquals("Equipe de natacao competindo", equipe.equipeJogando());
    }
    @Test
    void deveRetornarEquipeTreinando() {
        Equipe equipe = EquipeFactory.obterEquipe("Natacao");
        assertEquals("Equipe de natacao treinando", equipe.equipeTreinando());
    }

}