import java.text.DecimalFormat;

public class App {

    public static void main(String [] args) {

        Avaliacao prova1 = new Avaliacao(2.0);
        prova1.setNotas(7.5);
        prova1.setNotas(8.0);

        Avaliacao prova2 = new Avaliacao(2.0);
        prova2.setNotas(6.0);
        prova2.setNotas(7.0);

        Avaliacao trabalho = new Avaliacao(1.0);
        trabalho.setNotas(9.0);
        trabalho.setNotas(8.5);
        trabalho.setNotas(7.0);

        Avaliacao interdisciplinar = new Avaliacao(2.0);
        interdisciplinar.setNotas(9.5);
        interdisciplinar.setNotas(8.0);
        interdisciplinar.setNotas(7.0);
        interdisciplinar.setNotas(6.5);

        Semestre semestre = new Semestre();
        semestre.adicionarAvaliacao(prova1);
        semestre.adicionarAvaliacao(prova2);
        semestre.adicionarAvaliacao(trabalho);
        semestre.adicionarAvaliacao(interdisciplinar);

        String resultado = semestre.calcularResultado();
        DecimalFormat formatarValor = new DecimalFormat("#.##");
        String mediaFormatada = formatarValor.format(semestre.calcularMedia());

        System.out.println("Resultado do semestre: " + resultado +
                            "\nMédia: " + mediaFormatada);
    }

}
