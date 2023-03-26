/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14atividade06;

/**
 *
 * @author Helder Kennedy
 */
public class Funcionario {

    String nome;
    double imposto, salarioBruto, aumento;

    void CalcularSalarioLiquido() {
        double salarioLiquido = this.salarioBruto - this.salarioBruto * this.imposto / 100;
        System.out.printf("O salario liquido do %s = R$ %.2f\n", nome, salarioLiquido);
    }

    void CalcularAumentoSalario() {
        this.salarioBruto += this.salarioBruto * aumento / 100;
        System.out.printf("O salario bruto com aumento do %s = R$ %.2f\n", nome, this.salarioBruto);
    }
}
