public class ProgramaBiblioteca {

    public static void main(String[] args){

        Livro livro1 = new Livro("A morte do Bezerra", "Gui Guimarães", 2021, "Suspense",
                "Pearson", 10, "2°", "299");

        Filme filme1 = new Filme("Não Vingadores", "Pamela Marquês de Tamandaré", 2019, "Ação",
                "Pearson", 4, "Carlos Alburquerque", "Tony Stark",
                "O calabolso se abre quando a porta se fecha.", "1h 30m");

        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro1;
        publicacoes[1] = filme1;

        for(Publicacao publicacao : publicacoes){
            System.out.println("<------------------------------------------->");
            publicacao.imprimirDados();
            System.out.println("<------------------------------------------->");

        }

    }
}
