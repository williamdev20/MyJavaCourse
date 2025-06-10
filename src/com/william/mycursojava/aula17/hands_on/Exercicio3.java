package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int qtdPares = 0;
        int qtdImpares = 0;
        String pares = "";
        String impares = "";


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o %dº valor: ", (j+1));
                matriz[i][j] = scan.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    qtdPares++;
                    pares += matriz[i][j] + " ";
                } else {
                    qtdImpares++;
                    impares += matriz[i][j] + " ";
                }

            }
        }

        System.out.printf("Quantidade de número pares: %d\n", qtdPares);
        System.out.printf("São eles: %s\n", pares);
        System.out.printf("Quantidade de números impares: %d\n", qtdImpares);
        System.out.printf("São eles: %s\n", impares);

        scan.close();
    }
}
