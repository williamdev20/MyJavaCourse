package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class JogoDaVelha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int linha = 3;
        int coluna = 3;
        char[][] tabuleiro = new char[linha][coluna];
        boolean ganhar = false;


        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

        do {
            System.out.println("Digite a linha: ");
            linha = scan.nextInt();
            System.out.print("Digite a coluna: ");
            coluna = scan.nextInt();
            System.out.print("Digite a peça: ");
            tabuleiro[linha][coluna] = scan.next().charAt(0);

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                }
                System.out.println();
            }
        } while(!ganhar);
    }
}
