import java.util.ArrayList;
import java.util.List;

class Avaliacao {
    private List<Double> notas;
    private double peso;
    //private double qntPontos;

    public Avaliacao(double peso) {
        this.peso = peso;
        this.notas = new ArrayList<>();
    }

    public void setNotas(double nota) {
        notas.add(nota);
    }

    public double somaNotas() {
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        return somaNotas / notas.size();
    }

    public double calcularPontos() {
        //qntPontos = somaNotas() * peso;
        return somaNotas() * peso;
    }

    public double getPeso() {
        return peso;
    }
}