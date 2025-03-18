package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 idades e eu direi quais são as pessoas que possuem idade superior a 35 anos");
    
    int[] idades = new int[10];
    int idadeSuperior = 0;
    String output = "";
    
    for (int i = 0; i < idades.length; i++) {
      System.out.printf("Digite a idade da pessoa %d: ", (i+1));
      idades[i] = scan.nextInt();
      
      if (idades[i] > 35) {
        idadeSuperior++;
        output += " a pessoa " + (i+1);
      }
    }
    
    System.out.println("A quantidade de pessoas que possuem idade superior a 35 anos é " + idadeSuperior);
    System.out.println("São elas:" + output);
    
    scan.close();
  }
}
