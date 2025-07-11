package com.william.mycursojava.aula28_33.hands_on;

import java.util.Scanner;

public class Aprovacao {
    private Scanner scan = new Scanner(System.in);
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    public Aprovacao(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        disciplinas = new String[3];
        notas = new double[3];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void verificarAprovacao() {
        double media = 0;
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.printf("Digite o nome da %dº disciplina do aluno %s: ", (i+1), getNome());
            disciplinas[i] = scan.nextLine();
            System.out.printf("Digite a nota da disciplina %s: ", disciplinas[i]);
            notas[i] = scan.nextDouble();
            scan.nextLine();
            media += notas[i];
        }

        if (media >= 7) {
            System.out.printf("Aluno %s APROVADO!", getNome());
        } else {
            System.out.printf("Aluno %s REPROVADO", getNome());
        }

    }
}
