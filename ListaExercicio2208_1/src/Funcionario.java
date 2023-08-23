public class Funcionario {
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String dataAdmissao;
    private double salario;
    private int matricula;
    private String cargo;
    private static int geraMatricula = 0;
    protected String endereco;

    public double getSalario() {
        return this.salario;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;

        this.geraMatricula++;
        this.matricula = geraMatricula;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nRG: " + rg + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento +
                "\nData de Admissão: " + dataAdmissao + "\nSalário: " + salario + "\nMatrícula: " + matricula +
                "\nCargo: " + cargo + "\nEndereço: " + endereco;
    }

    public void imprimeDados() {

        System.out.println(toString());
    }
}
