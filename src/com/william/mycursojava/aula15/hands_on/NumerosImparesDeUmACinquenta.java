package com.william.mycursojava.aula15.hands_on;

public class NumerosImparesDeUmACinquenta {
    public static void main(String[] args) {
        System.out.println("Os números ímpares de 1 a 50 são: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
