package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio15 {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 elementos inteiros e eu lhe direi o percentual de números pares e ímpares!");
    
    int[] vetorA = new int[10];
    int ehPar = 0;
    int ehImpar = 0;
    int percentualPar = 0;
    int percentualImpar = 0;
    String outputPar = "";
    String outputImpar = "";
    
    
    for (int i =0; i < vetorA.length; i++) {
      System.out.printf("Digite o valor %d: ", (i+1));
      vetorA[i] = scan.nextInt();
      
      if (vetorA[i] % 2 == 0) {
        ehPar++;
        outputPar += vetorA[i] + ", ";
      } else {
        ehImpar++;
        outputImpar += vetorA[i] + ", ";
      }
    }
    
    percentualPar = (ehPar * 100) / vetorA.length;
    percentualImpar = (ehImpar * 100) / vetorA.length;
    
    System.out.print("Os números pares registrados foram [" + outputPar);
    System.out.print("] \n");
    System.out.print("E os números ímpares registrados foram [" + outputImpar);
    System.out.print("] \n");
    System.out.printf("O percentual de números pares é de %d%% \n", percentualPar);
    System.out.printf("E o percentual de números ímpares é de %d%% \n", percentualImpar);
    

    scan.close();
  }
}
