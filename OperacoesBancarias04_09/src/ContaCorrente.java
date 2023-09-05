public class ContaCorrente {

    private double salarioAtual;

    public ContaCorrente(){
        this.salarioAtual = 0;
    }

    public void executarOperacao(Operacao opr){
        salarioAtual += opr.operar();
    }

    public double getSalarioAtual(){
        return salarioAtual;
    }

}
