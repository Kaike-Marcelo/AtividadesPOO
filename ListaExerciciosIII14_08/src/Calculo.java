//a.	A classe possui um atributo chamado totalSalario que nunca deve ter seu valor
//      alterado pelo usuário.

//b.	Implemente o método calculaSalario que recebe como parâmetro o salário base e
//      o horas trabalhadas, e possui tipo de retorno void. Obs.: para calcular o salário
//      é preciso multiplicar o salário base vezes as horas trabalhadas do funcionário.

//c.	Implemente um método chamado getTotalSalario() que retorna o salário total do funcionário.

public class Calculo {

    private double totalSalario;

    public double getTotalSalario(){
        return totalSalario;
    }

    public void calculaSalario(double salarioBase, int horasTrabalhadas){
         totalSalario = salarioBase * horasTrabalhadas;
    }
}
