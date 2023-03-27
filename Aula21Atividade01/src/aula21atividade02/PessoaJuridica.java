/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "CNPJ = " + cnpj + '}';
    }

    @Override
    public String getNome() {
        return "Nome: " + super.getNome() + ", CNPJ: " + this.cnpj;
    }
}
