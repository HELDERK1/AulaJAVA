/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica() {
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
        public String getNome() {
        return "Nome: " + super.getNome() + ", CPF: " + this.cpf;
    }
}
