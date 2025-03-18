package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class MediaDoValorDeCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos CDs você tem?");
        int quantCDs = scan.nextInt();

        double soma = 0;
        double media;

        for (int i = 0; i < quantCDs; i++) {
            System.out.print("Quanto custou o CD " + (i+1) + "? ");
            double valor = scan.nextDouble();
            soma += valor;
        }

        media = soma/quantCDs;

        System.out.format("O valor total investido em CDs foi de R$%.2f", soma);
        System.out.format("\nE a média de preço dos CDs foi de R$%.2f", media);

        scan.close();
    }
}
