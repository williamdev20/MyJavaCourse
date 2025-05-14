package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("Digite o " + (i+1) + " número: ");
      vetorA[i] = scan.nextInt();
      if (vetorA[i] % 2 == 0) {
        vetorB[i] = 1;
      } else {
        vetorB[i] = 0;
      }
    }
    
    System.out.println("Os valores do vetor A são: ");
    
    for (int vetA : vetorA) {
        System.out.print(vetA + ", ");
    }
    
    System.out.println("\n E os valores de B são: ");
    
    
    for (int vetB : vetorB) {
        System.out.print(vetB + ", ");
    }

    scan.close();
  }
}
