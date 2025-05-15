package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int ehPar = 1;
        int ehImpar = 1;
        int[] vetorB = new int[ehPar];
        int[] vetorC = new int[ehImpar];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o primeiro " + (i+1) + " número: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                if (ehPar == 1) {
                    ehPar = 1;
                } else {
                    ehPar++;
                }
                vetorB[i] = vetorA[i];
            } else {
                if (ehImpar == 1) {
                    ehImpar = 1;
                } else {
                    ehImpar++;
                }
                vetorC[i] = vetorA[i];
            }

        }

        System.out.println("Valores do vetor A: ");

        for (int vetA : vetorA) {
            System.out.print(vetA + ", ");
        }

        System.out.println("\nValores do vetor B: ");

        for (int vetB : vetorB) {
            System.out.print(vetB + ", ");
        }

        System.out.println("\nValores do vetor C: ");

        for (int vetC : vetorC) {
            System.out.print(vetC + ", ");
        }

        scan.close();
    }
}
