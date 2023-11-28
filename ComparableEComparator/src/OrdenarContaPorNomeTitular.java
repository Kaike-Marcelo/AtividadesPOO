import java.util.Comparator;

public class OrdenarContaPorNomeTitular implements Comparator<Conta> {

    public int compare(Conta conta, Conta proxConta) {
        return conta.getTitular().compareTo(proxConta.getTitular());
    }
}
