package com.william.mycursojava.aula28_33.hands_on;

import java.util.Scanner;

public class Lampada {
    Scanner scan = new Scanner(System.in);
    private boolean ligado;

    public Lampada() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean mudarEstadoLampada() {
        System.out.println("[ 1 ] ligar lampada");
        System.out.println("[ 2 ] desligar lampada");
        System.out.print(">>> Escolha: ");
        int opcao = scan.nextInt();

       if (opcao == 1) {
           setLigado(true);
       } else {
           setLigado(false);
       }

       return isLigado();
    }

}
