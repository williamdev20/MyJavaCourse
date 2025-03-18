package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class OMaiorEntreCincoNumeros {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.println("Este é um programa que irá informar qual é o maior entre 5 números escolhidos por você! Vamos lá!\n");
        System.out.println("Digite o 1º número: ");
        int num1 = perg.nextInt();
        System.out.println("Digite o 2º número: ");
        int num2 = perg.nextInt();
        System.out.println("Digite o 3º número:");
        int num3 = perg.nextInt();
        System.out.println("Digite o 4º número: ");
        int num4 = perg.nextInt();
        System.out.println("Digite o 5º número: ");
        int num5 = perg.nextInt();

       int maiorNum1 =  Math.max(num1, num2);
       int maiorNum2 = Math.max(maiorNum1, num3);
       int maiorNum3 = Math.max(maiorNum2, num4);
       int maiorNum4 = Math.max(maiorNum3, num5);

       int maiorNumAll = maiorNum4;
        System.out.println("O maior entre todos os números listados por você é: " + maiorNumAll);

        perg.close();
    }
}
