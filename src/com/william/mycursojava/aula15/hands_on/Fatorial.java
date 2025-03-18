package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner perg = new Scanner(System.in);
    System.out.print("Qual número você gostaria de ver o fatorial? ");
    int num = perg.nextInt();
    int numOrigin = num;
    int mult = 1;
    for (int i = 0; num > i; num--) {
      mult *= num;
    }
    System.out.println(numOrigin +"! = " + mult);

    perg.close();
  }
}
