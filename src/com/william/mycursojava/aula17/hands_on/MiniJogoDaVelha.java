package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class MiniJogoDaVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linha = 3;
        int coluna = 3;
        int posLinha;
        int posColuna;
        char[][] tabuleiro = new char[linha][coluna];
        boolean[][] isTrueTabuleiroX =  new boolean[linha][coluna];
        boolean[][] isTrueTabuleiroO = new boolean[linha][coluna];
        boolean ganhar = false;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.printf("%d ", (j + 1));
            }
            System.out.println();
        }

        do {
            System.out.println("Escolha a linha que desejas jogar: ");
            posLinha = scan.nextInt();
            posLinha--;

            System.out.println("Escolha a coluna que desejas jogar: ");
            posColuna = scan.nextInt();
            posColuna--;

            System.out.println("Escolha a peça (X-O): ");
            linha = posLinha;
            coluna = posColuna;
            tabuleiro[linha][coluna] = scan.next().charAt(0);


            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'x') {

                        if (isTrueTabuleiroX[i][j]) {
                            System.out.printf("%c ", tabuleiro[linha][coluna]);

                        } else if (i == posLinha && j == posColuna) {
                            linha = posLinha;
                            coluna = posColuna;
                            System.out.printf("%c ", tabuleiro[linha][coluna]);
                            isTrueTabuleiroX[linha][coluna] = true;

                        } else {
                            System.out.printf("%d ", (j + 1));
                        }

                        // Exibindo as peças do tabuleiro O no tabuleiro de peças X
                        if (isTrueTabuleiroO[i][j]) {
                            System.out.printf("%c ", tabuleiro[linha][coluna]);
                        }


                    } else if (tabuleiro[linha][coluna] == 'O' || tabuleiro[linha][coluna] == 'o') {

                        if (isTrueTabuleiroO[i][j]) {
                            System.out.printf("%c ", tabuleiro[linha][coluna]);

                        } else if (i == linha && j == coluna) {
                            System.out.printf("%c ", tabuleiro[linha][coluna]);
                            linha = posLinha;
                            coluna = posColuna;
                            isTrueTabuleiroO[linha][coluna] = true;

                        } else {
                            System.out.printf("%d ", (j + 1));
                        }

                        // Exibindo as peças do tabuleiro X no tabuleiro de peças O
                        if (isTrueTabuleiroX[i][j]) {
                            System.out.printf("%c ", tabuleiro[linha][coluna]);
                        }
                    }
                }
                System.out.println();
            }
        } while (!ganhar);

        scan.close();
    }
}