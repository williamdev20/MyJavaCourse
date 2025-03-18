package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class DeUmADez {
    public static void main(String[] args) {
        Scanner pergNum = new Scanner(System.in);
        System.out.println("Digite um número entre 0 a 10: ");
        int number = pergNum.nextInt();
        boolean numberValido = false;
         do {
             if (number >= 0 && number <= 10) {
                 numberValido = true;
                 System.out.println("O seu número foi: " + number);
             } else {
                 System.out.println("Por favor, tente novamente: ");
                 number = pergNum.nextInt();
             }
         } while (!numberValido);

        pergNum.close();
    }
}
