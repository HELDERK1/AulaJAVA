package aula07atividade4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        double x, y;
        
        String resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de X no quadrante");
        x = entrada.nextDouble();
        
        System.out.println("Informe o valor de Y no quadrante");
        y = entrada.nextDouble();
        
        if (x == 0 & y == 0) {
            resultado = "Origem";
        } else if (x == 0) {
            resultado = "Eixo X";
        } else if (y == 0.0) {
            resultado = "Eixo Y";
        } else if (x > 0 & y > 0) {
            resultado = "Quadrante 1";
        } else if (x < 0 & y > 0) {
            resultado = "Quadrante 2";
        } else if (x < 0 & y < 0) {
            resultado = "Quadrante 3";
        } else {
            resultado = "Quadrante 4";
        }
        System.out.printf("O ponto digitado se encontra: %s\n", resultado);
    }

}
