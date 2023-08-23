public class Filme extends Publicacao{

    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private String tempoDuracao;

    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int qntDisponivel,
                 String diretor, String atorPrincipal, String sinopse, String tempoDuracao){

        super(titulo, autor, anoPublicacao, genero, editora, qntDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }
    /*
    @Override
    public String toString(){
        return super.toString() + "\nDiretor: " + diretor + "\nAtor Principal: " + atorPrincipal + "\nSinopse: " + sinopse +
                                "\nTempo de Duração: " + tempoDuracao + "\n";

    }
     */

    @Override
    public void imprimirDados(){
        System.out.println(
                "\nFilme:" +
                "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nAno de Publicação: " + getAnoPublicacao() +
                "\nGênero: " + getGenero() +
                "\nEditora: " + getEditora() +
                "\nQuantidade Disponível: " + getQntDisponivel() +
                "\nDiretor: " + diretor +
                "\nAtor Principal: " + atorPrincipal +
                "\nSinopse: " + sinopse +
                "\nDuração: " + tempoDuracao);
    }

}
