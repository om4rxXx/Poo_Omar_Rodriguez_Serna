/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Omar
 */
public class Resta extends Operaciones{
    
    private double resta;
       
    public Resta(double num1, double num2) {
             
        super(num1, num2, '-');
        this.resta = num1 - num2;
        this.setRespuesta(this.getResta());
    }

    public double getResta() {
        return resta;
    }

    
    
}
