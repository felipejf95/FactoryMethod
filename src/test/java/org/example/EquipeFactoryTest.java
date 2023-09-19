package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipeFactoryTest {

   @Test
    void deveRetornarExecaoParaServicoInexistente(){
       try{
            Equipe equipe = EquipeFactory.obterEquipe("Handball");
            fail();
       } catch (IllegalArgumentException e){
           assertEquals("Equipe nao existe", e.getMessage());
       }
   }

   @Test
    void deveRetornarExecaoParaEquipeInvalida() {
       try {
            Equipe equipe = EquipeFactory.obterEquipe("Volei");
            fail();
       } catch (IllegalArgumentException e) {
            assertEquals("Equipe invalida", e.getMessage());
       }
   }
}