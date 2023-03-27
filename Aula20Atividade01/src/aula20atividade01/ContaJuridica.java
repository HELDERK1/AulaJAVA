/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class ContaJuridica extends Conta {

    private double limiteEmprestimo = 15000;

    public boolean SolicitarEmprestimo(double solicitado) {
        if (solicitado <= this.limiteEmprestimo) {
            if (getBalanco() >= 10) {
                setBalanco(getBalanco() + solicitado - 10);
                System.out.printf("Emprestimo aprovado!\n");
                System.out.printf("Seu novo saldo e R$ %.2f\n", getBalanco());
                return true;
            } else {                
                System.out.printf("Nao foi possivel descontar a taxa de R$10,00. Saldo insuficiente: R$ %.2f\n", getBalanco());
                return false;
            }

        } else {
            System.out.printf("Seu liminte aprovado e R$ %.2f\n", this.limiteEmprestimo);
            return false;
        }

    }
}
