/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20atividade02;

/**
 *
 * @author Helder Kennedy
 */
public abstract class Forma {
    private Cor cor;    

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
    public abstract double CalcularArea();
}
