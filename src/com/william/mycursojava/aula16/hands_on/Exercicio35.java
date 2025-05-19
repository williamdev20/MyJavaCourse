package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio35 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[11];


    // Pedindo os valores
    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o " + (i+1) + " valor:");
      vetorA[i] = scan.nextInt();
    }

    // Transformando em base dois elevado ao número escolhido pelo usuário
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = (int) Math.pow(2, vetorA[i]);
      System.out.print("Posição " + (i+1) + " do vetor A: ");
      System.out.println(vetorA[i]);
    }

    scan.close();
  }
}
