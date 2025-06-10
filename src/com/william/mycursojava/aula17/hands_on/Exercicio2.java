package com.william.mycursojava.aula17.hands_on;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[][] matriz = new int[10][10];
        int maiorLinha5 = Integer.MIN_VALUE;
        int menorLinha5 = Integer.MAX_VALUE;
        int maiorColuna7 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;

        int linhaMaior = 0;
        int linhaMenor = 0;
        int colunaMaior = 0;
        int colunaMenor = 0;


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ran.nextInt(10);
                System.out.printf("matriz[%d][%d] = %d\n", i, j, matriz[i][j]);


            }
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        }


        // Maior e menor LINHA
        for (int k = 0; k < matriz[5].length; k++) {
            if (matriz[5][k] > maiorLinha5) {
                maiorLinha5 = matriz[5][k];
            }
            if (matriz[5][k] < menorLinha5) {
                menorLinha5 = matriz[5][k];
            }
        }

        // Maior e menor COLUNA
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz[7].length; k++) {
                if (matriz[i][7] > maiorColuna7) {
                    maiorColuna7 = matriz[i][7];
                    linhaMaior = i;
                    colunaMaior = 7;
                }
                if (matriz[i][7] < menorColuna7) {
                    menorColuna7 = matriz[i][7];
                    linhaMenor = i;
                    colunaMenor = 7;
                }
            }
        }


        System.out.println("Maior valor da linha 5: " + maiorLinha5);
        System.out.println("Menor valor da linha 5: " + menorLinha5);
        System.out.println("Maior valor das colunas 7: " + maiorColuna7);
        System.out.println("Menor valor das colunas 7: " + menorColuna7);
        System.out.println();
        System.out.println("Linha do maior: " + linhaMaior);
        System.out.println("Coluna do maior: " + colunaMaior);
        System.out.println("Linha do menor: " + linhaMenor);
        System.out.println("Coluna do menor: " + colunaMenor);


    }
}