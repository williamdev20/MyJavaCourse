package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class UserAndPassword {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.println("-=-=-=-CADASTRO-=-=-=-");
        System.out.println("Digite seu nome de usário: ");
        String userName = perg.next();
        System.out.println("Digite sua senha: ");
        String password = perg.next();

        boolean passwordValido = false;

        do {
            if (password.equals(userName)) {
                System.out.println("Senha inválida! Por favor, tente novamente: ");
                password = perg.next();
            } else {
                passwordValido = true;
                System.out.println("Cadastro realizado com sucesso!");
            }
        } while (!passwordValido);

        perg.close();
    }
}
