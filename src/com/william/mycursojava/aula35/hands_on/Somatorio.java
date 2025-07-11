package com.william.mycursojava.aula35.hands_on;

public class Somatorio {
    public static int calcularSomatorio(int num) {

        if (num == 0) {
            return 0;
        }

        return num + calcularSomatorio(num - 1);
    }
}
