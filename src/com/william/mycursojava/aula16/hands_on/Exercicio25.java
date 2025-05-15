package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + " número do vetor A: ");
            vetorA[i] = scan.nextInt();
            System.out.println("Digite o " + (i+1) + " número dp vetor B: ");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            }
            if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            }
            if (vetorA[i] < vetorB[i]) {
                vetorC[i] = -1;
            }

        }

        System.out.println("Valores do vetor A: ");

        for (int vetA : vetorA) {
            System.out.print(vetA + ", ");
        }

        System.out.println("Valores do vetor B: ");

        for (int vetB : vetorB) {
            System.out.print(vetB + ", ");
        }

        System.out.println("Valores do vetor C: ");

        for (int vetC : vetorC) {
            System.out.print(vetC + ", ");
        }

        scan.close();
    }
}




