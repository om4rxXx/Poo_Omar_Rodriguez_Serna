package Electronicoss;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class Celular {
    
   public String marca;
   public String modelo;
   public int almacenamiento;
   public double precio;
   public String compania; 
    
    
    
public void Celular( String marca,
                     String modelo,
                     int almacenamiento,
                     double precio,
                     String compania){
         this.marca=marca;
         this.modelo=modelo;
         this.almacenamiento=almacenamiento;
         this.precio=precio;
         this.compania=compania;
         
         
         
        System.out.println("hola soy un cel");
    } 
    
    
}
