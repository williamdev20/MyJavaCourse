package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class MediaDeAlunosPorTurma {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Quantas turmas há em uma escola? ");
        int quantTurmas = perg.nextInt();
        double soma = 0;
        double media;

        for (int i = 0; i < quantTurmas; i++) {
            System.out.println("Qual a quantidade de alunos na turma " + (i + 1) + ". OBS: UMA TURMA NÃO PODE TER MAIS DE 40 ANOS!");
            int alunos = perg.nextInt();

            if (alunos > 40) {
                while (alunos > 40) {
                    System.out.print("Uma turma não pode ter mais que 40 alunos. Por favor, tente novamente: ");
                    alunos = perg.nextInt();
                }
            }

            soma += alunos;
        }

            media = soma/quantTurmas;
            System.out.println("A média da quantidade de alunos por turma é de " + media);

            perg.close();

    }
}
