package com.william.mycursojava.aula18.hands_on;

public class ContaCorrente {
    int numero;
    double saldo;
    boolean statusEspecial;
    double limite;

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = 12;
        conta.saldo = 8000;
        conta.statusEspecial = true;
        conta.limite = 1000;

        System.out.println("Número da conta: "+ conta.numero);
        System.out.println("Saldo da conta: "+ conta.saldo);
        System.out.println("Status da conta: "+ conta.statusEspecial);
        System.out.println("Limite da conta: "+ conta.limite);
    }
}
