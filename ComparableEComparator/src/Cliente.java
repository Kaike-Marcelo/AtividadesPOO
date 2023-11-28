import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private Conta conta1;
    private Conta conta2;
    private Conta conta3;

    public List<Conta> listaContas;

    public Cliente() {
        conta1 = new Conta(3, "Fernando", 1000.00, 200.00);
        conta2 = new Conta(1, "Laura", 500.00, 10.00);
        conta3 = new Conta(2, "Ana Paula", 750.00, 50.50);

        listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        Collections.sort(listaContas);

        System.out.println("Lista Ordenada por Número");
        System.out.println(listaContas);

        System.out.println("Lista Ordenada por Titular");
        listaContas.sort(new OrdenarContaPorNomeTitular());
        System.out.println(listaContas);
    }
}
