package Calculadora;

public class Calculo {

    float num1;
    float num2;
    float resultado;

    public Calculo( float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void soma() {
        resultado = num1 + num2;
    }

    public void subtracao() {
        resultado =  num1 - num2;
    }

    public void multiplicacao() {
        while(num2 != 0){
            resultado = resultado+num1;
            num2-=1;

        }
    }

    public void divisao() {
        resultado = num1/num2;
    }

}
