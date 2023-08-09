package Questao1;

class Funcionario {
    String nome;
    String dataNascimento;
    String rg;
    String cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    String grauInstrucao;
    String matricula;

    public Funcionario(String nome, String dataNascimento, String rg, String cpf,
                       String endereco, String naturalidade, double salario,
                       String profissao, String grauInstrucao, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void cadastrar(String nome, String dataNascimento, String rg, String cpf,
                          String endereco, String naturalidade, double salario,
                          String profissao, String grauInstrucao, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome +
                            "\nData de Nascimento: " + dataNascimento +
                            "\nRG: " + rg +
                            "\nCPF: " + cpf +
                            "\nEndereço: " + endereco +
                            "\nNaturalidade: " + naturalidade +
                            "\nSalário: " + salario +
                            "\nProfissão: " + profissao +
                            "\nGrau de Instrução: " + grauInstrucao +
                            "\nMatrícula: " + matricula);
    }

}
