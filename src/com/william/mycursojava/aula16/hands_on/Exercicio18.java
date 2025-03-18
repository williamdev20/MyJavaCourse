package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio18 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 idades e eu lhe direi qual delas é a maior e qual delas é a menor!");
    
    int[] idades = new int[10];
    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;
    
    for (int i = 0; i < idades.length; i++) {
      System.out.println("Digite a idade da pessoa " + (i+1) + ": ");
      idades[i] = scan.nextInt();
      
      if (idades[i] < menor) {
        menor = idades[i];
      }
      if (idades[i] > maior) {
        maior = idades[i];
      }
      
    }
    
    System.out.printf("A pessoa mais nova possui %d anos", menor);
    System.out.printf("\nE a pessoa mais velha possui %d anos", maior);
    
    scan.close();
  }
}