/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula15atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Produto {    
    public String nome;
    protected double preco;
    protected int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double CalcularValorEmEstoque() {
        return this.preco * this.quantidade;
    }

    public void AdicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void RemoverProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void ImprimirEstoque() {
        System.out.printf("Produto: %s, Quantidade: %d, Valor Unitario: %.2f, Valor total: %.2f.\n", this.nome, this.quantidade, this.preco, CalcularValorEmEstoque());
    }
}
