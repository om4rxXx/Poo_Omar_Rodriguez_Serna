/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *Crear objetos circulos
 * @author Omar
 */
public class Circulo {
    
    
    private double radio;
    private double pi=3.14;
    private double diametro;
    
    private void Circuo(double radio,double diametro){
        this.radio=radio;
        
        this.diametro=diametro;
     double area;
        
      area=pi * Math.pow(radio,2);
       System.out.println(area);
        
        
    }
    
    public double getRadio(){
    return this.radio;
    }
    
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    public double getPi(){
    return this.pi;
    }
    
    public void setPi(double pi){
        this.pi=pi;
    }
    
    public double getDiametro(){
    return this.diametro;
    }
    
    public void setDiametro(double diametro){
        this.diametro=diametro;
    }
}
