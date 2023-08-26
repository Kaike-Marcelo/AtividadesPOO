import java.util.Scanner;

public class maiorDe50NumerosEntre1e100 {

    private int numeroReferencia;

    public void salvarMaiorNumero(int numero){

        if(numero > numeroReferencia){
            numeroReferencia = numero;
        }

    }

    public static void main(String[] args){

        boolean loop = true;
        Scanner teclado = new Scanner(System.in);
        maiorDe50NumerosEntre1e100 descobrir = new maiorDe50NumerosEntre1e100();

        System.out.println("Digite 50 números (Entre 1 e 100), e no final te direi qual é o maior entre eles.\n");
        for( int i=0; i<51; i++ ){

            System.out.print(">>> ");
            int numero = teclado.nextInt();

            while(loop) {
                if (numero > 99) {
                    System.out.println("Os números devem ser menores que 100: \n>>>");
                    numero = teclado.nextInt();

                } else if (numero < 2){
                    System.out.println("Os números devem ser maiores que 1: \n>>>");
                    numero = teclado.nextInt();

                } else{
                    loop = false;

                }

            }

            descobrir.salvarMaiorNumero(numero);
            loop = true;


        }
        System.out.println("O maior número é: " + descobrir.numeroReferencia);

        teclado.close();
    }

}
