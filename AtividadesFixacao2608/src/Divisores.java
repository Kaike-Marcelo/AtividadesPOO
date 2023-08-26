import java.util.Scanner;

public class Divisores {

    public void calculo(int numero){

        System.out.println("Divisores de " + numero + " são: ");
        for(int i=99999; i>0; --i){

            if((numero%i) == 0){System.out.println(i + " é Divisor de " + numero);}

        }
        System.out.println();

    }

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Divisores c1 = new Divisores();
        boolean loop = true;

        while(loop){

            System.out.println("Digite um número: ");
            int numero = teclado.nextInt();

            c1.calculo(numero);


        }

    teclado.close();
    }

}
