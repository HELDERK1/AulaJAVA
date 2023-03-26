package aula14atividade06;

import java.util.Scanner;

public class Aula14Atividade06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Funcionario objFuncionario = new Funcionario();

        System.out.printf("Digite nome do funcionario: ");
        objFuncionario.nome = entrada.next();
        System.out.printf("Digite o salario bruto: ");
        objFuncionario.salarioBruto = entrada.nextDouble();
        System.out.printf("Digite o valor do imposto: ");
        objFuncionario.imposto = entrada.nextDouble();
        System.out.printf("Digite o valor do aumento: ");
        objFuncionario.aumento = entrada.nextDouble();

        objFuncionario.CalcularSalarioLiquido();
        objFuncionario.CalcularAumentoSalario();
        objFuncionario.CalcularSalarioLiquido();

    }

}
