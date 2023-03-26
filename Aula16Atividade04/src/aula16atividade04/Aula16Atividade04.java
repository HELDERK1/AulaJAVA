/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula16atividade04;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula16Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produtos objProdutos = new Produtos();
        Scanner entrada = new Scanner(System.in);
        int item, quantidade;
        System.out.printf("Digite um numero correspondente ao produto que deseja: \n");
        do {
            System.out.printf("[1] Cachorro-Quente\n[2] X-Salada\n[3] X-Bacon\n[4] Torrada\n[5] Refrigerante\n");
            item = entrada.nextInt();
        } while (item != 1 && item != 2 && item != 3 && item != 4 && item != 5);

        objProdutos.setItem(item);

        objProdutos.EscolherProduto();

        do {
            System.out.printf("Digite a quantidade de %s deseja: \n", objProdutos.getProduto());
            quantidade = entrada.nextInt();
        } while (quantidade < 1);

        objProdutos.setQuantidade(quantidade);
        objProdutos.ImprimirPedido();
    }

}
