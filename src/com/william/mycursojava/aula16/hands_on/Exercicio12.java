package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 números inteiros e eu lhe direi a soma deles!");

    int[] vetorA = new int[10];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.format("Digite o valor %d: \n", (i + 1));
      vetorA[i] = scan.nextInt();
    }

    int soma = 0;

    System.out.print("A soma entre esses números é ");
    for (int i = 0; i < vetorA.length; i++) {
      soma += vetorA[i];
    }
    System.out.println(soma);

    scan.close();
  }
}
