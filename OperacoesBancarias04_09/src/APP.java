public class APP {

    public static void main(String[] args){

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();

        Banco banco = new Banco("Antônio Ferreira", c1, "Miranda Alencar", c2,
                                "Valdemir Pinheiro", c3);

        banco.creditar("Antônio Ferreira", 2500.00);
        banco.debitar("Miranda Alencar", 2500.00);
        banco.transferir("Antônio Ferreira", "Valdemir Pinheiro", 2499.00);

        System.out.println("\nCorrentistas | Saldo" +
                            "\nAntônio: " + banco.getSaldo("Antônio Ferreira") +
                            "\nMiranda: " + banco.getSaldo("Miranda Alencar") +
                            "\nValdemir: " + banco.getSaldo("Valdemir Pinheiro"));
    }


}
