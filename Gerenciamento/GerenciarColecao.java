package Gerenciamento;

import java.util.ArrayList;
import java.util.List;

public class GerenciarColecao {
    private List<Livro> colecaoLivros;

    public GerenciarColecao() {
        colecaoLivros = new ArrayList<>();
    }

    /*
     * Adicionar um livro na coleção
     */
    public void adicionarLivro(Livro livro) {
        colecaoLivros.add(livro);
    }

    /*
     * Remover um livro da coleção
     */
    public void removerLivro(Livro livro) {
        if (!isListaVazia()) {
            colecaoLivros.remove(livro);

        } else {
            System.out.println("Erro! Não foi possível remover esse ítem: Lista vazia.");
        }
    }

    /*
     * Percorrer a lista e imprimir o conteúdo de cada livro
     */

    // Percorrendo lista
    public void percorrerLista() {
        if (!isListaVazia()) {
            for (Livro livro : colecaoLivros) {
                imprimirConteudo(livro);
            }
        } else {
            System.out.println("Erro! Não foi possível percorrer esta lista: Lista vazia.");
        }
    }

    // Imprimindo conteúdo
    public void imprimirConteudo(Livro livro) {
        System.out.println("-----------------------------------");
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("-----------------------------------");
    }

    /*
     * Verifica se determinado livro existe na lista
     */
    public boolean verificarLivroExistente(Livro livro) {
        return colecaoLivros.contains(livro);
    }

    /*
     * Obter um livro da lista
     */
    public Livro obterLivro(Livro livro) {
        int index = colecaoLivros.indexOf(livro);
        if (index != -1) {
            return colecaoLivros.get(index);
        }
        return null;
    }

    /*
     * Verificar se a Lista está vazia
     */
    public boolean isListaVazia() {
        return colecaoLivros.isEmpty();
    }
}