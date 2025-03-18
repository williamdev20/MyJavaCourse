package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class MediaDasIdades {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Quantas pessoas você gostaria de saber a idade? ");
        int quantPessoas = perg.nextInt();
        double soma = 0;
        double media;

        for (int i = 0; i < quantPessoas; i++) {
            System.out.print("Qual a idade da " + (i+1) + "º pessoa? ");
            int idades = perg.nextInt();
            if (idades < 0) {
                while (idades < 0) {
                    System.out.print("Por favor, tente novamente com uma idade maior que 0! ");
                    idades = perg.nextInt();
                }
            }
            soma += idades;
        }

        media = soma/quantPessoas;
        System.out.println("A soma das idades é " + Math.floor(soma));
        System.out.println("A média das idades é " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A média das idades representa uma grande quantidade de pessoas jovens (entre 0 e 25 anos de idade)");
        }
        if (media > 25 && media <= 60) {
            System.out.println("A média das idades representa uma grande quantidade de pessoas adultas (entre 26 e 60 anos de idade)");
        }
        if (media > 60) {
            System.out.println("A média das idades representa uma grande quantidade de pessoas idosas (mais de 60 anos de idade)");
        }

        perg.close();
    }
}
