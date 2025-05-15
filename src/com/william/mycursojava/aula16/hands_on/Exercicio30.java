package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];

        int par = vetorA.length;
        int impar = vetorA.length;

        int[] ehPar = new int[par];
        int[] ehImpar = new int[impar];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i+1) + " valor: ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                impar--;
                ehPar[i] = vetorA[i];
            }
            if (vetorA[i] % 2 != 0) {
                par--;
                ehImpar[i] = vetorA[i];
            }

            vetorB[i] = ehPar[i];
            vetorB[i + 10] = ehImpar[i];
        }

        System.out.println("Valores do vetor A: ");

        for (int vetA : vetorA) {
            System.out.print(vetA + ", ");
        }

        System.out.println("\nValores de B: ");

        for (int vetB : vetorB) {
            System.out.print(vetB + ", ");
        }

        scan.close();
    }
}
