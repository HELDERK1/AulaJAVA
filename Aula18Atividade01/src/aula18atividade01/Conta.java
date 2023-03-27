/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Conta implements IConta {

    private String numeroDaConta, proprietario;
    private double balanco;

    @Override
    public void Depositar(double deposito) {
        if (numeroDaConta.equals("")) {
            System.out.println("Conta nao encontrada!\n");
        } else {
            this.balanco += deposito;
        }
    }

    @Override
    public void Sacar(double saque) {
        if (numeroDaConta.equals("")) {
            System.out.println("Conta nao encontrada!\n");
        } else {
            this.balanco -= saque - 5.00;
        }
    }

    @Override
    public void Cadastrar(String numeroDaConta, String proprietario) {
        this.numeroDaConta = numeroDaConta;
        this.proprietario = proprietario;
    }

    @Override
    public void ImprimirDados() {
        System.out.printf("Numero da Conta: %s\nNome do titular: %s\nSaldo em conta: R$%.2f\n", this.numeroDaConta, this.proprietario, this.balanco);
    }
}
