package aula04atividade4;
import java.util.Scanner;
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raio, area;
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Informe o valor do raio:");        
        raio = entrada.nextDouble();
        
        area = Math.PI * (raio*raio);     
        System.out.printf("Area (duas casas decimais) = %.2f%n", area); 
        System.out.printf("Area (quatro casas decimais) =  %.4f%n", area);
    }    
}

