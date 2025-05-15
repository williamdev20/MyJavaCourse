package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio27 {
    //Exercicio de inverter os valores do vetor A no vetor B
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + " número: ");
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - (i+1)] = vetorA[i];
        }

        System.out.println("Valores do vetor A: ");

        for (int vetA : vetorA) {
            System.out.print(vetA + ", ");
        }

        System.out.println("\nValores do vetor B: ");

        for (int vetB : vetorB) {
            System.out.print(vetB + ", ");
        }

        System.out.println(" ");

        scan.close();
    }
}
