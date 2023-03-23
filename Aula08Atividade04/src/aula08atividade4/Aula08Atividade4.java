package aula08atividade4;

import java.util.Scanner;

public class Aula08Atividade4 {

    public static void main(String[] args) {
        double nota;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        nota = entrada.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota += entrada.nextDouble();
        System.out.println("Informe a terceira nota:");
        nota += entrada.nextDouble();

        if (nota/3 >= 7) {
         System.out.printf("A media = %.2f\nAluno aprovado\n",nota/3 );   
        } else if(nota/3 >= 5){            
         System.out.printf("A media = %.2f\nAluno recuperacao\n",nota/3 ); 
        }else{                        
         System.out.printf("A media = %.2f\nAluno reprovado\n",nota/3 ); 
        }
        
    }
}
