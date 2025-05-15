package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println((i+1) + " valor: ");
            vetorA[i] = scan.nextInt();
        }
    }
}
