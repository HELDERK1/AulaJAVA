package aula04exercicio7;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        int codProduto, quantidadeItens;
        double valorUnitario, valorPagar;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o codigo do produto:");
        codProduto = entrada.nextInt();               
        System.out.println("Informe a quantidade de itens:");
        quantidadeItens = entrada.nextInt();               
        System.out.println("Informe o valor unitario:");
        valorUnitario = entrada.nextDouble();          
        valorPagar = valorUnitario*quantidadeItens;
        
        System.out.println("Informe o codigo do produto:");
        codProduto = entrada.nextInt();               
        System.out.println("Informe a quantidade de itens:");
        quantidadeItens = entrada.nextInt();               
        System.out.println("Informe o valor unitario:");
        valorUnitario = entrada.nextDouble();          
        valorPagar = valorPagar + valorUnitario*quantidadeItens;
        
        System.out.printf("Valor a pagar = R$ %.2f%n", valorPagar);
    }    
}
