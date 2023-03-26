/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula16atividade02;

/**
 *
 * @author Helder Kennedy
 */
public class Carro {

    public String cor, marca;
    public int ano, marcha;
    public Boolean ligado;
    public double velocidadeAtual, velocidadeMaxima;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMarcha() {
        return marcha;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void Ligar() {
        ligado = true;
        System.out.printf("Carro ligado!\n");
    }

    public void Desligar() {
        ligado = false;
        System.out.printf("Carro desligado!\n");
    }

    public void Acelerar() {
        if (ligado) {
            switch (this.marcha) {
                case -1 -> {
                    this.velocidadeAtual = 10;
                    System.out.printf("Velocidade atual %.2f, limite para a ré.", this.velocidadeAtual);
                }
                case 1 -> {
                    this.velocidadeAtual += 10;
                    if (this.velocidadeAtual > 40) {
                        this.marcha = 2;
                    }
                    System.out.printf("Velocidade atual %.2f.", this.velocidadeAtual);
                }
                case 2 -> {
                    this.velocidadeAtual += 10;
                    if (this.velocidadeAtual > 80) {
                        this.marcha = 3;
                    }
                    System.out.printf("Velocidade atual %.2f.", this.velocidadeAtual);
                }
                default -> {
                    this.velocidadeAtual += 10.00;
                    System.out.printf("Velocidade atual %.2f", this.velocidadeAtual);
                }
            }

        } else {
            System.out.printf("O vaiculo precisa estar ligado.\n");
        }

    }

    public void PegarMarcha() {
        if (this.velocidadeAtual == 0) {
            this.marcha = 1;
        } else {
            this.marcha++;
        }

    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Carro() {
        this.marcha = 0;
        this.ligado = false;
    }

    public void ImprimirStatus() {
        System.out.printf("Cor: %s\nMarca: %s\nAno: %d\nMarcha: %d\nLigado: %b\nVelocidade Atual: %.2f\n", this.cor, this.marca, this.ano, this.marcha, this.ligado, this.velocidadeAtual);
    }
}
