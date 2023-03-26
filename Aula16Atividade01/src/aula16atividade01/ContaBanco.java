/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private Boolean status;

    public ContaBanco() {
        this.saldo = 0.00;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void AbrirConta(String dono, String tipo) {
        this.status = true;
        if (tipo.toUpperCase().equals("CC")) {
            this.tipo = tipo.toUpperCase();
            this.saldo += 50.00;
        } else {
            this.tipo = tipo.toUpperCase();
            this.saldo += 150.00;
        }
        this.numConta = 10001;
        this.dono = dono;
    }

    public void FecharConta() {
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta fechada!\n");
        } else {
            System.out.printf("A conta nao pode ser fechada!\nO saldo precisa estar zerado. Saldo atual R$%.2f\n", this.saldo);
        }

    }

    public void Depositar(double deposito) {
        if (status) {
            this.saldo += deposito;
            System.out.printf("Deposito efetuado com sucesso!\nO novo saldo e R$%.2f\n", this.saldo);
        } else {
            System.out.printf("A conta esta fechada!\nDeposito nao efetuado.f\n");
        }

    }

    public void Sacar(double saque) {
        if (status) {
            if (this.saldo >= saque) {
                this.saldo -= saque;
                System.out.printf("Saque efetuado com sucesso!\nO novo saldo e R$%.2f\n", this.saldo);
            } else {
                System.out.printf("Saque nao efetuado!\nO saldo e R$%.2f\n", this.saldo);
            }
        } else {
            System.out.printf("A conta esta fechada!\nSaque nao efetuado.\n");
        }
    }

    public void PagarMensal() {
        if (tipo.toUpperCase().equals("CC")) {
            this.saldo -= 12.00;
        } else {
            this.saldo -= 20.00;
        }
    }
    public void ImprimirDados(){       
            System.out.printf("Titular: %s\nTipo: %s\nNumero da conta: %d\nSaldo: R$%.2f\nStatus: %B\n", this.dono, this.tipo, this.numConta, this.saldo, this.status); 
    }
}
