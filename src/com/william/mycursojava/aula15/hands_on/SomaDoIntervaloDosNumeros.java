package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class SomaDoIntervaloDosNumeros {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Diga-me um número: ");
        int num1 = perg.nextInt();
        System.out.print("Diga-me outro número número: ");
        int num2 = perg.nextInt();
        System.out.println("Os números do intervalo compreendido entre " + num1 + " e " + num2 + " é: ");
        int somaDosIntervalos = 0;

        if (num1 < num2) {
            while (num1 < (num2-1)) {
                num1++;
                somaDosIntervalos += num1;
                System.out.println(num1 + " ");
            }
        } else if (num2 < num1) {
            while (num2 < (num1 - 1)) {
                num2++;
                somaDosIntervalos += num2;
                System.out.println(num2 + " ");
            }
        }
        System.out.println("A soma dos números do intervalo é: " + somaDosIntervalos);

        perg.close();
    }
}
