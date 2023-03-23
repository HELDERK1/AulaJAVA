/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10desafio;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula10Desafio {

    public static void main(String[] args) {
        int voto, a = 0, b = 0, c = 0, d = 0, e = 0;
        String cand1, cand2, cand3, cand4, cand5;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o nome do primeiro candidato: \n");
        cand1 = entrada.next();
        System.out.printf("Digite o nome do segundo candidato: \n");
        cand2 = entrada.next();
        System.out.printf("Digite o nome do terceiro candidato: \n");
        cand3 = entrada.next();
        System.out.printf("Digite o nome do quarto candidato: \n");
        cand4 = entrada.next();
        System.out.printf("Digite o nome do quinto candidato: \n");
        cand5 = entrada.next();
        
        do {
            do {
                System.out.printf("Escolha um produto para votacao:\n");
                System.out.printf("1 - Para votar %s\n2 - Para votar %s\n3 - Para votar %s\n4 - Para votar %s\n5 - Para votar %s\n6 - Fim\n", cand1, cand2, cand3, cand4, cand5);
                voto = entrada.nextInt();
                if (!(voto != 1 && voto != 2 && voto != 3 && voto != 4 && voto != 5 && voto != 6)) {
                  System.out.printf("Voto Invalido\n");  
                }
            } while (voto != 1 && voto != 2 && voto != 3 && voto != 4 && voto != 5 && voto != 6);

            switch (voto) {
                case 1 ->
                    a++;
                case 2 ->
                    b++;
                case 3 ->
                    c++;
                case 4 ->
                    d++;
                case 5 ->
                    e++;
            }

        } while (voto != 6);

        System.out.printf("Obrigado pela votacao\n");
        System.out.printf("O candidato %s recebeu %d votos\n", cand1, a);
        System.out.printf("O candidato %s recebeu %d votos\n", cand2, b);
        System.out.printf("O candidato %s recebeu %d votos\n", cand3, c);
        System.out.printf("O candidato %s recebeu %d votos\n", cand4, d);
        System.out.printf("O candidato %s recebeu %d votos\n", cand5, e);
    }

}
