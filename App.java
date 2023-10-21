import Gerenciamento.GerenciarColecao;
import Gerenciamento.Livro;

public class App {

    public static void main(String[] args) {

        GerenciarColecao biblioteca = new GerenciarColecao();

        // Criando alguns livros
        Livro livro1 = new Livro("123456", "Paulo", "Editora 1", "Livro A");
        Livro livro2 = new Livro("098765", "João", "Editora 2", "Livro B");
        Livro livro3 = new Livro("111111", "Gabriela", "Editora 3", "Livro C");

        // Adicionando livros na lista
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Imprimindo conteúdo da lista
        biblioteca.percorrerLista();

        // Verificando se livro 1 e livro 3 existem na lista
        System.out.println("Livro 1 existe na lista: " + biblioteca.verificarLivroExistente(livro1));
        System.out.println("Livro 3 existe na lista: " + biblioteca.verificarLivroExistente(livro3));

        // Obtendo o livro 2 e imprime as informações
        System.out.println("Obter um livro:");
        Livro obterLivro = biblioteca.obterLivro(livro2);

        if (obterLivro != null) {
            biblioteca.imprimirConteudo(obterLivro);

        } else {
            System.out.println("Livro não encontrado.");
        }

        System.out.println("Lista está vazia?: " + biblioteca.isListaVazia());

        // Removendo livro 1 da lista
        biblioteca.removerLivro(livro1);

        System.out.println("Depois de remover livro 1:");
        biblioteca.percorrerLista();

        // Removendo livro 2 da lista
        biblioteca.removerLivro(livro2);

        System.out.println("Depois de remover livro 2:");
        biblioteca.percorrerLista();

        // Tentando remover um livro da lista vazia
        biblioteca.removerLivro(livro3);
    }
}
