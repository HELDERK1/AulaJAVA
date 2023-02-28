package aula04exercicio6;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {        
        int numFuncionario, quantidadeHoras;
        double valorHora;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o numero do funcionario:");
        numFuncionario = entrada.nextInt();
               
        System.out.println("Informe a quantidade de horas trabalhadas:");
        quantidadeHoras = entrada.nextInt();
               
        System.out.println("Informe o valor por hora:");
        valorHora = entrada.nextDouble();
                
        System.out.printf("Numero = %d, Salario = R$ %.2f%n",numFuncionario, valorHora*quantidadeHoras);
    }
    
}
