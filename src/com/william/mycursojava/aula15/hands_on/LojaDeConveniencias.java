package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class LojaDeConveniencias {
  public static void main(String[] args) {
    Scanner perg = new Scanner(System.in);
    System.out.println("Bem vindo ao Mercado Tabajara do Sr. Manoel Joaquim!");
    System.out.println("Segue os produtos que temos neste mercadinho:\n");
    System.out.println(
        "Picanha até 5Kg - R$7,80 Acima de 5Kg R$8,90; Café São Braz - R$6,50; Pão unidade -  R$1,50; Biscoito Treloso - R$ 3,50; Paçoca pote de 65 unidades - R$13,50");

    double valorCarne = 0;
    double valorCafe = 0;
    double valorPao = 0;
    double valorBiscoito = 0;
    double valorPacoca = 0;
    boolean comprarMais = true;
    double valorTotal = 0;
    String quererMais;

    do {
      System.out.println("Desejas comprar algo (S - digite o nome do produto - N)? ");
      String produto = perg.next();

      if (produto.equalsIgnoreCase("n")) {
        comprarMais = false;
      } else if (produto.equalsIgnoreCase("s")) {
        System.out.println("O que?");
        produto = perg.next();
      }
      if (produto.equalsIgnoreCase("picanha")) {
        System.out.println("Quantos quilos deseja?");
        double kg = perg.nextDouble();
        if (kg > 5) {
          valorCarne = kg * 8.90;
        } else if (kg <= 5) {
          valorCarne = kg * 7.80;
        }
      }

      if (produto.equalsIgnoreCase("café") || produto.equalsIgnoreCase("café são braz")) {
        System.out.print("Gostaria de levar mais de um café (S - N)? ");
        quererMais = perg.next();
        if (quererMais.equalsIgnoreCase("s")) {
          System.out.println("Quantos?");
          int quant = perg.nextInt();
          valorCafe = quant * 6.50;
        } else {
          valorCafe = 6.50;
        }
      }

      if (produto.equalsIgnoreCase("pão")) {
        System.out.println("Quantos pães (S - N)?");
        int quant = perg.nextInt();
        valorPao = quant * 1.50;
      }

      if (produto.equalsIgnoreCase("biscoito") || produto.equalsIgnoreCase("biscoito treloso")) {
        System.out.println("Vai querer mais de uma unidade (S - N)? ");
        quererMais = perg.next();

        if (quererMais.equalsIgnoreCase("s")) {
          System.out.println("Quantas unidades? A partir de 3 unidades fica por R$3,29");
          int quant = perg.nextInt();
          if (quant > 3) {
            valorBiscoito = quant * 3.29;
          } else {
            valorBiscoito = quant * 3.50;
          }
        }
      }
      if (produto.equalsIgnoreCase("paçoca") || produto.equalsIgnoreCase("pacoca")) {
        System.out.println("Apenas um pote (S - N)?");
        quererMais = perg.next();
        if (quererMais.equalsIgnoreCase("n")) {
          System.out.println("Quantos?");
          int quant = perg.nextInt();
          valorPacoca = quant * 13.50;
        } else if (quererMais.equalsIgnoreCase("s")) {
          valorPacoca = 13.50;
        }
      }

      valorTotal = valorCarne + valorCafe + valorPao + valorBiscoito + valorPacoca;

    } while (comprarMais);

    System.out.format("O total da compra deu R$%.2f\n", valorTotal);
    System.out.print("Aguardando o dinheiro para finalizar a compra: R$");

    double valorAPagar = perg.nextDouble();

    if (valorAPagar < valorTotal) {
      while (valorAPagar < valorTotal) {
        System.out.print(
            "Dinheiro menor que o total que você deve pagar. Por favor, tente novamente com uma quantia mais alta R$");
        valorAPagar = perg.nextDouble();
      }
    }

    double troco = valorAPagar - valorTotal;

    System.out.printf("\nAqui está seu troco R$%.2f", troco);
    perg.close();
  }
}
