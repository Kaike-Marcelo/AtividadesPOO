package Programa;

import java.util.ArrayList;
import Excecao.Excecao;

public class Cadastro {

    static ArrayList<Alunos> alunos = new ArrayList<>();

    public void inserirAluno(Alunos aluno) throws Excecao {

        try {
            Integer validaMatricula = validarAluno(aluno.getMatricula());

            if (validaMatricula != null) {
                throw new Excecao("Erro ao adicionar aluno: matrícula inválida");
            }

            alunos.add(aluno);
            System.out.println("Aluno inserido com sucesso!");

        } catch (Excecao e) {
            throw new Excecao("Algo deu errado! " + e.getMessage());
        }
    }

    public Integer validarAluno(int matricula) throws Excecao {

        for (Alunos aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                return 1; // 1 indica que a matrícula já está cadastrada.
            }
        }
        return null; // null indica que a matrícula não está cadastrada
    }

    public void imprimirAlunosInseridos() throws Excecao {
        try {
            if (alunos.isEmpty()) {
                throw new Excecao("Erro ao imprimir alunos inseridos: não há alunos cadastrados.");
            }
            for (Alunos aluno : alunos) {
                System.out.println("=====================================");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Endereço: " + aluno.getEndereco());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("=====================================");
            }
        } catch (Excecao e) {
            throw new Excecao("Erro ao imprimir alunos inseridos." + e.getMessage());
        }

    }
}
