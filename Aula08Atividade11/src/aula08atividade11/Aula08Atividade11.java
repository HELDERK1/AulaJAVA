package aula08atividade11;

import java.util.Scanner;

public class Aula08Atividade11 {

    public static void main(String[] args) {
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor e para verificar a qual posicao ele pertence:");
        System.out.println("[0,25],[25,50],[50;75],[75,100]");
        valor = entrada.nextInt();

        if (valor >= 0 && valor <= 25) {
            System.out.println("O valor esta no intervalo [0,25]\n");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("O valor esta no intervalo [25,50]\n");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("O valor esta no intervalo [50,75]\n");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("O valor esta no intervalo [75,100]\n");
        }else{
            System.out.println("O valor esta fora do intervalo!\n");
        }
    }

}
