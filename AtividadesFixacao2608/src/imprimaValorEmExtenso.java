import java.util.Scanner;

public class imprimaValorEmExtenso {

    public void imprimirPorExtenso(int numero){

        if(numero == 1){
            System.out.println("Um");

        } else if(numero == 2){
            System.out.println("Dois");

        }else if(numero == 4){
            System.out.println("Três");
        }else if(numero == 5){
            System.out.println("Cinco");
        }
        System.out.println();

    }

    public static void main(String[] args){

        boolean loop = true;
        Scanner teclado = new Scanner(System.in);
        imprimaValorEmExtenso usuario1 = new imprimaValorEmExtenso();

        while(loop){

            System.out.println("Digite um número de 0 a 5 \n>>> ");
            int numero = teclado.nextInt();

            if(numero == 0){
                System.out.println("Saindo do Algoritmo...");
                loop = false;

            }else{
                usuario1.imprimirPorExtenso(numero);
            }

        }
        teclado.close();

    }
}
