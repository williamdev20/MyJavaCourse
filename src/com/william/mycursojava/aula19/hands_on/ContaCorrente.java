package com.william.mycursojava.aula19.hands_on;

import java.util.Scanner;

public class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    int numero;
    double saldo;
    boolean statusEspecial;
    double limite;
    double deposito;
    double saque;

    double depositar() {
        System.out.print("Informe a quantia que desejas depositar: R$");
        deposito = scan.nextDouble();
        return deposito;
    }

    String sacar() {
        System.out.print("Informe a quantidade que desejas sacar: R$");
        saque = scan.nextDouble();

        if (saque > deposito) {
            while (saque > deposito) {
                System.out.print("Você está tentando sacar uma quantia maior do que a que está depositada. Tente novamente: R$");
                saque = scan.nextDouble();
            }
        }
        return "Saque de R$"+ saque + " realizado com sucesso!\n";
    }
}
