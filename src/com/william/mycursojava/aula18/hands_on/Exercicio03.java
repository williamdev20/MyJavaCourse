package com.william.mycursojava.aula18.hands_on;

public class Exercicio03 {
    public static void main(String[] args) {
        LivroLivraria ACulpaEDasEstrelas = new LivroLivraria();

        ACulpaEDasEstrelas.nomeLivro = "A Culpa é das Estrelas";
        ACulpaEDasEstrelas.editora = "Intrínseca";
        ACulpaEDasEstrelas.autor = "John Green";
        ACulpaEDasEstrelas.anoLacamento = 2014;
        ACulpaEDasEstrelas.idioma = "Português";
        ACulpaEDasEstrelas.peso = 363;
        ACulpaEDasEstrelas.qtdPaginas = 288;

        LivroLivraria OHobbit = new LivroLivraria();

        OHobbit.nomeLivro = "O Hobbit";
        OHobbit.editora = "HarperCollins";
        OHobbit.autor = "J. R. R. Tolkien";
        OHobbit.anoLacamento = 2019;
        OHobbit.idioma = "Português";
        OHobbit.peso = 400;
        OHobbit.qtdPaginas = 336;

        System.out.println("-=-=-=-=-=-=-");
        System.out.println("LIVRARIA");
        System.out.println("-=-=-=-=-=-=-");

        System.out.printf("Nome: %s\n", ACulpaEDasEstrelas.nomeLivro);
        System.out.printf("Editora: %s\n", ACulpaEDasEstrelas.editora);
        System.out.printf("Autor: %s\n", ACulpaEDasEstrelas.autor);
        System.out.printf("Ano do lançamento: %d\n", ACulpaEDasEstrelas.anoLacamento);
        System.out.printf("Idioma: %s\n", ACulpaEDasEstrelas.idioma);
        System.out.printf("Peso do livro: %.1f\n", ACulpaEDasEstrelas.peso);
        System.out.printf("Quantidade de páginas:  %d\n", ACulpaEDasEstrelas.qtdPaginas);
        System.out.println();
        System.out.printf("Nome: %s\n", OHobbit.nomeLivro);
        System.out.printf("Editora: %s\n", OHobbit.editora);
        System.out.printf("Autor: %s\n", OHobbit.autor);
        System.out.printf("Ano do lançamento: %d\n", OHobbit.anoLacamento);
        System.out.printf("Idioma: %s\n", OHobbit.idioma);
        System.out.printf("Peso do livro: %.1f\n", OHobbit.peso);
        System.out.printf("Quantidade de páginas:  %d\n", OHobbit.qtdPaginas);

    }
}
