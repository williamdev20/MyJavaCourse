package com.william.mycursojava.aula15.hands_on;

public class EnesimoTermoMaiorQueQuinhentos {
  public static void main(String[] args) {
    // Sequência: (2, 5, 8, 11, 14 ...) R = 3
    // Objetivo: descobrir qual é o termo que vai ser maior que 500
    int termo = 1;
    int razao = 3;
    int termoGeral = 2 + (termo - 1) * razao;
    for (int i = termo; termoGeral <= 500; i++) {
      termoGeral = 2 + (i - 1) * razao;
      if (termoGeral >= 500) {
        System.out.println("O " + i + "º termo é: " + termoGeral);
        break;
      }

    }
  }
}
