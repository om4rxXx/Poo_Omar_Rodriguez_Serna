/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Omar
 */
public class cubo {
    private double altura;
    private double base;
    private double ancho;
    
    private void cubo(double altura,double base,double ancho){
        this.altura=altura;
        this.base=base;
        this.ancho=ancho;
        
       
       System.out.println();
      
}
    public double getAltura(){
    return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double getBase(){
    return this.base;
    }
    
    public void setBase(double base){
        this.base=base;
    }
    
    public double getAncho(){
    return this.ancho;
    }
    
    public void setAncho(double ancho){
        this.ancho=ancho;
    }
}

