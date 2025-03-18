package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class PotenciaSemAfuncaoNativa {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao programa de potenciação da marra!");
        System.out.print("Digite o número base: ");
        int numBase = perg.nextInt();
        System.out.print("Qual vai ser o expoente? ");
        int expoente = perg.nextInt();

        int potencia = numBase;

        for (int i = 1; i < expoente; i++) {
            potencia *= numBase;
        }
        System.out.println(numBase + " elevado a " + expoente + " é: " + potencia);

        perg.close();
    }
}
