package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 números inteiros e eu lhe direi qual deles são pares!");

    int[] vetorA = new int[10];
    int ehPar = 0;
    String output = "";

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o número " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
      if (vetorA[i] % 2 == 0) {
        ehPar++;
        output += vetorA[i] + ", ";
      }
    }

    System.out.printf("No total, temos %d números pares, são eles: ", ehPar);
    System.out.println(output);
    scan.close();
  }
}
