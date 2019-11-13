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
public class Cuadrados {
    private double altura;
    private double base;
    private String color;
    
    private void area(double altura,double base){
        this.altura=altura;
        this.base=base;
        double area;
        
       area=base*altura;
       System.out.println(area);
       
       }
     private void perimetro(double altura,double base){
        this.altura=altura;
        this.base=base;
        double perimetro;
        if(base==altura){//cuadro
            perimetro=base*4;
        }
        else{
       perimetro=(base*2)+(altura*2);
       
       
       }
        
        System.out.println(perimetro);
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
    
    public String getColor(){
    return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
}
