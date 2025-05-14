package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("Digite o " + (i+1) + "número: ");
      vetorA[i] = scan.nextInt();
      if (vetorA[i] % 2 == 0) {
        vetorB[i] = 1;
      } else {
        vetorB[i] = 0;
      }
    }
    for ()

    scan.close();
  }
}