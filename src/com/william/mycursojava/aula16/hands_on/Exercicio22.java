package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio22 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[10];
    int par = 0;
    int noPar = 0;

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o " + (i+1) + " número");
      vetorA[i] = scan.nextInt();

      if (vetorA[i] % 2 == 0) {
        par++;
      } else {
        noPar = vetorA[i];
        System.out.println("Um número ímpar foi encontrado! É o " + noPar);
        break;
      }
    }

    if (par == vetorA.length) {
      System.out.println("Todos os números do vetor A são pares!");
    }

    scan.close();
  }
}

// Redação sobre esterilização: de 20 a 30 linhas. Mais informações na geekie
// História: meu grupo vai falar dos nômades.