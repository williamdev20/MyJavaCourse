package com.william.mycursojava.aula34.hands_on;

public class Contador {
    private static int cont;

    public static int zerarContador() {
        cont = 0;
        return cont;
    }

    public static int incrementarContador() {
        cont++;
        return cont;
    }

    public static void exibirContador() {
        System.out.println("O valor atual do contador é: " + cont);
    }
}
