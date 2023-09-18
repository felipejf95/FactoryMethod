package org.example;

public class EquipeVolei implements Equipe {
    String treinador;
    int totalJogadores;

    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    public int getTotalJogadores() {
        return totalJogadores;
    }

    public void setTotalJogadores(int totalJogadores) {
        this.totalJogadores = totalJogadores;
    }
}
