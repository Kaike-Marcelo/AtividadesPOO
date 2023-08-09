package Questao1;

public class ProgramaFuncionario {

    public static void main(String args[]) {
        Funcionario funcionario = new Funcionario("Carlos Almeida", "03/03/1976", "1234567890", "09876543210",
                "Rua Consola, 111", "Cidade Eunápolis", 5500.0, "Analista", "Superior", "A123");

        System.out.println("Dados do Funcionário: ");
        funcionario.imprimirDados();

        funcionario.cadastrar("Maria", "03/03/1976", "654321", "98765432101",
                "Rua B, 456", "Cidade B", 6000.0, "Engenheira", "Pós-Graduação", "M67890");

        System.out.println("\nDados Alterados do Funcionário: ");
        funcionario.imprimirDados();

    }
}
