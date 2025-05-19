package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio34 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] vetorA = new int[10];


    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Digite o " + (i+1) + " valor: ");
      vetorA[i] = scan.nextInt();
      
      System.out.println("-=-=-=-=-=-=-");
      System.out.println("Divisores de " + vetorA[i] + ":");
      System.out.print("[ ");

      for (int j = 1; j <= vetorA[i]; j++) {
        if (vetorA[i] % j == 0) {
          System.out.print(j + " ");
        }
      }
      System.out.println("]");
    }

    scan.close();
  }
}
