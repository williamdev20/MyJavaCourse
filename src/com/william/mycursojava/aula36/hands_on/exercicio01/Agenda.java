package com.william.mycursojava.aula36.hands_on.exercicio01;

import java.util.Scanner;

public class Agenda {
    private Scanner scan = new Scanner(System.in);
    private Contato[] contatos;
    private String nomeAgenda;

    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
        contatos = new Contato[3];
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void cadastrarContatos() {
        for (int i = 0; i < getContatos().length; i++) {
            Contato c = new Contato();
            System.out.println("Entre com o nome do "+ (i+1) + " contato: ");
            c.setNome(scan.nextLine());
            System.out.println("Entre com o telefone do "+ (i+1) + " contato: ");
            c.setTelefone(scan.nextLine());
            System.out.println("Entre com o email do "+ (i+1) + " contato: ");
            c.setEmail(scan.nextLine());

            contatos[i] = c;
        }

        setContatos(contatos);
    }

    public void listarContatos() {
        System.out.println("CONTATOS DA AGENDA " + getNomeAgenda());

            for (Contato c : getContatos()) {
                if (c != null) {
                    System.out.println("Nome:" + c.getNome());
                    System.out.println("Telefone:" + c.getTelefone());
                    System.out.println("Email:" + c.getEmail());
                    System.out.println("-----------------------------");
                } else {
                    System.out.println("Nenhum contato registrado ainda!");
                    System.out.println("-----------------------------");
                    break;
                }
            }

    }
}
