/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula18atividade01;

/**
 *
 * @author Helder Kennedy
 */
public interface IConta {
    public abstract void Depositar(double deposito);
    public abstract void Sacar(double saque);
    public abstract void Cadastrar(String numeroDaConta, String proprietario);
    public abstract void ImprimirDados();
}
