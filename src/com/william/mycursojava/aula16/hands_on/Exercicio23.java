package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio23 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite 10 elementos inteiros");
    int[] vetorA = new int[10];
    String partes = String "";

    for (int i = 0; i < vetorA.length; i++) {
      System.out.print("Digite o valor " + (i+1) + ": ");
      vetorA[i] = scan.nextInt();
      partes = String.valueOf(vetorA[i]);
      int i = 0;
      int j = 1;
      

    }
    

    String[] arrayDividido = partes.split("");

    for (String parte : arrayDividido) {
      System.out.println(parte + ", ");
    }



    scan.close();
  }
}
