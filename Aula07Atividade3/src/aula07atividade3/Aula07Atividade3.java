package aula07atividade3;

import java.util.Scanner;

public class Aula07Atividade3 {

    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a idade do atleta:");
        idade = entrada.nextInt();
        
        switch (idade) {
            case 5, 6, 7, 8, 9, 10:
                System.out.printf("Atleta Infantil\n");
                break;
            case 11, 12, 13, 14, 15:
                System.out.printf("Atleta Juvenil\n");
                break;
            case 16, 17, 18, 19, 20:
                System.out.printf("Atleta Junior\n");
                break;
            case 21, 22, 23, 24, 25:
                System.out.printf("Atleta Profissional\n");
                break;
            default:               
                System.out.printf("Nao tem categoria pra esta idade\n");
        }
    }

}
