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
public class Division extends Operaciones{
    
    private double div = 0;
       
    public Division(double n1, double n2) {
             
        super(n1, n2, '/');
        if(n2==0) System.out.println("indeterminado");
        else this.div = n1 / n2;
        this.setRespuesta(this.getDiv());
    }    

    public double getDiv() {
        return div;
    }

    
    
    
}
