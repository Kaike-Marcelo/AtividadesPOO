import Excecao.Excecao;
import Programa.*;
import java.lang.Exception;

public class App {

    public static void main(String[] args) throws Exception {

        try {

            Cadastro cadastro = new Cadastro();

            Alunos aluno1 = new Alunos("João", "Rua 1", 1);
            cadastro.inserirAluno(aluno1);

            Alunos aluno2 = new Alunos("Marta", "Rua 2", 2);
            cadastro.inserirAluno(aluno2);

            Alunos aluno3 = new Alunos("Pedro", "Rua 3", 3);
            cadastro.inserirAluno(aluno3);

            Alunos aluno4 = new Alunos("Maria", "Rua 4", 3);
            cadastro.inserirAluno(aluno4);

            cadastro.imprimirAlunosInseridos();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
