package Questao1;

public class ProgramaCarro {

    public static void main(String[] args) {

        Carro carro = new Carro(1, "Toyota", "Prata", "Corolla",
                    2023, 4, "Gasolina", 5,
                            15000000000000.0, true);
        carro.listarCarro();

        carro.alterarCarro("Toyota", "Branco", "Corolla XRS", 2023, 4, "Gasolina", 3, 160000.0, true);
        carro.listarCarro();
    }

}
