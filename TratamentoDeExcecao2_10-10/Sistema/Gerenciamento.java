package Sistema;

import java.util.ArrayList;

public class Gerenciamento {
    private static Professores[] professores = new Professores[20];
    private int totalProfessores = 0;

    private ArrayList<String> mensagensErro = new ArrayList<>();

    /*
     * Inserindo um professor na lista de professores
     */
    public void inserirProfessor(Professores professor) {
        try {
            if (!validaListaProfessores()) {
                throw new Exception("Erro ao inserir professor: Lista de professores cheia.");
            }

            int indice = localizarIndiceProfessor(professor.getCpf());
            if (indice != -1) {
                throw new Exception("Erro ao inserir professor: Professor já cadastrado.");
            }

            professores[totalProfessores] = professor;
            totalProfessores++;
            System.out.println("Professor inserido com sucesso!");
        } catch (Exception e) {
            mensagensErro.add(e.getMessage());
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /*
     * Removendo um professor da lista de professores
     */
    public void removerProfessor(String cpf) {
        try {
            int indice = localizarIndiceProfessor(cpf);
            if (indice == -1) {
                throw new Exception("Erro ao remover professor: Professor não encontrado!");
            }

            for (int i = indice; i < totalProfessores - 1; i++) {
                professores[i] = professores[i + 1];
            }
            totalProfessores--;
            System.out.println("Professor removido com sucesso!");
        } catch (Exception e) {
            mensagensErro.add(e.getMessage());
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /*
     * Pesquisando um professor na lista de professores
     */
    public void pesquisarProfessor(String cpf) {
        try {
            int indice = localizarIndiceProfessor(cpf);
            if (indice == -1) {
                throw new Exception("Erro ao pesquisar professor: Professor não encontrado!");
            }

            System.out.println("Professor encontrado: \n" +
                    "Nome: " + professores[indice].getNome() +
                    "Idade: " + professores[indice].getIdade() +
                    "CPF: " + professores[indice].getCpf() +
                    "RG: " + professores[indice].getRg() +
                    "Sexo: " + professores[indice].getSexo() +
                    "Dependentes: " + professores[indice].getDependentes());
        } catch (Exception e) {
            mensagensErro.add(e.getMessage());
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /*
     * Validando se a lista de professores está cheia
     */
    public boolean validaListaProfessores() {
        return totalProfessores < professores.length;
    }

    /*
     * Percorrendo a lista de professores
     */
    public int percorrerLista() {
        for (int indice = 0; indice < professores.length; indice++) {
            if (professores[indice] == null) {
                return indice;
            }
        }
        return -1;
    }

    /*
     * Localizando o índice de um professor na lista de professores
     */
    public Integer localizarIndiceProfessor(String cpf) {
        for (int indice = 0; indice < professores.length; indice++) {
            if (professores[indice] != null && professores[indice].getCpf().equals(cpf)) {
                return indice;
            }
        }
        return -1;
    }

    /*
     * Pegar todas as mensagens de erro armazenadas no ArrayList
     */
    public ArrayList<String> getMensagensDeErro() {
        return mensagensErro;
    }
}
