package Questao1;

public class ProgramaContaPoupanca {

    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca("Paulo", "1234567890", "09876543210", "01", "0075");
        conta.depositarDinheiro(1500);
        conta.imprimirSaldo();
        conta.sacarDinheiro(500);
        conta.imprimirSaldo();
    }

}
