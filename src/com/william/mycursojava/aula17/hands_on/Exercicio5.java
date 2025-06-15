package com.william.mycursojava.aula17.hands_on;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------MENU DE COMPROMISSOS-----------------");

        int dia = 31;
        int hora = 8;
        String[][] compromissos = new String[dia][hora];
        int opcao;

        // Menu
        System.out.println("1. Agendar compromisso");
        System.out.println("2. Verificar compromissos");
        System.out.println("3. Sair");
        System.out.print("Escolha: ");
        opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o dia: ");
            dia = scan.nextInt();
            dia--;
            System.out.print("Digite a hora: ");
            hora = scan.nextInt();
            hora--;

            scan.nextLine();

            System.out.print("Digite o compromisso: ");
            compromissos[dia][hora] = scan.nextLine();
        } else if (opcao == 2) {
            for (int i = 0; i < compromissos.length; i++) {
                for (int j = 0; j < compromissos[i].length; j++) {
                    if (compromissos[i][j] == null && compromissos[i][j].isEmpty()) {
                        System.out.println("Nenhum compromisso foi agendado ainda!");
                    } else {
                        System.out.println("-------------COMPROMISSOS---------------");
                        System.out.printf("%d as %dh -> %s", dia, hora, compromissos[dia][hora]);
                    }
                }
            }
        }


        scan.close();
    }
}
