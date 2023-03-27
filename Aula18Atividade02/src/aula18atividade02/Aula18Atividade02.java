package aula18atividade02;

import java.util.Scanner;

public class Aula18Atividade02 {

    public static void main(String[] args) {
        double base, altura, ladoA, ladoB;
        String figura;
        Scanner entrada = new Scanner(System.in);
        ICalculosGeometricos objGeometrico;

        System.out.printf("Digite o nome da figura [QUADRADO ou TRIANGULO]: ");
        figura = entrada.next();

        switch (figura.toUpperCase()) {
            case "QUADRADO" -> {
                System.out.printf("Digite o lado do quadrado: ");
                base = entrada.nextDouble();
                objGeometrico = new Quadrado(base, figura);
                System.out.printf("A figura e = %s\n", objGeometrico.GetNomeFigura());
                System.out.printf("O perimetro e = %.2f\n", objGeometrico.GetPerimetro());
                System.out.printf("A area e = %.2f\n", objGeometrico.GetArea());
            }
            case "TRIANGULO" -> {
                System.out.printf("Digite o valor da base do triangulo: ");
                base = entrada.nextDouble();
                System.out.printf("Digite o valor da altura do triangulo: ");
                altura = entrada.nextDouble();
                System.out.printf("Digite o valor do lado1 do triangulo: ");
                ladoA = entrada.nextDouble();
                System.out.printf("Digite o valor do lado2 do triangulo: ");
                ladoB = entrada.nextDouble();
                objGeometrico = new Triangulo(base, altura, ladoA, ladoB, figura);
                System.out.printf("A figura e = %s\n", objGeometrico.GetNomeFigura());
                System.out.printf("O perimetro e = %.2f\n", objGeometrico.GetPerimetro());
                System.out.printf("A area e = %.2f\n", objGeometrico.GetArea());
            }
            default ->
                System.out.printf("Figura invalida!");
        }

    }

}
