package com.william.mycursojava.aula16.hands_on;

public class Exercicio21 {
  public static void main(String[] args) {
    int numRandom = (int)Math.round(Math.random() * 1);
    int[] vetorA = new int[10];

    int one = 0; 
    int zero = 0;

    int percentualZero = 1;
    int percentualOne = 1;

    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = Math.round(numRandom);

      if (vetorA[i] == 0) {
        zero++;
      } else if (vetorA[i] == 1) {
        one++;
      }
      
      percentualZero = (zero * 100) / vetorA.length;
      percentualOne = (one * 100) / vetorA.length;

      numRandom = (int)Math.round(Math.random() * 1);
    }

    for (int vetA : vetorA) {
      System.out.println(vetA);
    }

    System.out.println("A quantidade de números zeros encontrados na lista foram " + zero);
    System.out.println("E a quantidade de números um encontrados foram " + one);
    System.out.println("Portanto, o percentual de zeros foi de " + percentualZero + "%");
    System.out.println("E o percentual de um foi de " + percentualOne + "%");
  }
}
