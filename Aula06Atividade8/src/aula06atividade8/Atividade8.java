package aula06atividade8;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        String resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de A da equacao do segundo grau:");
        a = entrada.nextDouble();

        System.out.println("Informe o valor de B da equacao do segundo grau:");
        b = entrada.nextInt();

        System.out.println("Informe o valor de C da equacao do segundo grau:");
        c = entrada.nextInt();

        //System.out.printf("Equacao = %.2fx² + (%.2fx) + (%.2f)\n", a, b, c);
        delta = Math.pow(b, 2) - (4 * a * c);

        resultado = delta < 0 ? "Nenhuma raiz real" : delta == 0 ? "Uma unica raiz real" : "Duas raizes reais";

        switch (resultado) {
            case "Nenhuma raiz real":
                System.out.printf("Resultado = %s\n", resultado);
                break;
            case "Uma unica raiz real":
                x1 = -(b) / (2 * a);
                System.out.printf("Resultado = %s, %.2f\n", resultado, x1);
                break;
            case "Duas raizes reais":
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Resultado = %s, %.2f e  %.2f\n", resultado, x1, x2);
                break;
        }

    }

}
