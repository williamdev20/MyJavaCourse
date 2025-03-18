package com.william.mycursojava.aula16.hands_on;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 números e eu lhe direi a soma dos que forem múltiplos de 5");
        
        int[] vetorA = new int[10];
        String output = "";
        int soma = 0;
        int ehMultiplo = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Digite o valor %d: \n", (i+1));
            vetorA[i] = scan.nextInt();
            
            if (vetorA[i] % 10 == 0 || vetorA[i] % 10 == 5) {
                output += vetorA[i] + ", ";
                soma += vetorA[i];
                ehMultiplo++;
            }
        }
        
        if (ehMultiplo == 0) {
            System.out.println("Não foram registrados nenhum número que seja múltiplo de 5!");
        } else {
            System.out.print("Os números listados que são múltiplos de 5 foram [" + output);
            System.out.print("] \n");
            System.out.println("E a soma é " + soma);    
        }
        
        scan.close();
    }
}
