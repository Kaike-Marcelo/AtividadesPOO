package Brinquedos;

public abstract class Brinquedo {

    protected double velocidade, aceleracao;

    public abstract void mover();

    public void velocidade(int velocidade){
        this.velocidade = velocidade;
        System.out.println("Velocidade definida para " + this.velocidade);
    }

    public void velocidade(double velocidade){
        this.velocidade = velocidade;
        System.out.println("Velocidade definida para " + this.velocidade);
    }

    public void velocidade(double velocidade, double aceleracao){
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        System.out.println("Velocidade definida para " + this.velocidade);
        System.out.println("Aceleração definida para " + this.aceleracao);
    }
    
}
