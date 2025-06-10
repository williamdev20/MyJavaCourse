package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + " valor: ");
            vetorA[i] = scan.nextInt();
        }


        System.out.println("Valores do vetor A: ");

        for (int vetA : vetorA) {
            System.out.println(vetA + ", ");
        }

        System.out.println("\nA tabuada dos valores: ");

        for (int i = 0, j = 0; i <= 10; i++) {
            System.out.println(vetorA[j] + " X " + i + " = " + (vetorA[j] * i));
            if (i == 10) {
                System.out.println("-=-=-=-=-=-=-");
                j++;
                i = 0;
            }
            if (j == vetorA.length) {
                break;
            }
        }

        scan.close();
    }
}
