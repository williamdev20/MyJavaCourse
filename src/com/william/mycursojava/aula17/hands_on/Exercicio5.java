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

        do {

            System.out.println("1. Agendar compromisso");
            System.out.println("2. Verificar compromissos");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            System.out.println("----------------");

            if (opcao == 1) {
                System.out.print("Digite o dia: ");
                dia = scan.nextInt();
                System.out.print("Digite a hora: ");
                hora = scan.nextInt();

                scan.nextLine();

                System.out.print("Digite o compromisso: ");
                compromissos[dia-1][hora-1] = scan.nextLine();
            } else if (opcao == 2) {
                System.out.println("-------------COMPROMISSOS---------------");
                label:
                {
                    for (int i = 0; i < compromissos.length; i++) {
                        for (int j = 0; j < compromissos[i].length; j++) {
                            if (compromissos[dia-1][hora-1] == null) {
                                System.out.println("Nenhum compromisso foi agendado ainda!");
                                System.out.println("----------------");
                                break label;
                            }
                            if (compromissos[i][j] != null && !compromissos[i][j].isEmpty()) {
                                System.out.printf("Dia %d às %dh - %s\n", (i+1), (j+1), compromissos[i][j]);
                                System.out.println("----------------");
                            }
                        }
                    }
                }
            }

        } while (opcao != 3);

        scan.close();
    }
}
