package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;
// Exercício onde o valor de A * B é igual ao valor de C
public class Exercicio08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];
    int[] vetorC = new int[vetorA.length];

    System.out.println("Digite 10 valores para A");

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Valor " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
    }

    System.out.println("Agora, digite os valores para B");
    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Valor " + (i + 1) + ": ");
      vetorB[i] = scan.nextInt();
    }

    System.out.print("A = [");
    for (int vetA : vetorA) {
      System.out.print(vetA + ", ");
    }
    System.out.println("]");

    System.out.print("B = [");
    for (int vetB : vetorB) {
      System.out.print(vetB + ", ");
    }
    System.out.println("]");

    System.out.print("Então C = [");
    for (int i = 0; i < vetorC.length; i++) {
      vetorC[i] = vetorA[i] * vetorB[i];
      System.out.print(vetorC[i] + ", ");
    }
    System.out.println("]");

      scan.close();
  }
}
