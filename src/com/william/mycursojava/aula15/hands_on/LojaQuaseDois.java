package com.william.mycursojava.aula15.hands_on;

public class LojaQuaseDois {
  public static void main(String[] args) {
        System.out.println("Bem vindo a Lojinha de R$1,99 so Sr. Manoel!");
        System.out.println("Segue a tabela de preço abaixo:\n");
        System.out.println("~=~=~=~=~TABELA DE PREÇOS~=~=~=~=~");
        double valor = 1.99;
        
        for (int i = 1; i <= 50; i++) {
          double preco = valor * i;
          System.out.format("|%d item - R$ %.2f| %n", i , preco);
        }
      
    }
}
