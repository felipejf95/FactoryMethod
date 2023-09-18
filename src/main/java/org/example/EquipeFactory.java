package org.example;

public class EquipeFactory {

    public static Equipe obterEquipe (String equipe){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("org.example.Equipe" + equipe);
            objeto = classe.newInstance();
        } catch (Exception ex){
            throw new IllegalArgumentException("Equipe nao existe");
        }
        if (!(objeto instanceof Equipe)){
            throw new IllegalArgumentException("Equipe invalida");
        }
        return (Equipe) objeto;
    }
}
