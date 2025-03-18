package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;
// Exercício onde o vetor B é o valor de A multiplicado pelo seu índice
public class Exercicio05 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 valores para o vetor A");

    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
      vetorB[i] = vetorA[i] * i;
    }

    System.out.print("Vetor A = [");
    for (int vetA : vetorA) {
      System.out.print(vetA + ", ");
    }
    System.out.println("] ");

    System.out.print("Então, B = [");
    for (int vetB : vetorB) {
      System.out.print(vetB + ", ");
    }
    System.out.println("]");

    scan.close();
  }
}
