package com.william.mycursojava.aula36.hands_on.exercicio02;

public class Aluno {
    private String nome;
    private String matricula;
    private final double[] notas;
    private double media;
    private double mediaTurma;

    public Aluno() {
        notas = new double[4];
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

    public double[] getNotas() {
        return notas;
    }

    public double getNotasPos(int pos) {
        return notas[pos];
    }

    public void setNotas(int pos, double notas) {
        this.notas[pos] = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMediaTurma() {
        return mediaTurma;
    }

    public void setMediaTurma(double mediaTurma) {
        this.mediaTurma = mediaTurma;
    }

}
