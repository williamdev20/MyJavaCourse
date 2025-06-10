package com.william.mycursojava.aula17.hands_on;

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] matriz = new int[4][4];
        int maior = 0;
        int posicaoLinha = 0;
        int posicaoColuna = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(10);
                System.out.printf("matriz[%d][%d] = %d\n", i, j, matriz[i][j]);

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posicaoLinha = i;
                    posicaoColuna = j;
                }
            }
            System.out.println();
        }

        System.out.println("O maior número da matriz foi: " + maior);
        System.out.println("A posição da linha é: " + posicaoLinha);
        System.out.println("A posição da coluna é: " + posicaoColuna);
    }

}