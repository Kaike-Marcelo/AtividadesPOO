import Sistema.Gerenciamento;
import Sistema.Professores;

public class App {
    public static void main(String[] args) {

        Professores professor, professor1, professor2;
        Gerenciamento gerenciamento = new Gerenciamento();

        // Inserir professores inexistentes na lista
        professor1 = new Professores("João", 35, "M", "12345678900", "1234", "Rua A");
        professor2 = new Professores("Maria", 28, "F", "98765432100", "5678", "Rua B");

        gerenciamento.inserirProfessor(professor1);
        gerenciamento.inserirProfessor(professor2);

        // Inserir professor já existente
        gerenciamento.inserirProfessor(professor1);

        // Testando o limite da lista de professores
        for (int i = 3; i <= 21; i++) {
            professor = new Professores("Professor" + i, 30, "M", "CPF" + i, "RG" + i, "Endereco" + i);
            gerenciamento.inserirProfessor(professor);
        }

        // Teste de pesquisa de professor
        gerenciamento.pesquisarProfessor("12345678900");

        // Remover professor inexistente
        gerenciamento.removerProfessor("99999999999");
        // Pesquisar professor inexistente
        gerenciamento.pesquisarProfessor("99999999999");

        // Remover professor existente
        gerenciamento.removerProfessor("12345678900");
        // Pesquisar professor removido
        gerenciamento.pesquisarProfessor("12345678900");

        System.out.println(gerenciamento.getMensagensDeErro());
    }
}
