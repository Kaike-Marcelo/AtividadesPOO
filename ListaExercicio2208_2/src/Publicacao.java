abstract class Publicacao {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String editora;
    private int qntDisponivel;

    public Publicacao(String titulo, String autor, int anoPublicacao, String genero, String editora, int qntDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.editora = editora;
        this.qntDisponivel = qntDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getQntDisponivel() {
        return qntDisponivel;
    }

    /*
    @Override
    public String toString(){
        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nGênero: " + genero +
                "\nEditora: " + editora + "\nQuantidade Disponível: " + qntDisponivel;
    }
    */

    public abstract void imprimirDados();

}
