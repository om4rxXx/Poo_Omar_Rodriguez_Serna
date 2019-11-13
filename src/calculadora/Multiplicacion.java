/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Alumno
 */
public class Multiplicacion extends Operaciones{
    
   private double multi;
       
    public Multiplicacion(double n1, double n2) {
             
        super(n1, n2, '*');
        this.multi = n1 * n2;
        this.setRespuesta(this.getMulti());
    }

    public double getMulti() {
        return multi;
    }

    
    
} 
    

