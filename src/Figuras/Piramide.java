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
public class Piramide {
      public double altura;
    public double base;
    public double caras;
    
    public void Piramide(double altura,double base,double caras){
        this.altura=altura;
        this.base=base;
        this.caras=caras;
        
       
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
    
    public double getCaras(){
    return this.caras;
    }
    
    public void setCaras(double caras){
        this.caras=caras;
    }
}

