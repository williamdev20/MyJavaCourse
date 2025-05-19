package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int divisivel = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + " valor:");
            vetorA[i] = scan.nextInt();

            for (int j = 1; vetorA[i] >= j; j++) {
                if (vetorA[i] % j == 0) {
                    divisivel++;
                }
            }
            if (divisivel > 2) {
                System.out.println(vetorA[i] + " não é um número primo!");
            } else {
                System.out.println(vetorA[i] + " é um número primo!");
            }
            divisivel = 0;
        }

        scan.close();
    }
}