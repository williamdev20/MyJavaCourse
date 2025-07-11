package com.william.mycursojava.aula36.hands_on.exercicio02;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();
        System.out.println("Digite o nome do curso: ");
        curso.setNomeCurso(scan.nextLine());

        System.out.println("Digite o horário: ");
        curso.setHorario(scan.nextLine());

        //curso.setProfessor(scan.nextLine());
        Professor professor = new Professor();
        System.out.println("Digite o nome do professor da turma: ");
        professor.setNome(scan.nextLine());
        System.out.println("Digite o departamento do professor: ");
        professor.setDepartamento(scan.nextLine());
        System.out.println("Digite o email do professor: ");
        professor.setEmail(scan.nextLine());

        curso.setProfessor(professor);

        System.out.println("Nome do curso: " + curso.getNomeCurso());
        System.out.println("Horário: " + curso.getHorario());
        if (curso.getProfessor() != null) {
            System.out.println("Nome do professor: " + curso.getProfessor().getNome());
            System.out.println("Departamento do professor: " + curso.getProfessor().getDepartamento());
            System.out.println("Email do professor: " + curso.getProfessor().getEmail());
        }

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("----------MENU----------");
            System.out.println("[ 1 ] Registrar alunos");
            System.out.println("[ 2 ] Listar alunos");
            System.out.println("[ 3 ] Sair");
            System.out.print(">>> Escolha: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    curso.registrarAlunos();
                    break;
                case 2:
                    curso.listarAlunos();
                    break;
            }
        }
    }
}
