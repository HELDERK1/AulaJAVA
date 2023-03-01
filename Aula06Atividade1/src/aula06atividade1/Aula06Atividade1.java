package aula06atividade1;

import java.util.Scanner;

public class Aula06Atividade1 {

    public static void main(String[] args) {
        int cont = 5, valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor:");
        valor = entrada.nextInt();
        valor *= cont;
        System.out.printf("O novo valor = %d\n",valor);
    }

}
