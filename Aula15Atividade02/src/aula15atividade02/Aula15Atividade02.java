/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15atividade02;

import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula15Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto objProduto = new Produto();
        int quantidade;

        System.out.printf("Digite o nome do produto: ");
        objProduto.setNome(entrada.next());

        System.out.printf("Digite o preco do produto: ");
        objProduto.setPreco(entrada.nextDouble());

        System.out.printf("Digite a quantidade em estoque: ");
        objProduto.setQuantidade(entrada.nextInt());

        System.out.printf("Dados do produto: \n");
        objProduto.ImprimirEstoque();

        System.out.printf("Digite a quantidade a adicionar: ");
        quantidade = entrada.nextInt();
        objProduto.AdicionarProduto(quantidade);

        System.out.printf("novos dados do produto: \n");
        objProduto.ImprimirEstoque();

        System.out.printf("Digite a quantidade a remover: ");
        quantidade = entrada.nextInt();
        objProduto.RemoverProduto(quantidade);

        System.out.printf("novos dados do produto: \n");
        objProduto.ImprimirEstoque();
    }

}
