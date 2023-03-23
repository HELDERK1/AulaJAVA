package aula08atividade6;

import java.util.Scanner;

public class Aula08Atividade6 {

    public static void main(String[] args) {
        int valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("[1] para doar R$10\n[2] para doar R$25\n[3] para doar R$50\n[4] para doar outro valor\n[5] para cancelar");
        valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.printf("Obrigado por doar R$10,00\n");
                break;
            case 2:
                System.out.printf("Obrigado por doar R$25,00\n");
                break;
            case 3:
                System.out.printf("Obrigado por doar R$50,00\n");
                break;
            case 4:
                System.out.println("Digite o valor que deseja doar:");
                valor = entrada.nextInt();
                System.out.printf("Obrigado por doar R$%d,00\n", valor);
                break;
            default:
                System.out.printf("Operacao cancelada!\n");
        }
    }
}
