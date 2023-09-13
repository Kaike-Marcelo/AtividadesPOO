import java.util.ArrayList;
import java.util.List;

class Semestre {
    private List<Avaliacao> avaliacoes;

    public Semestre() {
        avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public boolean pesoDasAvaliacoesEValido() {
        double somaPesos = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaPesos += avaliacao.getPeso();
        }
        return somaPesos == 7.0;
    }

    public double calcularMedia() {
        double media = 0.0;
        for (Avaliacao avaliacao : avaliacoes) {
            media += avaliacao.calcularPontos();
        }
        return media / 7;
    }

    public String calcularResultado() {
        if (pesoDasAvaliacoesEValido()) {
            double media = calcularMedia();
            return media >= 7.0 ? "Aprovado!" : "Reprovado!";
        } else {
            return "Erro com os pesos das avaliações. A soma total dos pesos deve ser igual a 7.";
        }
    }
}