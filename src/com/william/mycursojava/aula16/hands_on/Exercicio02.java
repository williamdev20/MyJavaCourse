package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;
// Exercício onde o vetor B é o dobro dos valores de A
public class Exercicio02 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[8];
    int[] vetorB = new int[8];
    System.out.println("Digite 8 números inteiros para o vetor A");

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
      vetorB[i] = vetorA[i] * 2;
    }

    System.out.print("A = [");
    for (int vetA : vetorA) {
      System.out.print(vetA + ", ");
    }
    System.out.print("] ");

    System.out.print("Então, B = [");
    for (int vetB : vetorB) {
      System.out.print(vetB + ", ");
    }
    System.out.println("]");

    scan.close();
  }
}
