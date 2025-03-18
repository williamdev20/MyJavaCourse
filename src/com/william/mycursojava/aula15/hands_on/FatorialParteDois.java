package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class FatorialParteDois {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número e eu lhe direi o seu fatorial: ");
    int num = scan.nextInt();
    int fatorial = 1;

    System.out.print(num + "! = ");

    for (int i = 1; i <= num; num--) {
      System.out.print(num);
      if (num != 1) {
        System.out.print(" . ");
      } else {
        break;
      }
      fatorial *= num;
    }
    System.out.print(" = " + fatorial + "\n");

    scan.close();
  }
}
