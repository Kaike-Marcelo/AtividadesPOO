package Brinquedos;

public class App {

    public static void main(String[] args){

        Brinquedo caminhao = new Caminhao();
        Brinquedo helicoptero = new Helicoptero();
        Brinquedo navio = new Navio();

        ControleRemoto cCaminhao = new ControleRemoto(caminhao);
        ControleRemoto cHelicoptero = new ControleRemoto(helicoptero);
        ControleRemoto cNavio = new ControleRemoto(navio);

        cCaminhao.mover();
        cHelicoptero.mover();
        cNavio.mover();

    }
    
}
