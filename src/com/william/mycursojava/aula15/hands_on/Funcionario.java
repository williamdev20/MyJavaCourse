package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class Funcionario {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Segue os pratos do nosso cardápio: ");
    System.out.println("Especificação       Código      Preço\n");
    System.out.println("Cachorro quente      100        R$1,20");
    System.out.println("Bauru simples        101        R$1,30");
    System.out.println("Bauru com ovo        102        R$1,50");
    System.out.println("Hambúrguer           103        R$1,20");
    System.out.println("Cheeseburguer        104        R$1,30");
    System.out.println("Refrigerante         105        R$1,00");

    int produto;
    int quant;

    double precoHotDog = 0;
    double precoBauruSimples = 0;
    double precoBauruOvo = 0;
    double precoHamburguer = 0;
    double precoCheeseburguer = 0;
    double precoRefrigerante = 0;

    do {
      System.out
          .println("\nDesejas comprar algo? (digite o código do produto ou tecle 0 caso não queira comprar nada)?");
      produto = scan.nextInt();

      if (produto == 100) {
        System.out.println("Você escolheu cachorro quente. Quantas unidades desejas?");
        quant = scan.nextInt();
        precoHotDog = 1.20 * quant;
        System.out.printf("Valor total de cachorro quente R$%.2f", precoHotDog);
      }

      if (produto == 101) {
        System.out.println("Você escolheu bauru simples. Quantas unidades desejas?");
        quant = scan.nextInt();
        precoBauruSimples = 1.30 * quant;
        System.out.printf("Valor total de bauru simples R$%.2f", precoBauruSimples);
      }

      if (produto == 102) {
        System.out.println("Você escolheu bauru com ovo. Quantas unidades desejas?");
        quant = scan.nextInt();
        precoBauruOvo = 1.50 * quant;
        System.out.printf("Valor total de bauru com ovo R$%.2f", precoBauruOvo);
      }

      if (produto == 103) {
        System.out.println("Você escolheu hambúrguer. Quantas unidades desejas?");
        quant = scan.nextInt();
        precoHamburguer = 1.20 * quant;
        System.out.printf("Valor total de hambúrguer R$%.2f", precoHamburguer);
      }

      if (produto == 104) {
        System.out.println("Você escolheu cheeseburguer. Quantas unidades desejas?");
        quant = scan.nextInt();
        precoCheeseburguer = 1.30 * quant;
        System.out.printf("Valor total de cheeseburguer R$%.2f", precoCheeseburguer);
      }

      if (produto == 105) {
        System.out.println("Você escolheu Refrigerante. Quantas unidades desejas?");
        quant = scan.nextInt();
        precoRefrigerante = 1 * quant;
        System.out.printf("Valor total de refrigerante R$%.2f", precoRefrigerante);
      }

    } while (produto != 0);
    // while(produto == 100 || produto == 101 || produto == 102 || produto == 103 ||
    // produto == 104 || produto == 105);

    double total = precoHotDog + precoBauruSimples + precoBauruOvo + precoHamburguer + precoCheeseburguer
        + precoRefrigerante;

    System.out.printf("Sua compra gerou um valor total de R$%.2f", total);
    System.out.println("\nObrigado e volte sempre!");
    scan.close();

  }
}
