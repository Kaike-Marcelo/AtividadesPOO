package Lojas;

public class Vendedor {

    private int idade;
    private String nome;

    public Vendedor(String nome, int idade){

        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void vender(){
        System.out.println(nome + " está vendendo.");
    }
    
}