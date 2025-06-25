package com.william.mycursojava.aula19.hands_on;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        System.out.println("Informe o número da conta: ");
        conta.numero = scan.nextInt();
        System.out.println("Informe o saldo da conta: ");
        conta.saldo = scan.nextDouble();
        System.out.println("Informe se o status da conta é especial ou não: ");
        conta.statusEspecial = scan.nextBoolean();
        System.out.println("Informe o limite da conta: ");
        conta.limite = scan.nextDouble();

        System.out.println();

        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.print(">>> Escolha: ");
        int opcao = scan.nextInt();

        switch (opcao) {

            case 1:
                conta.depositar();
                break;

            case 2:
                conta.sacar();
                break;
        }

        scan.close();
    }
}
