package aula04exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        double a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor para medida A:");
        a = entrada.nextDouble();
        System.out.println("Informe o valor para medida B:");
        b = entrada.nextInt();
        System.out.println("Informe o valor para medida C:");
        c = entrada.nextDouble();
        
        System.out.printf("A area do triangulo retangulo de base A e altura C = %.3f%n", (a*b)/2);
        System.out.printf("A area do circulo de raio C = %.3f%n", Math.PI*Math.pow(c, 2));
        System.out.printf("A area do trapezio de bases A e B e altura C = %.3f%n", (a+b)*c/2);
        System.out.printf("A area do quarado de aresta B = %.3f%n", Math.pow(b, 2));
        System.out.printf("A area do retangulo de bases A e altura B = %.3f%n", a*b);
    }

}
