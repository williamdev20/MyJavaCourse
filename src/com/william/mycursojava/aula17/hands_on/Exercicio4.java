package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class Exercicio4 {

    static void AgendarCompromisso(String[][] compromissos) {
        Scanner scan = new Scanner(System.in);
        int dia;
        int hora;

        System.out.print("Informe o dia que deseja marcar o compromisso (1-31): ");
        dia = scan.nextInt();
        System.out.println("Informe a hora que deseja marcar o compromisso (1-24): ");
        hora = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o compromisso que desejas agendar: ");
        compromissos[dia - 1][hora - 1] = scan.nextLine();

    }

    static void ConsultarCompromisso(String[][] compromissos) {
        for (int d = 0; d < compromissos.length; d++) {
            for (int h = 0; h < compromissos[d].length; h++) {
                if (compromissos[d][h] != null && !compromissos[d][h].isEmpty()) {
                    System.out.printf("Dia %d as %dh -> %s\n", (d + 1), (h + 1), compromissos[d][h]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dia = 31;
        int hora = 24;

        String[][] compromissos = new String[dia][hora];

        int opcao;
        do {
            System.out.println("-=-=-=-=-AGENDA PESSOAL - MENU-=-=-=-=-");
            System.out.println("1. Agendar compromisso");
            System.out.println("2. Consultar agenda");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    AgendarCompromisso(compromissos);
                    break;

                case 2:
                    ConsultarCompromisso(compromissos);
                    break;
                default:
                    System.out.println("Compromissos agendados com sucesso!");
            }

        } while (opcao != 3);

        scan.close();
    }
}