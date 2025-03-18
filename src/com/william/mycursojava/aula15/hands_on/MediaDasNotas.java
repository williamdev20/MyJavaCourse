package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class MediaDasNotas {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Quantas avaliações de matemáica haverão neste ano letivo de 2025? ");
        int quantNotas = perg.nextInt();
        System.out.println("Agora vamos para as notas!");
        float soma = 0;

        for (int i = 1; i <= quantNotas; i++) {
            System.out.print(i + "º nota: ");
            int numbers = perg.nextInt();
            soma += numbers;
        }

        float media = soma/quantNotas;
        System.out.println("A média das notas desse aluno é " + media);

        perg.close();
    }
}
