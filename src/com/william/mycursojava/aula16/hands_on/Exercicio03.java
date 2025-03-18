package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;
// Exercício onde o vetor B é o quadrado dos elementos de A
public class Exercicio03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[15];
    int[] vetorB = new int[15];
    System.out.println("DIgite 15 elementos inteiros para o vetor A");

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
      vetorB[i] = vetorA[i] * vetorA[i];
    }

    System.out.print("Vetor A = [");
    for (int vetA : vetorA) {
      System.out.print(vetA + ", ");
    }
    System.out.println("] ");

    System.out.print("Então, vetor B = [");
    for (int vetB : vetorB) {
      System.out.print(vetB + ", ");
    }
    System.out.println("]");

    scan.close();
  }
}
