package com.william.mycursojava.aula18.hands_on;

public class Exercicio01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.garantia = 36;

        lampada.tipos = new String[5];

        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Lunimárias";
        lampada.tipos[3] = "Pendentes";
    }
}
