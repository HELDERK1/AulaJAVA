/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16atividade03;

/**
 *
 * @author Helder Kennedy
 */
public class OperacaoMatematica {

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    protected int num;

    public void VerificaParOuImpar() {
        if (num % 2 == 0) {
            System.out.printf("O numero %d e par.\n", num);
        } else {
            System.out.printf("O numero %d e impar.\n", num);
        }
    }

    public void VerificaSePrimo() {
        int cont = 1, verif = 0;

        do {
            if (this.num % cont == 0) {
                verif++;
            }
            cont++;
        } while (cont <= this.num);

        if (verif == 2) {
            System.out.printf("O numero %d e primo.\n", this.num);
        } else {
            System.out.printf("O numero %d nao e primo.\n", this.num);
        }
    }
}
