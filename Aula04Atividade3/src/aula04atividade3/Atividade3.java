package aula04atividade3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        String parcelas;
        String[] valores;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor de duas parcelas separada por virgula:");
                
        parcelas = entrada.nextLine();
        valores = parcelas.split(",");
        System.out.println();
        System.out.printf("Soma =  %d%n",Integer.parseInt(valores[0])+ Integer.parseInt(valores[1]));
    }
    
}