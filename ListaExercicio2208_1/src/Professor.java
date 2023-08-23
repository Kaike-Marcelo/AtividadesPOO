public class Professor extends Funcionario {

    private String formacao;
    private String[] disciplina;

    public Professor(String nome, String rg, String cpf, String dataNascimento,
                     String dataAdmissao, double salario, String formacao) {

        super(nome, rg, cpf, dataNascimento, dataAdmissao, salario);
        this.formacao = formacao;

    }

    public void setDisciplina(String[] disciplina) {

        this.disciplina = disciplina;
    }

    public String[] getDisciplina() {

        return disciplina;
    }

    @Override
    public String toString() {
        String disciplinas = (disciplina != null) ? String.join(", ", disciplina) : "Não há disciplina(as)";
        return super.toString() + "\nFormação: " + formacao + "\nDisciplina(as): " + disciplinas + "\n";

    }

    public void imprimeDados() {
        System.out.println(this);

    }

}