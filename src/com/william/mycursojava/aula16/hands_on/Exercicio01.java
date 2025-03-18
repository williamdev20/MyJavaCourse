package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;
// Exercício que onde o valor de A é o mesmo que o de B
public class Exercicio01 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] valoresA = new int[5];
    System.out.println("Digite 5 números inteiros para colocar dentro do array A");
    
    for (int i = 0; i < valoresA.length; i++) {
      System.out.println("Digite o valor " + (i+1) + ": ");
      valoresA[i] = scan.nextInt();
    }

    System.out.print("Se A = [");
    for (int valA : valoresA) {
      System.out.print(valA + ", ");
    }
    System.out.print("]");

    System.out.print("\nLogo, ");
    int[] valoresB = new int[5];
    
    System.out.print("B = [");
    for (int j = 0; j < valoresB.length; j++) {
      valoresB[j] = valoresA[j];
      System.out.print(valoresB[j] + ", ");
    }
    System.out.println("]");

    scan.close();
  }
}
