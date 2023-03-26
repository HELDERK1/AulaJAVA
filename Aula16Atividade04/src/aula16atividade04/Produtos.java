/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16atividade04;

/**
 *
 * @author Helder Kennedy
 */
public class Produtos {

    protected int item, quantidade;
    private double preco;
    private String produto;

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public double getPreco() {
        return preco;
    }

    public String getProduto() {
        return produto;
    }

    public void EscolherProduto() {
        switch (this.item) {
            case 1 -> {
                this.produto = "Cachorro-Quente";
                this.preco = 7.00;
            }
            case 2 -> {
                this.produto = "X-Salada";
                this.preco = 9.00;
            }
            case 3 -> {
                this.produto = "X-Bacon";
                this.preco = 11.00;
            }
            case 4 -> {
                this.produto = "Torrada";
                this.preco = 5.00;
            }
            case 5 -> {
                this.produto = "Refrigerante";
                this.preco = 4.00;
            }
        }
    }

    public void ImprimirPedido() {
        System.out.printf("Quantidade = %d\nProduto = %s\nPreco Unit = R$%.2f\nPreco Total = R$%.2f\n", this.quantidade, this.produto, this.preco, this.preco * this.quantidade);
    }
}
