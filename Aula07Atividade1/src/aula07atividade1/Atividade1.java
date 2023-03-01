package aula07atividade1;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        int valorSobrando;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor que tens sobrando:");
        valorSobrando = entrada.nextInt();
        if (valorSobrando >= 30) {
            System.out.printf("Poderia ir ao cinema...\n");
        }
        else{
            System.out.printf("Melhor ficar em casa\n");
        }        
    }
}
