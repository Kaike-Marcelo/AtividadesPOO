//a.	Sabendo que o objeto funcionário possui os atributos nome, cpf, rg,
//      matricula, salário, data contratação, salário base, horas trabalhadas.

//b.	Implemente um construtor de classe, este construtor recebe como parâmetro o nome,
//      salário base e horas trabalhadas do funcionário.

//c.	Adicione uma atributo estático chamado geraMatricula. Inicialize este atributo com zero.

//d.	Adicione o método calculaSalario() que é responsável por chamar o objeto do tipo Calculo
//      para efetuar o cálculo do salário do funcionário. Para isso crie uma instância da classe
//      Calculo e chame o método calculaSalario passando os parâmetro solicitados.

//e.	No construtor da classe adicione os atributos dataContracao e matricula. O atributo matricula
//      deve ter seu dado gerado a partir do atributo estático geraMatricula incrementado de 1.

//f.	O atributo salario do funcionário não deve ser modificado, para isso aplique o conceito de
//      encapsulamento utilizando os modificadores de acesso da linguagem Java.

public class Funcionario {

    private String nome;
    private String cpf;
    private String rg;
    private int matricula;
    private double salario;
    private String dataContratacao;
    private double salarioBase;
    private int horasTrabalhadas;
    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas, String dataContratacao){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        geraMatricula++;
        this.matricula = geraMatricula;
        this.dataContratacao = dataContratacao;
        calculaSalario();
    }

    public void calculaSalario(){
        Calculo calculo = new Calculo();
        calculo.calculaSalario(salarioBase, horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    public void imprimeDados(){
        System.out.println("----- Dados Gerais do Funcionário -----" +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nMatrícula: " + matricula +
                "\nSalário: " + salario +
                "\nData da Contratação: " + dataContratacao +
                "\nHoras Trabalhadas: " + horasTrabalhadas);
    }
}
