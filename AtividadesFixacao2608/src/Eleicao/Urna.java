package Eleicao;

import java.util.Scanner;

public class Urna {

    public static void main(String[] args){

        votacaoCandidato votacao1 = new votacaoCandidato();

        Scanner teclado = new Scanner(System.in);
        boolean loop = true;
        int candidato;

        while(loop){

            System.out.println(
                            "\n================= ELEIÇÃO ON =================" +
                            "\n[1] Canditato 1" +
                            "\n[2] Candidato 2" +
                            "\n[3] Candidato 3" +
                            "\n[4] Candidato 4" +
                            "\n[5] Branco" +
                            "\n                           [0]Finalizar Votação" +
                            "\n>>> ");

            candidato = teclado.nextInt();

            if(candidato == 0){
                System.out.println("Finalizando Sistema de Votação...");
                votacao1.imprimirVotos();
                votacao1.imprimirTotalVotos();
                System.out.println("\n================= ELEIÇÃO OFF =================\n");
                loop=false;

            }else{votacao1.votar(candidato);}

        }

        teclado.close();
    }

}
