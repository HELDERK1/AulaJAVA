package aula04atividade5;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int a, b, c, d;
        String coleta;
        String[] valores;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quatro valores inteiros separados por virgula:");
                
        coleta = entrada.nextLine();
        valores = coleta.split(",");
        a = Integer.parseInt(valores[0]);
        b = Integer.parseInt(valores[1]);
        c = Integer.parseInt(valores[2]);
        d = Integer.parseInt(valores[3]);
        System.out.println();
        System.out.printf("DIFERENCA =  %d%n", a*b - c*d);
    }
    
}
