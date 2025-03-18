package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class QuantidadeDeNumerosParesEImpares {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.println("Para este experimento, preciso que você me diga 10 números inteiros");
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "º número: ");
            int num = perg.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("A quantidade de números pares é: " + pares);
        System.out.println("A quantidade de números ímpares é: " + impares);

        perg.close();
    }
}
