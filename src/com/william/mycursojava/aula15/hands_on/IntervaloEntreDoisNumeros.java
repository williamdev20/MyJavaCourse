package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class IntervaloEntreDoisNumeros {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Diga-me um número: ");
        int num1 = perg.nextInt();
        System.out.print("Diga-me outro número: ");
        int num2 = perg.nextInt();
        System.out.println("Os números de intervalo entre " + num1 + " e " + num2 + " é: ");
        if (num1 < num2) {
            System.out.println("caiu no bloco 1");
            while (num1 < (num2-1)) {
                num1++;
                System.out.print(num1 + " ");
            }
        } else if (num2 < num1) {
            System.out.println("caiu no bloco 2");
            while (num2 < (num1-1)) {
                num2++;
                System.out.print(num2 + " ");
            }
        }

        perg.close();
    }
}
