package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class NumerosPrimos {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite até onde você gostaria de ver números primos: ");
    int quantNum = scan.nextInt();

    for (int i = 2; i <= quantNum; i++) {
      boolean primo = true;

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          primo = false;
          break;
        }
      }
      if (primo) {
        System.out.println(i + " é um número primo!");
      }
    }
    scan.close();
  }
}
