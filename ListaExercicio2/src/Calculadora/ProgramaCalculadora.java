package Calculadora;

import java.util.Scanner;

public class ProgramaCalculadora {

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        boolean loop = true;

        System.out.println("---------- Calculadora On ----------");

        while(loop){

            System.out.println("\nPrimeiro valor: ");
            float num1 = teclado.nextFloat();

            System.out.println("Segundo valor: ");
            float num2 = teclado.nextFloat();

            System.out.println("Escolha uma operação:" +
                                "\n[+]Soma" +
                                "\n[-]Subtração" +
                                "\n[*]Multiplicação" +
                                "\n[/]Divisão" +
                                "\n                             [x]Sair" +
                                "\n>>> ");

            Calculo c = new Calculo(num1, num2);
            char operacao = teclado.next().charAt(0);

            if(operacao == 'x'){
                System.out.println("---------- Calculadora Off ----------");
                loop = false;

            }else{
                if(operacao == '+'){
                    c.soma();

                }else{
                    if(operacao == '-'){
                        c.subtracao();

                    }else{
                        if(operacao == '*'){
                            c.multiplicacao();

                        }else{
                            if(operacao == '/'){
                                c.divisao();

                            }else{
                                System.out.println("Essa operação não existe nesse sistema.");

                            }
                        }
                    }
                }

                System.out.println("Resultado: " + c.resultado);
            }

        }

        teclado.close();

    }

}
