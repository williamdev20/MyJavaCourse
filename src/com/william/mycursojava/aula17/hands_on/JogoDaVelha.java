package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int linha = 3;
        int coluna = 3;
        char[][] tabuleiro = new char[linha][coluna];
        boolean ganhar = false;
        int posicao;
        int jogaPrimeiro = 0;
        int pecaOcupada = 0;
        boolean[][] ocupado = new boolean[linha][coluna];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] != '\0') {
                    if (j == 2) {
                        System.out.printf("%c", tabuleiro[i][j]);
                    } else {
                        System.out.printf("%c|", tabuleiro[i][j]);
                    }
                }

                if (tabuleiro[i][j] == '\0') {
                    if (i == 0) {
                        if (j == 2) {
                            System.out.printf("%d", (j + 1));
                        } else {
                            System.out.printf("%d|", (j + 1));
                        }
                    } else if (i == 1) {
                        if (j == 2) {
                            System.out.printf("%d", (j + 4));
                        } else {
                            System.out.printf("%d|", (j + 4));
                        }
                    } else {
                        if (j == 2) {
                            System.out.printf("%d", (j + 7));
                        } else {
                            System.out.printf("%d|", (j + 7));
                        }
                    }
                }

            }
            System.out.println();
        }

        while (!ganhar) {
            if (jogaPrimeiro % 2 == 0) {
                System.out.print("Jogador X, digite a posição que desejas jogar: ");
                posicao = input.nextInt();
                jogaPrimeiro++;

                if (posicao == 1) {
                    linha = 0;
                    coluna = 0;
                } else if (posicao == 2) {
                    linha = 0;
                    coluna = 1;
                } else if (posicao == 3) {
                    linha = 0;
                    coluna = 2;
                } else if (posicao == 4) {
                    linha = 1;
                    coluna = 0;
                } else if (posicao == 5) {
                    linha = 1;
                    coluna = 1;
                } else if (posicao == 6) {
                    linha = 1;
                    coluna = 2;
                } else if (posicao == 7) {
                    linha = 2;
                    coluna = 0;
                } else if (posicao == 8) {
                    linha = 2;
                    coluna = 1;
                } else if (posicao == 9) {
                    linha = 2;
                    coluna = 2;
                }

                if (ocupado[linha][coluna]) {
                    while (ocupado[linha][coluna]) {
                        System.out.println("Essa posição já está ocupada! Tente novamente! ");
                        System.out.print("Jogador X, digite a posição que desejas jogar: ");
                        posicao = input.nextInt();
                        if (posicao == 1) {
                            linha = 0;
                            coluna = 0;
                        } else if (posicao == 2) {
                            linha = 0;
                            coluna = 1;
                        } else if (posicao == 3) {
                            linha = 0;
                            coluna = 2;
                        } else if (posicao == 4) {
                            linha = 1;
                            coluna = 0;
                        } else if (posicao == 5) {
                            linha = 1;
                            coluna = 1;
                        } else if (posicao == 6) {
                            linha = 1;
                            coluna = 2;
                        } else if (posicao == 7) {
                            linha = 2;
                            coluna = 0;
                        } else if (posicao == 8) {
                            linha = 2;
                            coluna = 1;
                        } else if (posicao == 9) {
                            linha = 2;
                            coluna = 2;
                        }
                    }
                }
                ocupado[linha][coluna] = true;
                tabuleiro[linha][coluna] = 'X';
                pecaOcupada++;
            } else {
                System.out.print("Jogador O, digite a posição que desejas jogar: ");
                posicao = input.nextInt();
                jogaPrimeiro++;

                if (posicao == 1) {
                    linha = 0;
                    coluna = 0;
                } else if (posicao == 2) {
                    linha = 0;
                    coluna = 1;
                } else if (posicao == 3) {
                    linha = 0;
                    coluna = 2;
                } else if (posicao == 4) {
                    linha = 1;
                    coluna = 0;
                } else if (posicao == 5) {
                    linha = 1;
                    coluna = 1;
                } else if (posicao == 6) {
                    linha = 1;
                    coluna = 2;
                } else if (posicao == 7) {
                    linha = 2;
                    coluna = 0;
                } else if (posicao == 8) {
                    linha = 2;
                    coluna = 1;
                } else if (posicao == 9) {
                    linha = 2;
                    coluna = 2;
                }

                if (ocupado[linha][coluna]) {
                    while (ocupado[linha][coluna]) {
                        System.out.println("Essa posição já está ocupada! Tente novamente! ");
                        System.out.print("Jogador O, digite a posição que desejas jogar: ");
                        posicao = input.nextInt();
                        if (posicao == 1) {
                            linha = 0;
                            coluna = 0;
                        } else if (posicao == 2) {
                            linha = 0;
                            coluna = 1;
                        } else if (posicao == 3) {
                            linha = 0;
                            coluna = 2;
                        } else if (posicao == 4) {
                            linha = 1;
                            coluna = 0;
                        } else if (posicao == 5) {
                            linha = 1;
                            coluna = 1;
                        } else if (posicao == 6) {
                            linha = 1;
                            coluna = 2;
                        } else if (posicao == 7) {
                            linha = 2;
                            coluna = 0;
                        } else if (posicao == 8) {
                            linha = 2;
                            coluna = 1;
                        } else if (posicao == 9) {
                            linha = 2;
                            coluna = 2;
                        }
                    }
                }

                ocupado[linha][coluna] = true;
                tabuleiro[linha][coluna] = 'O';
                pecaOcupada++;
            }


            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    if (tabuleiro[i][j] != '\0') {
                        if (j == 2) {
                            System.out.printf("%c", tabuleiro[i][j]);
                        } else {
                            System.out.printf("%c|", tabuleiro[i][j]);
                        }

                    }

                    if (tabuleiro[i][j] == '\0') {
                        if (i == 0) {
                            if (j == 2) {
                                System.out.printf("%d", (j + 1));
                            } else {
                                System.out.printf("%d|", (j + 1));
                            }
                        } else if (i == 1) {
                            if (j == 2) {
                                System.out.printf("%d", (j + 4));
                            } else {
                                System.out.printf("%d|", (j + 4));
                            }
                        } else {
                            if (j == 2) {
                                System.out.printf("%d", (j + 7));
                            } else {
                                System.out.printf("%d|", (j + 7));
                            }
                        }
                    }

                }
                System.out.println();
            }

            // Verificando se ganhou
            if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ||
            tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X' ||
            tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ||
            tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ||
            tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ||
            tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ||
            tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ||
            tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X'){
                System.out.println("O JOGADOR X GANHOU!");
                ganhar = true;

            } else if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ||
                    tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O' ||
                    tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ||
                    tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ||
                    tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ||
                    tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ||
                    tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ||
                    tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
                System.out.println("O JOGADOR O GANHOU!");
                ganhar = true;

            } else if (pecaOcupada >= 9) {
                System.out.println("O JOGO DEU VELHA!");
                ganhar = true;
            }
        }

        input.close();
    }
}