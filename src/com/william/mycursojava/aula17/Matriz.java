package com.william.mycursojava.aula17;

public class Matriz {
    public static void main(String[] args) {
        float[][] notasAlunos =  new float[5][4]; // 30 -> alunos | 4 -> notas

        notasAlunos[0][0] = 8;
        notasAlunos[0][1] = 4;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 4;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 9.5f;
        notasAlunos[1][3] = 2.5f;

        notasAlunos[2][0] = 4;
        notasAlunos[2][1] = 8;
        notasAlunos[2][2] = 5;
        notasAlunos[2][3] = 1.5f;

        notasAlunos[3][0] = 7.5f;
        notasAlunos[3][1] = 3.7f;
        notasAlunos[3][2] = 9;
        notasAlunos[3][3] = 10;

        notasAlunos[4][0] = 6.5f;
        notasAlunos[4][1] = 6;
        notasAlunos[4][2] = 9.5f;
        notasAlunos[4][3] = 7;

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Valor de i: " + i);
            System.out.println("Tamanho da matriz: " + notasAlunos.length);
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.printf("notasAlunos[%d][%d] = %.2f\n", i, j, notasAlunos[i][j]);
            }
            System.out.println();
        }

    }
}
