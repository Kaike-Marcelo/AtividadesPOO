package Eleicao;

public class votacaoCandidato {

    private int candidato1;
    private int candidato2;
    private int candidato3;
    private int candidato4;
    private int votoBranco;
    private int votoNulo;
    private int totalDeVotos;


    public void votar(int candidato){

        if(candidato == 1){
           candidato1+=1;
            System.out.println("Voto em Candidato 1\n");

        } else if(candidato == 2){
            candidato2+=1;
            System.out.println("Voto em Candidato 2\n");

        } else if(candidato == 3){
            candidato3+=1;
            System.out.println("Voto em Candidato 3\n");

        } else if(candidato == 4){
            candidato4+=1;
            System.out.println("Voto em Candidato 4\n");

        } else if(candidato == 5) {
            votoBranco+=1;
            System.out.println("Voto em Branco\n");

        } else{
            votoNulo+=1;
            System.out.println("Voto Nulo\n");
        }

    }

    public void imprimirVotos(){

        System.out.println("=======================================" +
                            "Lista de votos de cada candidato: \n" +
                            "\nCandidato 1: " + candidato1 +
                            "\nCandidato 2: " + candidato2 +
                            "\nCandidato 3: " + candidato3 +
                            "\nCandidato 4: " + candidato4 +
                            "\nVotos em Branco: " + votoBranco +
                            "\nVotos Nulos: " + votoNulo + "\n" +
                            "=======================================");
    }

    public void imprimirTotalVotos(){

        totalDeVotos = candidato1 + candidato2 + candidato3 + candidato4 + votoBranco + votoNulo;
        System.out.println("Quantidade Total de Votos: " + totalDeVotos + "\n");

    }

}
