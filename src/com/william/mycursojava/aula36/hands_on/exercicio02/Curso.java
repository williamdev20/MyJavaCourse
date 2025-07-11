package com.william.mycursojava.aula36.hands_on.exercicio02;

import java.util.Scanner;

public class Curso {
    private final Scanner scan = new Scanner(System.in);
    private String nomeCurso;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;
    private double mediaTotalTurma;

    public Curso() {
        alunos = new Aluno[5];
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double getMediaTotalTurma() {
        return mediaTotalTurma;
    }

    public void setMediaTotalTurma(double mediaTotalTurma) {
        this.mediaTotalTurma = mediaTotalTurma;
    }

    public void registrarAlunos() {
        for (int i = 0; i < getAlunos().length; i++) {
            Aluno aluno = new Aluno();

            System.out.printf("Digite o nome do aluno %d: ", (i + 1));
            aluno.setNome(scan.nextLine());
            System.out.printf("Digite a matrícula do aluno %d: ", (i + 1));
            aluno.setMatricula(scan.nextLine());

            for (int j = 0; j < aluno.getNotas().length; j++) {
                System.out.printf("Digite a %dº nota do aluno %d: ", (j + 1), (i + 1));
                aluno.setNotas(j, scan.nextDouble());
                aluno.setMedia(aluno.getMedia() + aluno.getNotasPos(j));
            }

            aluno.setMedia(aluno.getMedia() / aluno.getNotas().length);
            aluno.setMediaTurma(0 + aluno.getMedia());

            scan.nextLine();
            alunos[i] = aluno;

            setMediaTotalTurma(aluno.getMediaTurma() / getAlunos().length);

            System.out.println("----------------------------");
        }
        setAlunos(alunos);


    }

    public void listarAlunos() {
        for (Aluno a : getAlunos()) {
            if (a != null) {
                System.out.println("Nome: " + a.getNome());
                System.out.println("Matrícula: " + a.getMatricula());
                for (double n : a.getNotas()) {
                    System.out.println("Notas: " + n);
                }
                System.out.printf("Média: %.1f\n", a.getMedia());
                if (a.getMedia() >= 7) {
                    System.out.println("APROVADO!");
                } else {
                    System.out.println("REPROVADO!");
                }
                System.out.println("------------------");
            } else {
                System.out.println("Nenhum aluno registrado ainda!");
                break;
            }
        }
        System.out.printf("Média total da turma: %.1f\n", getMediaTotalTurma());
    }
}
