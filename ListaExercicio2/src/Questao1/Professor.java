package Questao1;

public class Professor {
    String nome;
    String titulacao;
    String formacao;
    int cargaHoraria;
    double salario;
    String descricao_disciplina;

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricao_disciplina) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricao_disciplina = descricao_disciplina;
    }

    public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricao_disciplina) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricao_disciplina = descricao_disciplina;
    }

    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    public void alterarDescricaoDisciplina(String nova_descricao_disciplina) {
        this.descricao_disciplina = nova_descricao_disciplina;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome +
                            "\nTitulação: " + titulacao +
                            "\nFormação: " + formacao +
                            "\nCarga Horária: " + cargaHoraria +
                            "\nSalário: " + salario +
                            "\nDescrição de Disciplina Ensinada: " + descricao_disciplina);
    }
}