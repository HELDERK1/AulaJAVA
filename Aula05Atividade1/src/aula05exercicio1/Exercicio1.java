package aula05exercicio1;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       int idade;
        String resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a idade do eleitor:");
        idade = entrada.nextInt();
        
        resultado = ((idade >= 16 & idade < 18) || idade >= 70)? "Voto facultativo" : "Voto Obrigatorio";
                
        System.out.printf(resultado + "\n");
    }
    
}
