import java.util.Comparator;

public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;
    private double limiteCredito;
    private double saldo;

    public Conta(int numero, String titular, double limiteCredito, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Conta {" +
                "Numero: " + numero + " | " +
                "Titular: " + titular + " | " +
                "Limite do Crédito: " + limiteCredito + " | " +
                "Saldo: " + saldo + " | " +
                "}\n";
    }

    public int compareTo(Conta conta) {
        return Integer.compare(numero, conta.numero);
    }
}
