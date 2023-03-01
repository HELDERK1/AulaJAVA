package aula06atividade7;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        int valor1, valor2, resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        valor1 = entrada.nextInt();
        
        System.out.println("Informe o segundo valor:");
        valor2 = entrada.nextInt();
        
        resultado = valor1 > valor2 ? valor1 + valor2 : valor1 - valor2;
        
        System.out.printf("Resultado = %s\n", resultado);
    }

}