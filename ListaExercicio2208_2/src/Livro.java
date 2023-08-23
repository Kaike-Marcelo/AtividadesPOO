public class Livro extends Publicacao{

    private String edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int qntDisponivel,
                String edicao, String isbn){

        super(titulo, autor, anoPublicacao, genero, editora, qntDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;

    }
    /*
    @Override
    public String toString(){
        return super.toString() + "\nEdição: " + edicao + "\nISBN: " + isbn + "\n";
    }
    */

    @Override
    public void imprimirDados(){
        System.out.println(
                "\nLivro:" +
                "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nAno de Publicação: " + getAnoPublicacao() +
                "\nGênero: " + getGenero() +
                "\nEditora: " + getEditora() +
                "\nQuantidade Disponível: " + getQntDisponivel() +
                "\nEdição: " + edicao +
                "\nISBN: " + isbn);
    }

}
