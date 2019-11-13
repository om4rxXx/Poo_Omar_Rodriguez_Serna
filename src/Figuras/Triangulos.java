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
public class Triangulos {
    
    private double base;
    private double l2;
    private double l3;
    private double h;
    
    
 private void areat(double base, double h){
     this.base=base;
     this.h=h;
     double area;
     
     area=(base*h)/2;
     System.out.println(area);
 }  

private void perit(double base, double l2, double l3){
     this.base=base;
     this.l3=l3;
     this.l2=l2;
     double perit;
     
     perit=base+l3+l2;
     System.out.println(perit);
 }   
 public double getL1(){
    return this.l2;
    }
    
    public void setL2(double l2){
        this.l2=l2;
    }
    
    public double getBase(){
    return this.base;
    }
    
    public void setBase(double base){
        this.base=base;
    }
    
    public double getL3(){
    return this.l3;
    }
    
    public void setL3(double l3){
        this.l3=l3;
    }
    public double getH(){
    return this.h;
    }
    
    public void setH(double h){
        this.h=h;
    }
}
