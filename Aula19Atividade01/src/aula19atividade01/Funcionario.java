/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula19atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Funcionario {
    private String nome, cpf;
    private double salario;
    
    public void Apresentar(){
        System.out.printf("Nome: %s\nCPF: %s\nSalario: R$%.2f\n", this.nome, this.cpf, this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
