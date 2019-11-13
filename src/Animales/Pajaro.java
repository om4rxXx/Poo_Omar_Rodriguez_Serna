/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

/**
 *
 * @author Omar
 */
public class Pajaro {
     public String color;
    public double altura;
    public double peso;
    public String raza;
    
    
   public void bonito(
     String color,
     double altura,
     double peso,
     String raza){
       
   this.color=color;
   this.raza=raza;
   this.altura=altura;
   this.peso=peso;
   
   
   if (altura>10||peso>5){
   System.out.println("Tu pajaro esta bonito");
   }
   else{
       System.out.println("Tu pajaro esta feo");
   
   
   }
   
    
}
   
    public double getAltura(){
    return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double getPeso(){
    return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso=peso;
    }
    
    public String getColor(){
    return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
      public String getRaza(){
    return this.raza;
    }
    
    public void setRaza(String raza){
        this.raza=raza;
    }

}
