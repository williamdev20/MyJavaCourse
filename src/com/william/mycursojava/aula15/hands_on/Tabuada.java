package com.william.mycursojava.aula15.hands_on;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner perg = new Scanner(System.in);
        System.out.println("Seja bem-vindo a minha Nova Tabuada!");
        System.out.print("Qual número você deseja saber a tabuada? ");
        int num = perg.nextInt();
        System.out.print("Qual será a operação (adição - a -, subtração - b - , multiplicação - m -, divisão - d - ou TODOS - t)?");
        String operador = perg.next();

        if (operador.equalsIgnoreCase("adição") || operador.equalsIgnoreCase("a")) {
            for (int i = 0; i <= 10; i++) {
                int soma = num + i;
                System.out.println(num + " + " + i + " = " + soma);
            }
        } else if (operador.equalsIgnoreCase("subtração") || operador.equalsIgnoreCase("s")) {
            for (int i = num; i <= (num + 10); i++) {
                int sub = i - num;
                System.out.println(i + " - " + num + " = " + sub);
            }
        } else if (operador.equalsIgnoreCase("multiplicação") || operador.equalsIgnoreCase("m")) {
            for (int i = 0; i <= 10; i++) {
                int mult = num * i;
                System.out.println(num + " X " + i + " = " + mult);
            }
        } else if (operador.equalsIgnoreCase("divisão") || operador.equalsIgnoreCase("d")) {
            int inicialNum = num;
            for (int i = num; i <= (num * 10); i+=inicialNum) {
                int divi = i / num;
                System.out.println(i + " ÷ " + num + " = " + divi);
            }
        } else if (operador.equalsIgnoreCase("todos") || operador.equalsIgnoreCase("t")) {
            System.out.println("-=-=-=-=-ADIÇÃO-=-=-=-=-");
            for (int i = 0; i <= 10; i++) {
                int soma = num + i;
                System.out.println(num + " + " + i + " = " + soma);
            }
            System.out.println("-=-=-=-=-SUBTRAÇÃO-=-=-=-=-");
            for (int i = num; i <= (num + 10); i++) {
                int sub = i - num;
                System.out.println(i + " - " + num + " = " + sub);
            }
            System.out.println("-=-=-=-=-MULTIPLICAÇÃO-=-=-=-=-");
            for (int i = 0; i <= 10; i++) {
                int mult = num * i;
                System.out.println(num + " X " + i + " = " + mult);
            }
            System.out.println("-=-=-=-=-DIVISÃO-=-=-=-=-");
            int inicialNum = num;
            for (int i = num; i <= (num * 10); i+=inicialNum) {
                int divi = i / num;
                System.out.println(i + " ÷ " + num + " = " + divi);
            }
        }
        perg.close();
    }
}
