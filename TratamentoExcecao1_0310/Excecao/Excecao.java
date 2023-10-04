package Excecao;

import java.lang.reflect.Executable;

public class Excecao extends Exception {

    public Excecao() {
        super("Erro de exceção.");
    }

    public Excecao(String mensagem) {
        super(mensagem);
    }

    public Excecao(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
