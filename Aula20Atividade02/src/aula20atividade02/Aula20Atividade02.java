/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Aula20Atividade02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo f1 = new Retangulo();
        Circulo f2 = new Circulo();
        
        f1.setCor(Cor.BLACK);
        f1.setLargura(22.5);
        f1.setAltura(13.13);
        
        f2.setCor(Cor.RED);
        f2.setRaio(22.1);
        
        Forma[] lstForma = new Forma[2];
        
        lstForma[0] = f1;
        lstForma[1] = f2;
        
        for (Forma lstForma1 : lstForma) {
            System.out.printf("A area e = %.2f\n", lstForma1.CalcularArea());
            System.out.printf(lstForma1.toString() + "\n");
            System.out.printf("#####################################\n");
        }
    }
    
}
