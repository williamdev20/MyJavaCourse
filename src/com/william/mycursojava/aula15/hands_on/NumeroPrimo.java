package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Digite um número e eu lhe direi se ele é primo ou não! ");
        int num = perg.nextInt();
        int divisivel = 0;

        if (num == 1) {
            while (num == 1) {
                System.out.print("O número 1 não é um número primo. Por favor, tente novamente! ");
                num = perg.nextInt();
            }
        }
        //Começo do código
        for (int i = 1; num >= i; i++) {
           if (num % i ==  0){
               divisivel++;
           }
        }

        if (divisivel > 2) {
            System.out.println(num + " não é um número primo!");
        } else {
            System.out.println(num + " é um número primo!");
        }

        perg.close();
    }
}
