/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Aula13Atividade01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.modelo = "Pegeout";
        carro1.cor = "Branco";
        carro1.velocidade = 40.0;
        carro1.Status();
        carro1.Frear();
        carro1.Acelerar();
        carro1.Acelerar();
        System.out.println(" ");

        carro2.modelo = "HB20";
        carro2.cor = "Prata";
        carro2.velocidade = 0.0;
        carro2.Status();
        carro2.Frear();
        carro2.Acelerar();
        carro2.Acelerar();
        System.out.println(" ");

        carro3.modelo = "Ford KA";
        carro3.cor = "Preto";
        carro3.velocidade = 80.0;
        carro3.Status();
        carro3.Frear();
        carro3.Acelerar();
        carro3.Acelerar();
        System.out.println(" ");
    }

}
