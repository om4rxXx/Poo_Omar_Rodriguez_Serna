package Electronicoss;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class PC {
    
   public String marcap;
   public String modelop;
   public String procesador;
   public double precio;
   public int ram; 
    
    
    
public void PC( String marcap,
                     String modelop,
                     String procesador,
                     double precio,
                     int ram){
         this.marcap=marcap;
         this.modelop=modelop;
         this.procesador=procesador;
         this.precio=precio;
         this.ram=ram;
         
         
         
        System.out.println("hola soy una PC");
    } 
    
    
}
