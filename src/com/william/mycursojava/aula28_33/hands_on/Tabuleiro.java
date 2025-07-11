package com.william.mycursojava.aula28_33.hands_on;

import java.util.Scanner;

public class Tabuleiro {
    private final Scanner scan = new Scanner(System.in);
    private char[][] tabuleiro;
    private int posicao;
    private boolean ganhar;
    private int pecaOcupada;
    private int linha;
    private int coluna;

    public Tabuleiro() {
        tabuleiro = new char[3][3];
        ganhar = false;
    }

    private char[][] getTabuleiro() {
        return tabuleiro;
    }

    private void setTabuleiro(char[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    private boolean isGanhar() {
        return ganhar;
    }

    private void setGanhar(boolean ganhar) {
        this.ganhar = ganhar;
    }

    private int getPecaOcupada() {
        return pecaOcupada;
    }

    private void setPecaOcupada(int pecaOcupada) {
        this.pecaOcupada = pecaOcupada;
    }

    private int getLinha() {
        return linha;
    }

    private void setLinha(int linha) {
        this.linha = linha;
    }

    private int getColuna() {
        return coluna;
    }

    private void setColuna(int coluna) {
        this.coluna = coluna;
    }

    private int getPosicao() {
        return posicao;
    }

    private void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    private void mostrarTabuleiro() {
        for (int i = 0; i < getTabuleiro().length; i++) {
            for (int j = 0; j < getTabuleiro()[i].length; j++) {
                if (tabuleiro[i][j] != '\0') {
                    System.out.print(getTabuleiro()[i][j] + " ");
                }
                if (tabuleiro[i][j] == '\0') {
                    if (i == 0) {
                        System.out.print((j + 1) + " ");
                    } else if (i == 1) {
                        System.out.print((j + 4) + " ");
                    } else {
                        System.out.print((j + 7) + " ");
                    }
                }
            }
            System.out.println();
        }
    }

    private boolean continuarJogo() {
        if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X' ||
                tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X' ||
                tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X' ||
                tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X' ||
                tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X' ||
                tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X' ||
                tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X' ||
                tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X'){
            System.out.println("O JOGADOR X GANHOU!");
            setGanhar(true);

        } else if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O' ||
                tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O' ||
                tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O' ||
                tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O' ||
                tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O' ||
                tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O' ||
                tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O' ||
                tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println("O JOGADOR O GANHOU!");
            setGanhar(true);

        } else if (getPecaOcupada() >= 9) {
            System.out.println("O JOGO DEU VELHA!");
            setGanhar(true);
        }

        return isGanhar();
    }

    private void jogar() {
        int jogaPrimeiro = 0;
        while (!ganhar) {
            if (jogaPrimeiro % 2 == 0) {
                System.out.println("Jogador X, digite a posição que desejas jogar: ");
                setPosicao(scan.nextInt());
                if (getPosicao() == 1) {
                    setLinha(0);
                    setColuna(0);
                } else if (getPosicao() == 2) {
                    setLinha(0);
                    setColuna(1);
                } else if (getPosicao() == 3) {
                    setLinha(0);
                    setColuna(2);
                } else if (getPosicao() == 4) {
                    setLinha(1);
                    setColuna(0);
                } else if (getPosicao() == 5) {
                    setLinha(1);
                    setColuna(1);
                } else if (getPosicao() == 6) {
                    setLinha(1);
                    setColuna(2);
                } else if (getPosicao() == 7) {
                    setLinha(2);
                    setColuna(0);
                } else if (getPosicao() == 8) {
                    setLinha(2);
                    setColuna(1);
                } else if (getPosicao() == 9) {
                    setLinha(2);
                    setColuna(2);
                }
                setPecaOcupada(pecaOcupada++);
                tabuleiro[getLinha()][getColuna()] = 'X';
                mostrarTabuleiro();

            } else {
                System.out.println("Jogador O, digite a posição que desejas jogar: ");
                posicao = scan.nextInt();
                if (getPosicao() == 1) {
                    setLinha(0);
                    setColuna(0);
                } else if (getPosicao() == 2) {
                    setLinha(0);
                    setColuna(1);
                } else if (getPosicao() == 3) {
                    setLinha(0);
                    setColuna(2);
                } else if (getPosicao() == 4) {
                    setLinha(1);
                    setColuna(0);
                } else if (getPosicao() == 5) {
                    setLinha(1);
                    setColuna(1);
                } else if (getPosicao() == 6) {
                    setLinha(1);
                    setColuna(2);
                } else if (getPosicao() == 7) {
                    setLinha(2);
                    setColuna(0);
                } else if (getPosicao() == 8) {
                    setLinha(2);
                    setColuna(1);
                } else if (getPosicao() == 9) {
                    setLinha(2);
                    setColuna(2);
                }
                setPecaOcupada(pecaOcupada++);
                tabuleiro[getLinha()][getColuna()] = 'O';
                mostrarTabuleiro();
            }
            jogaPrimeiro++;
            continuarJogo();
        }
    }

    public void jogarJogo() {
        mostrarTabuleiro();
        jogar();
    }
}