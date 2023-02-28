package aula05exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        double valorPagar;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da compra:");
        valorPagar = entrada.nextDouble();
        valorPagar = valorPagar < 30 ? valorPagar * 9 / 10 : valorPagar * 8 / 10;
        
        System.out.printf("Valor a pagar = R$ %.2f%n",valorPagar);
    }

}
