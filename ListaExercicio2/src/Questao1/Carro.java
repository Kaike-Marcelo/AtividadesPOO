package Questao1;

public class Carro {
    int codigo;
    String marca;
    String cor;
    String modelo;
    int anoFabricacao;
    int numeroPortas;
    String tipoCombustivel;
    int quant_Disponivel;
    double preco;
    boolean completo;

    // Construtor
    public Carro(int codigo, String marca, String cor, String modelo, int anoFabricacao,
                 int numeroPortas, String tipoCombustivel, int quant_Disponivel,
                 double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quant_Disponivel = quant_Disponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void cadastrarCarro(int codigo, String marca, String cor, String modelo, int anoFabricacao,
                               int numeroPortas, String tipoCombustivel, int quant_Disponivel,
                               double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quant_Disponivel = quant_Disponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void alterarCarro(String marca, String cor, String modelo, int anoFabricacao,
                             int numeroPortas, String tipoCombustivel, int quant_Disponivel,
                             double preco, boolean completo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quant_Disponivel = quant_Disponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void listarCarro() {
        System.out.println("Código: " + codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Quantidade Disponível: " + quant_Disponivel);
        System.out.println("Preço: " + preco);
        System.out.println("Completo: " + (completo ? "Sim" : "Não"));
    }
}
