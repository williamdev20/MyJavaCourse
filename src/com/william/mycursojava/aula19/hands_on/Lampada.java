package com.william.mycursojava.aula19.hands_on;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantia;
    String[] tipos;
    boolean estado;

    String ligar() {
        return !estado?"ligado":"desligado";
    }

    String desligar() {
        return estado?"desligado":"ligado";
    }

}
