package aula08atividade7;

import java.util.Scanner;

public class Aula08Atividade7 {

    public static void main(String[] args) {
        double num1, num2, resultado;
        int operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        num1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor");
        num2 = entrada.nextDouble();
        System.out.println("[1] para somar\n[2] para subtrair\n[3] para multiplicar\n[4] para dividir\n[5] para cancelar");
        operacao = entrada.nextInt();
        
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                resultado = 0;
        }
        System.out.printf("Resultado = %.2f\n", resultado);
    }
}
