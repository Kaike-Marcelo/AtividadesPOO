public class Gerenciamento {
    private static Professores [] professores = new Professores[20];
    
    public void inserirProfessor(Professores professor) {
        if (professores.length < 20) {

            if (!validaProfessor(professor.getCpf())) {
                professores.;
            }
        }
        
    }

    public boolean validaListaProfessores() {
        return professores.length < 20 ? true : false;
    }

    public boolean validaProfessor(String cpf) {

        for (Professores professor : professores) {
            if (professor.getCpf() == cpf) {
                return true;
            }
        }
    }
    
}
