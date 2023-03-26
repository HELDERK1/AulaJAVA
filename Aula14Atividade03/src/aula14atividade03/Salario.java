/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14atividade03;

/**
 *
 * @author Helder Kennedy
 */
public class Salario {

    double salario, aumento;
    int ano = 2010;

    void CalculaAumento() {
        do {
            System.out.printf("%d - salario = %.0f\n", this.ano, this.salario);

            this.salario = this.salario + this.salario * this.aumento / 100;
            this.aumento = this.aumento * 2;

            this.ano++;
        } while (this.ano <= 2022);
    }
}
