package aula06atividade5;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        int a, b, c;
        String result;
        boolean verifTriangulo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor A para o triangulo:");
        a = entrada.nextInt();

        System.out.println("Informe o valor B para o triangulo:");
        b = entrada.nextInt();

        System.out.println("Informe o valor C para o triangulo:");
        c = entrada.nextInt();

        verifTriangulo = ((a + b) > c & (a + c) > b & (b + c) > a);

        if (verifTriangulo) {
            if (a==b & b==c) {
              System.out.println("E um truangulo Equilatero\n");  
            }else if(a!=b & a!=c & b!=c){
                System.out.println("E um truangulo Escaleno\n");  
            }else{
                System.out.println("E um truangulo Isoceles\n");  
            }
            
        } else {
            System.out.println("As dimensoes nao forma um triangulo\n");
        }

        //System.out.printf("O novo valor = %d\n", valor);
    }

}
