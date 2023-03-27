/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula17atividade01;

/**
 *
 * @author Helder Kennedy
 */
public class Motor implements IMotor{
    public Boolean ligado;
    private Boolean gasolina = false;

    @Override
    public void Ligar() {
        if (VerificarGasolina()) {
            System.out.println("O motor foi ligado;");
        }else{
            System.out.println("Nao temos gasolina para ligar o motor");
        }
  
    }

    @Override
    public Boolean VerificarGasolina() {
      return gasolina;  
    }
}
