package com.william.mycursojava.aula18.hands_on;

public class Exercicio06 {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.nome = "William";
        contato.email = "william@gmail.com";
        contato.endereco = "12345678";
        contato.numeros = new String[2];
        contato.numeros[0] = "12345";
        contato.numeros[1] = "6789";

        System.out.println("Nome: "+ contato.nome);
        System.out.println("Email: "+ contato.email);
        System.out.println("Endereço: "+ contato.endereco);
        System.out.println("Telefone 1: "+ contato.numeros[0]);
        System.out.println("Telefone 2: "+ contato.numeros[1]);
    }
}
