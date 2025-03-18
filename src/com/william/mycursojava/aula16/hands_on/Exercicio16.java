package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio16 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 números e eu lhe direi quais são inferiores a 15 e quais são superiores e a sua média");
    
    int[] vetorA = new int[10];
    int inferior = 0;
    int superior = 0;
    int igual = 0;
    int somaInferior = 0;
    int somaSuperior = 0;
    int somaIgual = 0;
    String outputInferior = "";
    String outputSuperior = "";
    String outputIgual = "";
    
    double media = 0;
    
    for (int i = 0; i < vetorA.length; i++) {
      System.out.printf("Digite o valor %d: ", (i+1));
      vetorA[i] = scan.nextInt();
      
      if (vetorA[i] < 15) {
        inferior++;
        somaInferior += vetorA[i];
        outputInferior += vetorA[i] + ", ";
        
      } else if (vetorA[i] > 15) {
        superior++;
        somaSuperior += vetorA[i];
        outputSuperior += vetorA[i] + ", ";
        
      } else if (vetorA[i] == 15) {
        igual++;
        somaIgual += vetorA[i];
        outputIgual += vetorA[i] + ", ";
      }
      
    }
    
    if (inferior == 0) {
      System.out.println("Não há números inferiores a 15 registrados!");
    } else {
      System.out.print("Os números menores que 15 registrados foram [" + outputInferior);
      System.out.print("]\n ");
      System.out.println("E a soma foi " + somaInferior);
    }
    
    if (superior == 0) {
      System.out.println("Não há números superiores a 15 registrados!");
    } else {
      media = somaSuperior / superior;
      System.out.print("Os números maiores que 15 registrados foram [" + outputSuperior);
      System.out.print("] \n");
      System.out.println("E a média é " + media);
    }
    
    if (igual == 0) {
      System.out.println("Não há números iguais a 15 registrados!");
    } else {
      System.out.println("Ao todo, " + igual + " números iguais a 15 foram registrados!");
      System.out.println("E a soma é " + somaIgual);
    }
    
    scan.close();    
  }
}