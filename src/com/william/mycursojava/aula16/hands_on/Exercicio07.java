package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;
// Exercício onde o vetor A - B é o resultado de C 
public class Exercicio07 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 valores para o vetor A");

    int[] vetorA = new int[10];
    int[] vetorB = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
    }

    System.out.println("Agora, digite 10 valores para o vetor B");
    for (int i = 0; i < vetorB.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + ": ");
      vetorB[i] = scan.nextInt();
    }

    System.out.print("Se A = [");
    for (int vetA : vetorA) {
      System.out.print(vetA + ", ");
    }
    System.out.println("]");

    System.out.print("E B = [");
    for (int vetB : vetorB) {
      System.out.print(vetB + ", ");
    }
    System.out.println("]");

    int[] vetorC = new int[vetorA.length];

    System.out.print("Então C = [");
    for (int i = 0; i < vetorC.length; i++) {
      vetorC[i] = vetorA[i] - vetorB[i];
      System.out.print(vetorC[i] + ", ");
    }
    System.out.println("]");

    scan.close();
  }
}
