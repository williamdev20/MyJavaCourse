package com.william.mycursojava.aula36.hands_on.exercicio01;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da agenda: ");
        Agenda agenda = new Agenda(scan.nextLine());

        int opcao;

        do {
            System.out.println("[ 1 ] Cadastrar contatos");
            System.out.println("[ 2 ] Listar contatos");
            System.out.println("[ 3 ] Sair da agenda");
            System.out.print(">>> Escolha: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    agenda.cadastrarContatos();
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
            }
        } while (opcao != 3);

        System.out.println("Programa encerrado com sucesso!");

        scan.close();
    }
}
