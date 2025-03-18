package com.william.mycursojava.aula16.hands_on;

import java.text.DecimalFormat;
import java.util.Scanner;
// Exercício onde os elementos de B é a raíz quadrada de A
public class Exercicio04 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat formata = new DecimalFormat("###,###.###");
    int[] vetorA = new int[15];
    double[] vetorB = new double[vetorA.length];
    System.out.println("Digite 15 valores inteiros para o vetor A");

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + ": ");
      vetorA[i] = scan.nextInt();
      vetorB[i] = Math.sqrt(vetorA[i]);
    }

    System.out.print("Vetor A = [");
    for (int vetA : vetorA) {
      System.out.print(vetA + "; ");
    }
    System.out.println("] ");

    System.out.print("Então, B = [");
    for (double vetB : vetorB) {
      System.out.print(formata.format(vetB) + "; ");
    }
    System.out.println("]");

    scan.close();
  }
}
