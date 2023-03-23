/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08desafio;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula08Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int categoria, aumento = 0, desconto;
        String situacao, mensagem;
        double preco, novoPreco;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do servico:");
        preco = entrada.nextDouble();

        do {
            System.out.println("Digite o valor correspondente a categoria:");
            System.out.println("1 - Limpeza\n2 - Alimentacao\n3 - Vestuario");
            categoria = entrada.nextInt();
        } while (categoria != 1 && categoria != 2 && categoria != 3);

        do {
            System.out.println("Digite o valor correspondente a situacao:");
            System.out.println("R - Produtos que precisam de refrigeracao\nN - Produtos que nao precisam de refrigeracao");
            situacao = entrada.next();
        } while (!"R".equals(situacao.toUpperCase()) && !"N".equals(situacao.toUpperCase()));

        if (preco <= 25) {
            switch (categoria) {
                case 1 ->
                    aumento = 5;
                case 2 ->
                    aumento = 8;
                case 3 ->
                    aumento = 10;
            }
        } else {
            switch (categoria) {
                case 1 ->
                    aumento = 12;
                case 2 ->
                    aumento = 15;
                case 3 ->
                    aumento = 18;
            }
        }

        desconto = "R".equals(situacao.toUpperCase()) && categoria == 2 ? 5 : 8;

        novoPreco = preco + preco * aumento / 100;
        novoPreco = novoPreco - novoPreco * desconto / 100;

        if (novoPreco <= 50) {
            mensagem = "Barato";
        } else if (novoPreco <= 120) {
            mensagem = "Normal";
        } else {
            mensagem = "Caro";
        }

        System.out.printf("O novo valor resultou em: %s\n", mensagem);
    }

}
