/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20atividade03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Helder Kennedy
 */
public class Aula20Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {                
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error oppening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("O bloco Finally foi executado");
        }
    }

}
