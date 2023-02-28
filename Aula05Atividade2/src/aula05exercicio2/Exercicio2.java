package aula05exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Boolean verificacao;
        verificacao = (10 == 10 & 10 == 20);
        System.out.printf("a) " + verificacao + "\n");
        
        verificacao = (11 == 12 & 20 == 20);
        System.out.printf("b) " + verificacao + "\n");
        
        verificacao = (15 == 15 & 16 == 16);
        System.out.printf("c) " + verificacao + "\n");
        
        verificacao = (12 == 11 & 23 == 24);
        System.out.printf("d) " + verificacao + "\n");
        
        verificacao = (10 == 10 || 10 == 20);
        System.out.printf("e) " + verificacao + "\n");
        
        verificacao = (11 == 12 || 20 == 20);
        System.out.printf("f) " + verificacao + "\n");
        
        verificacao = (15 == 15 || 16 == 16);
        System.out.printf("g) " + verificacao + "\n");
        
        verificacao = (12 == 11 || 23 == 24);
        System.out.printf("h) " + verificacao + "\n");
    }
    
}
