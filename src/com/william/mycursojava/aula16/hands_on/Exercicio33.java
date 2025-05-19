package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("\nDigite o " + (i+1) + " valor: ");
            vetorA[i] = scan.nextInt();

            System.out.println("Os elementos pares de 0 até " + vetorA[i] + " são: [");
            for (int j = 0; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            if (vetorA[i] % 2 == 0) {
                System.out.print(vetorA[i]);
            }
            System.out.print("]");
        }

        scan.close();
    }
}
