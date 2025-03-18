package com.william.mycursojava.aula15.hands_on;

public class DeUmAVinte {
    public static void main(String[] args) {
        System.out.println("Este é um programa de exibir números de 1 a 20 em colunas (verticais) e linhas (horizontais)\n");

        System.out.println("Em colunas: \n");
        for (int i = 1; i <= 20; i++) {
            System.out.println("Número: " + i);
        }
        System.out.println("Em linhas horizontais: \n");
        for(int count = 1; count <= 20; count++) {
            System.out.print("Número: " + count + " ");
        }
    }
}
