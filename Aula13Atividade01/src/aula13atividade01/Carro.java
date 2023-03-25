/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Carro {
    double velocidade, velocidadeAtual;
    String modelo, cor;
    
    void Status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Celocidade: " + this.velocidade);
    }
    void Acelerar(){
        if (velocidade < 20) {
            velocidadeAtual = this.velocidade + 10;
            System.out.println("Acelerando");            
            System.out.println("Velocidade atual: " + this.velocidadeAtual);
        }else{
            if (velocidade > 60) {
                System.out.println("Acima do limite!!");                
            }else{
                System.out.println("Dentro do limite!!");
            }
        }
    }
    void Frear(){
        if (velocidade > 60) {
            velocidadeAtual = this.velocidade - 10;
            System.out.println("Freando");            
            System.out.println("Velocidade atual: " + this.velocidadeAtual);
        }else{
            if (velocidade < 60) {
                System.out.println("Avaixo do limite!!");                
            }else{
                System.out.println("Dentro do limite!!");
            }
        }
    }
    void AcenderFarol(){
        if (velocidade == 0) {
            System.out.println("Farol apagado!!");
        }else{
            System.out.println("Farol aceso!!");
        }
    }
}
