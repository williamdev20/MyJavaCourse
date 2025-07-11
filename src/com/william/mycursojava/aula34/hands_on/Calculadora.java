package com.william.mycursojava.aula34.hands_on;

public class Calculadora {

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2) {
        return  n1 * n2;
    }

    public static double dividir(int n1, int n2) {
        return (double) n1 / n2;
    }

    public static int elevarPotencia(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }

    // Exercício 03 agora
    public static int calcularFatorial(int num) {
        int fatorial = 1;
        for (int i = 0; num > i; num--) {
            System.out.println("Valor de i: " + num);
            fatorial *= num;
            System.out.println("Valor de fatorial: "+ fatorial);
        }

        return fatorial;
    }
}
