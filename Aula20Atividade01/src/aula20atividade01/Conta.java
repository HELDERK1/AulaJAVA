/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Conta {

    private int numeroConta;
    private String proprietario;
    private double balanco;

    public void Depositar(double deposito) {
        this.balanco += deposito;
        System.out.printf("Deposito efetuado com sucesso. Novo saldo R$%.2f\n", this.balanco);
    }

    public void Sacar(double saque) {
        if (this.balanco >= saque) {
            this.balanco -= saque;
            System.out.printf("Saque efetuado com sucesso. Novo saldo R$%.2f\n", this.balanco);
        } else {
            System.out.printf("Saque nao efetuado. Saldo insuficiente.\nSaldo atual R$%.2f", this.balanco);
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public double getBalanco() {
        return balanco;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta = " + numeroConta + ", proprietario = " + proprietario + ", balanco = " + balanco + '}';
    }

}
