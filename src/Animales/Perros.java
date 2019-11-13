package Animales;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class Perros {
    
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
   
   
   if (altura>30||peso>30){
   System.out.println("Tu perro esta bonito");
   }
   else{
       System.out.println("Tu perro esta feo");
   
   
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
