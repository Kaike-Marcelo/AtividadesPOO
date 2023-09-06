package Lojas;

public class Loja {
    
    private String nome;
    private String ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public Loja(String nome, int idade, int anoFundacao, String ramo, String vendedor){
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;

        this.vendedor = new Vendedor(vendedor, idade);
    }

    public void admitirVendedor(String nome, int idade){
        this.vendedor = new Vendedor(nome, idade);
        System.out.println("Vendedor " + vendedor + " foi admitido.");
    }

    public void demitirVendedor(){
        System.out.println("Vendedor " + vendedor + " foi demitido.");
    }
    
}