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
public class Suma extends Operaciones{
    
   private double suma;
       
    public Suma(double num1, double num2) {
             
        super(num1, num2, '+');
        this.suma = num1 + num2;
        this.setRespuesta(this.getSuma());
    }

    public double getSuma() {
        return suma;
    }

   
}