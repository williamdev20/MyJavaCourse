package com.william.mycursojava.aula19.hands_on;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lampada lampada = new Lampada();
        System.out.println("Digite 1 para ligar a lampada e 2 para desligar: ");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("A lampada está "+ lampada.ligar());
        } else {
            System.out.println("A lampada está "+ lampada.desligar());
        }


        scan.close();
    }
}
