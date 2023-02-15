
package aula03atividade2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor para calculo:");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor para calculo:");
        num2 = entrada.nextDouble();
        System.out.println();
        System.out.printf("A soma destes numeros sao: %.2f%n",num1 + num2);
        System.out.printf("A subtracao destes numeros sao: %.2f%n",num1 - num2);
        System.out.printf("A multiplicacao destes numeros sao: %.2f%n",num1 * num2);
        System.out.printf("A divisao destes numeros sao: %.2f%n",num1 / num2);
    }
    
}
