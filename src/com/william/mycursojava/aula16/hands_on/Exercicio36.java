package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio36 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[15];
    int[] vetorB = new int [vetorA.length];
    int fatorial = 1;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o " + (i+1) + " valor: ");
      vetorA[i] = scan.nextInt();

      // Elementos do vetor B
      
      for (int j = 1; j < vetorA[i]; j++) {
        fatorial *= j;
      }
      vetorB[i] = fatorial;
      fatorial = 1;
      /*for (int j = 1; vetorA[i] > j; vetorA[i]--) {
        vetorB[i] += vetorA[i] * j;
      }*/
    }

    System.out.print("Valores do vetor A: [ ");

    for (int vetA : vetorA) {
      System.out.print(vetA + " ");
    }
    
    System.out.println("]");
    System.out.print("\nValores do vetor B (fatorial de A): [ ");
  
    for (int vetB : vetorB) {
      System.out.print(vetB + " ");
    }

    System.out.println("teste fatorial de 5");

    int fat = 1;

    for (int i = 5; i < 1; i--) {
       fat *= i;
    }
    System.out.println("Valor fat teste: " + fat);

    scan.close();
  }
}
