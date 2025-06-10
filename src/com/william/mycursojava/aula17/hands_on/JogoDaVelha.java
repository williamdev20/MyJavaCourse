package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-=-=-=-=-JOGO DA VELHA-=-=-=-=-");

        int linha = 3;
        int coluna = 3;
        int[][] tabuleiro = new int[linha][coluna];

        int jogador = 0;
        int jogaPrimeiro = 0;
        //int espaco;
        boolean ganhar = false;
        boolean espacoValido = true;

        char X = 'X';
        char O = 'O';

        // Imprimindo o tabuleiro na tela
        for (int i = 0; i < tabuleiro.length; i++) {
            if (i == 0) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (j == 0) {
                        System.out.printf(" %d | ", j + 1);
                    } else if (j == 2) {
                        System.out.printf("%d", j + 1);
                    } else {
                        System.out.printf("%d | ", j + 1);
                    }
                }
            }

            if (i == 1) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (j == 0) {
                        System.out.printf(" %d | ", j + 4);
                    } else if (j == 2) {
                        System.out.printf("%d", j + 4);
                    } else {
                        System.out.printf("%d | ", j + 4);
                    }
                }
            }

            if (i == 2) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (j == 0) {
                        System.out.printf(" %d | ", j + 7);
                    } else if (j == 2) {
                        System.out.printf("%d", j + 7);
                    } else {
                        System.out.printf("%d | ", j + 7);
                    }
                }
            }
            System.out.println();
            if (i == 2) {
                System.out.println();
            } else {
                System.out.println("---|---|---");
            }
        }

        System.out.println("1. Jogador1 -> X");
        System.out.println("2. Jogador2 -> O");
        System.out.print("Escolha: ");
        jogador = scan.nextInt();


        // Imprimir o tabuleiro novamente
        for (int i = 0; i < tabuleiro.length; i++) {
            if (i == 0) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (j == 0) {
                        System.out.printf(" %d | ", j + 1);
                    } else if (j == 2) {
                        System.out.printf("%d", j + 1);
                    } else {
                        System.out.printf("%d | ", j + 1);
                    }
                }
            }

            if (i == 1) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (j == 0) {
                        System.out.printf(" %d | ", j + 4);
                    } else if (j == 2) {
                        System.out.printf("%d", j + 4);
                    } else {
                        System.out.printf("%d | ", j + 4);
                    }
                }
            }

            if (i == 2) {
                for (int j = 0; j < tabuleiro[i].length; j++) {

                    if (j == 0) {
                        System.out.printf(" %d | ", j + 7);
                    } else if (j == 2) {
                        System.out.printf("%d", j + 7);
                    } else {
                        System.out.printf("%d | ", j + 7);
                    }
                }
            }
            System.out.println();
            if (i == 2) {
                System.out.println();
            } else {
                System.out.println("---|---|---");
            }
        }


        do {
            // Captar o espaço que o jogador deseja
            if (jogaPrimeiro % 2 == 0) {
                System.out.print("Jogador X, escolha um espaço para jogar: ");
                tabuleiro[linha][coluna] = scan.nextInt();
                if (tabuleiro[linha][coluna] < 1 || tabuleiro[linha][coluna] > 9) {
                    do {
                        System.out.print("Espaço inválido! Escolha um espaço adequado: ");
                        tabuleiro[linha][coluna] = scan.nextInt();
                    } while (tabuleiro[linha][coluna] < 1 || tabuleiro[linha][coluna] > 9);

                }

                if (tabuleiro[linha][coluna] > 0 && tabuleiro[linha][coluna] <= 3) {
                    linha = 0;
                    tabuleiro[linha][coluna] = 'X';
                } else if (tabuleiro[linha][coluna] > 3 && tabuleiro[linha][coluna] <= 6) {
                    linha = 1;
                    tabuleiro[linha][coluna] = 'X';
                } else if (tabuleiro[linha][coluna] > 6 && tabuleiro[linha][coluna] <= 9) {
                    linha = 2;
                    tabuleiro[linha][coluna] = 'X';
                }

                jogaPrimeiro++;
            } else {
                System.out.print("Jogador O, escolha um espaço para jogar: ");
                tabuleiro[linha][coluna] = scan.nextInt();
                if (tabuleiro[linha][coluna] < 1 || tabuleiro[linha][coluna] > 9) {
                    do {
                        System.out.print("Espaço inválido! Escolha um espaço adequado: ");
                        tabuleiro[linha][coluna] = scan.nextInt();
                    } while (tabuleiro[linha][coluna] < 1 || tabuleiro[linha][coluna] > 9);
                }

                if (tabuleiro[linha][coluna] > 0 && tabuleiro[linha][coluna] <= 3) {
                    linha = 0;
                    tabuleiro[linha][coluna] = 'O';
                } else if (tabuleiro[linha][coluna] > 3 && tabuleiro[linha][coluna] <= 6) {
                    linha = 1;
                    tabuleiro[linha][coluna] = 'O';
                } else if (tabuleiro[linha][coluna] > 6 && tabuleiro[linha][coluna] <= 9) {
                    linha = 2;
                    tabuleiro[linha][coluna] = 'O';
                }

                jogaPrimeiro++;
            }
            // Imprimir o tabuleiro novamente
            for (int i = 0; i < tabuleiro.length; i++) {
                if (i == linha) {


                    if (i == 0) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {

                            if (j == 0) {
                                System.out.printf(" %d | ", tabuleiro[linha][coluna]);
                            } else if (j == 2) {
                                System.out.printf("%d", j + 1);
                            } else {
                                System.out.printf("%d | ", j + 1);
                            }
                        }
                    }

                    if (i == 1) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {

                            if (j == 0) {
                                System.out.printf(" %d | ", j + 4);
                            } else if (j == 2) {
                                System.out.printf("%d", j + 4);
                            } else {
                                System.out.printf("%d | ", j + 4);
                            }
                        }
                    }

                    if (i == 2) {
                        for (int j = 0; j < tabuleiro[i].length; j++) {

                            if (j == 0) {
                                System.out.printf(" %d | ", j + 7);
                            } else if (j == 2) {
                                System.out.printf("%d", j + 7);
                            } else {
                                System.out.printf("%d | ", j + 7);
                            }
                        }
                    }
                    System.out.println();
                    if (i == 2) {
                        System.out.println();
                    } else {
                        System.out.println("---|---|---");
                    }
                }
            }
        } while (!ganhar);


        scan.close();
    }
}