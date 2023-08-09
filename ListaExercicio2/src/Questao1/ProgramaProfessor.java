package Questao1;

public class ProgramaProfessor {

    public static void main(String args[]) {
        Professor professor = new Professor("João Silva", "Doutor", "Engenharia",
                                            40, 5000.0, "Facinho.");
        professor.imprimirDados();

        professor.cadastrar("Maria Souza", "Mestre", "Matemática",
                                30, 4000.0, "Moleza.");
        System.out.println("\nDados do Professor: ");
        professor.imprimirDados();

        professor.alterarDescricaoDisciplina("Difíceis.");
        System.out.println("\nDados do Professor: ");
        professor.imprimirDados();
    }
}