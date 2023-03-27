/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Pessoas implements IPessoas {

    private String inscricao, nome, sobrenome;
    private Endereco endereco = new Endereco();

    @Override
    public void Apresentar() {
        System.out.printf("Inscricao: %s\nNome: %s %s\n", this.inscricao, this.nome, this.sobrenome);
        this.endereco.ImprimirEndereco();
    }

    @Override
    public void Cadastrar(String inscricao, String nome, String sobrenome, Endereco endereco) {
        this.inscricao = inscricao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }


}
