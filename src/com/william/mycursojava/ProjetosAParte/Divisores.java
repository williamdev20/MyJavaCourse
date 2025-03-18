package com.william.mycursojava.ProjetosAParte;

import java.util.Scanner;

public class Divisores {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);
    System.out.print("Digite um número que você queira saber os seus divisores: ");
    int numDivs = pergNum.nextInt(); // Número do usuário para descobrir os divisores
    int divisor = 1; // O divisor

    while (divisor <= numDivs) {
      if (numDivs % divisor == 0) {
        System.out.println("Divisor " + divisor);
        divisor++;
      } else {
        divisor++;
        //continue;
      }
    }

    

    pergNum.close();
  }
}
