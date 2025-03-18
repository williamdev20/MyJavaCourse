package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class Temperaturas {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Quantas temperaturas gostaria de registrar? ");
    int quantTemp = scan.nextInt();
    double maiorTemp = Double.MIN_VALUE;
    double menorTemp = Double.MAX_VALUE;
    double soma = 0;

    for (int i = 0; i < quantTemp; i++) {
      System.out.println("Digite a temperatura " + (i + 1) + ": ");
      double temp = scan.nextDouble();
      soma += temp;
      if (temp > maiorTemp) {
        maiorTemp = temp;
      }
      if (temp < menorTemp) {
        menorTemp = temp;
      }
    }

    System.out.println("A menor temperatura registrada foi: " + menorTemp + "°C");
    System.out.println("A maior temperatura registrada foi: " + maiorTemp + "°C");
    System.out.println("A média das temperaturas foi de " + (soma / quantTemp) + "°C");
    scan.close();
  }
}
