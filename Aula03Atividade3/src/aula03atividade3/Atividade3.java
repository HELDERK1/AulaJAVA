package aula03atividade3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor referente a base do triangulo retangulo:");
        num1 = entrada.nextDouble();
        System.out.println("Digite o valor referente a altura do triangulo retangulo:");
        num2 = entrada.nextDouble();
        System.out.println();
        System.out.printf("O triangulo retangulo de base %.2f e altura %.2f, tem a area = %.2f%n",num1, num2, (num1 * num2)/2);
    }
    
}
