package com.william.mycursojava.aula16.hands_on;

public class Exercicio20 {
  public static void main(String[] args) {
    System.out.println("A cotação do dólar atual é U$5,63");
    double[] vetorA = new double[20];
    double cotacao = 5.63;

    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = cotacao * (i+1);
      System.out.println((i+1) + "º cotação em real: " + vetorA[i]);

    }
  }
}
