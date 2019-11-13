/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;


import He.Pcgaming;
import com.sun.org.apache.xpath.internal.operations.Equals;


/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     Pcgaming  dell= new Pcgaming("usn16", "Dell", "i5800h", "8GB", "RTX 280 Ti", 8, 6, 2.6) ;
    dell.toString();
     Pcgaming  de= new Pcgaming("usn16", "Dell", "i5800h", "8GB", "RTX 280 Ti", 8, 6, 2.6) ;
    de.toString();
        dell.equals(de);
        
    System.out.println(dell.toString());
     
    
      
       
       
    }
    
}
