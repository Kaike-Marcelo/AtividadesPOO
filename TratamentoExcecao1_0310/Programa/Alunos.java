package Programa;

public class Alunos {
    private String nome;
    private String endereco;
    private int matricula;

    public Alunos(String nome, String endereco, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getMatricula() {
        return matricula;
    }
}