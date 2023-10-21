package Gerenciamento;

public class Livro {
    private String isbn;
    private String autor;
    private String editora;
    private String titulo;

    public Livro(String isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    /*
     * Métodos Getters e Setters
     */

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /*
     * Subscreve o método equals para comparar livros com base no ISBN
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Livro livro = (Livro) obj;
        return isbn.equals(livro.isbn);
    }

    /*
     * Subscreve o método hashCode para que dois livros com o mesmo ISBN tenham o
     * mesmo hash
     */
    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}