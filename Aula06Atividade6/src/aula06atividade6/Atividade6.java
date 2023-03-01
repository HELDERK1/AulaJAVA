package aula06atividade6;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        int valor;
        String resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextInt();
        
        resultado = valor > 10 ? "Numero e maior que 10\n" : valor > 5 ? "Numero e maior que 5\n" : "Numero e menor que 5\n";
        
        System.out.printf("Resultado = %s\n", resultado);
    }

}
 