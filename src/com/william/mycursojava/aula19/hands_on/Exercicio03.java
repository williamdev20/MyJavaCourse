package com.william.mycursojava.aula19.hands_on;

import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Aluno aluno = new Aluno();
    System.out.print("Digite o nome do aluno: ");
    aluno.nome = scan.nextLine();
    System.out.print("Digite o número da mátricula do aluno: ");
    aluno.matricula = scan.nextLine();
    System.out.print("Digite o nome do curso do aluno: ");
    aluno.nomeCurso = scan.nextLine();

    aluno.disciplinas = new String[3];
    aluno.notas = new double[3];

    for (int i = 0; i < aluno.disciplinas.length; i++) {
      System.out.printf("Digite o nome da %dº matéria do aluno: ", (i+1));
      aluno.disciplinas[i] = scan.nextLine();
    }

    for (int i = 0; i < aluno.notas.length; i++) {
      System.out.printf("Informe a nota do aluno na matéria %s: ", aluno.disciplinas[i]);
      aluno.notas[i] = scan.nextDouble();
    }

    System.out.println();
    System.out.println("-=-=-=-=-=FICHA DO ALUNO-=-=-=-=-");
    System.out.println("Nome do aluno: " + aluno.nome);
    System.out.println("Matrícula: " + aluno.matricula);
    System.out.println("Curso: " + aluno.nomeCurso);
    
    for (int i = 0; i < aluno.disciplinas.length; i++) {
      System.out.printf("Matéria %d: %s\n", (i+1), aluno.disciplinas[i]);
    }

    for (int i = 0; i < aluno.notas.length; i++) {
      System.out.printf("Nota da matéria %s: %.1f\n", aluno.disciplinas[i], aluno.notas[i]);
    }



    scan.close();
    
  }
}
