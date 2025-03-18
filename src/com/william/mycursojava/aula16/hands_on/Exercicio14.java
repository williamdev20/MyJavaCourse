package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio14 {
  public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite 10 números e eu lhe direi a média dos números que são ímpares!");
        
      int[] vetorA = new int[10];
      String output = "";
      int soma = 0;
      double media = 0;
      int ehImpar = 0;
        
      for (int i = 0; i < vetorA.length; i++) {
        System.out.printf("Digite o valor %d: ", (i+1));
        vetorA[i] = scan.nextInt();
        
        if (vetorA[i] % 2 != 0) {
          output += vetorA[i] + ", ";
          soma += vetorA[i];
          ehImpar++;
        }
      }
      
      if (ehImpar == 0) {
        System.out.println("Não foi registrado nenhum número ímpar!");
      } else {
        media = soma / ehImpar;
        System.out.print("Os números ímpares registrados foram [" + output);
        System.out.print("] \n");
        System.out.println("E a média é " + media);  
      }
      
      scan.close();
  }
}
