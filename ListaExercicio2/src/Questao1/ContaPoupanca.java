package Questao1;

public class ContaPoupanca {
    String nomeCorrentista;
    String rg;
    String cpf;
    double saldo;
    String numero;
    String agencia;

    public ContaPoupanca(String nomeCorrentista, String rg, String cpf, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public void cadastrarAlterarConta(String nomeCorrentista, String rg, String cpf, String numero, String agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.numero = numero;
        this.agencia = agencia;
    }

    public void imprimirSaldo() {
        System.out.println("Nome do Correntista: " + nomeCorrentista +
                            "\nSaldo: R$" + saldo);
    }

    public void depositarDinheiro(double valor) {
        saldo += valor;
        System.out.println("Sucesso! Valor Depositado." +
                            "\nSaldo Atual: R$" + saldo);
    }

    public void sacarDinheiro(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. " +
                                "\nSaldo Atual: R$" + saldo);
        } else {
            System.out.println("Erro! Saldo insuficiente para realizar o saque.");
        }

    }
}
