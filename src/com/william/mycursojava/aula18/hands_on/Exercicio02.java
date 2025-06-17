package com.william.mycursojava.aula18.hands_on;

public class Exercicio02 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nomeLivro = "O Hobbit";
        livro.autor = "Luana Costa";
        livro.edicao = 1;
        livro.editora = "HarperCollins";
        livro.dataPublicacao = "15/06/2019";
        livro.idioma = "Português";
        livro.numPagina = 336;
        livro.peso = 400;

        System.out.printf("Nome do livro: %s\n", livro.nomeLivro);
    }
}
