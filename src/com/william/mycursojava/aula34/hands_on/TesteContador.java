package com.william.mycursojava.aula34.hands_on;

public class TesteContador {
    public static void main(String[] args) {
        Contador.exibirContador();
        System.out.println("Contador zerado: "+ Contador.zerarContador());
        System.out.println("Contador incrementado: "+ Contador.incrementarContador());
        System.out.println("Contador incrementado: "+ Contador.incrementarContador());
        Contador.exibirContador();
        System.out.println("Contador zerado: "+ Contador.zerarContador());
        Contador.exibirContador();
    }

}
