package com.william.mycursojava.ProjetosAParte;

import java.util.Scanner;;

public class Multiplos {
  public static void main(String[] args) {
    Scanner pergNum = new Scanner(System.in);
    System.out.print("Digite um número que você deseja saber os múltiplos: ");
    int numMult = pergNum.nextInt();
    System.out.print("Quantos múltiplos você deseja saber? ");
    int quantNum = pergNum.nextInt();
    int quant = 0;
    int mult = 0;

    do {
      System.out.println("Múltiplo: " + mult);
      quant++;
      mult = numMult * quant;

    } while (quant <= quantNum);

    pergNum.close();
  }
}
