package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio37 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o " + (i+1) +  "valor do vetor A: ");
      vetorA[i] = scan.nextInt();

      for (int j = i; j < 10; j++) {
        vetorB[i] += vetorA[j];
      }
    }

    System.out.println("Valores de A: ");

    for (int vetA : vetorA) {
      System.out.print(vetA + " ");
    }

    System.out.println("Valores do vetor B:");

    for (int vetB : vetorB) {
      System.out.print(vetB + " ");
    }

    scan.close();
  }
}
