/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ropa;

/**
 *
 * @author Omar
 */
public class zapatos {
    
    private double talla;
    private String marca;
    private String modelo;
    
    public void Tenis(double talla, String marca, String modelo){
        
       this.marca=marca;
       this.modelo=modelo;
       this.talla=talla;
    }
    public double getTalla(){
    return this.talla;
    }
    
    public void setTalla(double talla){
        this.talla=talla;
    }
    
    public String getMarca(){
    return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
      public String getModelo(){
    return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
}
