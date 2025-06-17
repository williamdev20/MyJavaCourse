package com.william.mycursojava.aula18.hands_on;

import java.util.Date;

public class Exercicio04 {
    public static void main(String[] args) {
        LivroBiblioteca livro = new LivroBiblioteca();

        livro.nomeLivro = "O Hobbit";
        livro.editora = "HarperCollins";
        livro.autor = "J. R. R. Tolkien";
        livro.anoLacamento = 2019;
        livro.idioma = "Português";
        livro.peso = 400;
        livro.qtdPaginas = 336;
        livro.alugado = true;
        livro.dataAluguel = new Date();
        livro.nomeEmprestado = "William";

        System.out.printf("Nome: %s\n", livro.nomeLivro);
        System.out.printf("Editora: %s\n", livro.editora);
        System.out.printf("Autor: %s\n", livro.autor);
        System.out.printf("Ano do lançamento: %d\n", livro.anoLacamento);
        System.out.printf("Idioma: %s\n", livro.idioma);
        System.out.printf("Peso do livro: %.1f\n", livro.peso);
        System.out.printf("Quantidade de páginas:  %d\n", livro.qtdPaginas);
        System.out.printf("Emprestado: %b\n", livro);
        System.out.println("Data do empréstimo: " + livro.dataAluguel);
        System.out.printf("Emprestado a: %s", livro.nomeEmprestado);
    }
}
