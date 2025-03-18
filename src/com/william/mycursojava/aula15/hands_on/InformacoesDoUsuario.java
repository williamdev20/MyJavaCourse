package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class InformacoesDoUsuario {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.print("Digite um nome para seu usuário (3 ou mais caracteres): ");
        String name = perg.next();

        while (name.length() < 3) {
            System.out.print("Por favor, tente novamente (3 ou mais caracteres): ");
            name = perg.next();
        }

        System.out.print("Digite a idade do usuário (entre 0 e 150): ");
        int age = perg.nextInt();

        while (age < 0 || age > 150) {
            System.out.print("Idade inválida! Por favor, tente novamente (de 0 a 150 anos): ");
            age = perg.nextInt();
        }
        System.out.print("Agora defina um salário para seu usuário (só não pode ser menor que 0): ");
        double salario = perg.nextDouble();

        while (salario <= 0) {
            System.out.print("Salário injusto, tente novamente e seja mais generoso: ");
            salario = perg.nextDouble();
            if (salario >= 5000) {
                System.out.println("Agora siim!!! :D");
            }
        }

        System.out.print("Informe o sexo do seu usuário (f-feminino e m-masculino): ");
        String sexo = perg.next();

        while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
            System.out.print("Genêro inválido. Tente novamente: ");
            sexo = perg.next();
        }

        System.out.print("Informe o estado civil (c-casado, s-solteiro, v-viúvo, d-divorciado): ");
        String estadoCivil = perg.next();

        while (!estadoCivil.equalsIgnoreCase("c") &&!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
            System.out.print("Pro favor, tente novamente (c-casado, s-solteiro, v-viúvo, d-divorciado): ");
            estadoCivil = perg.next();
        }


        perg.close();
    }
}
