/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList; 
/**
 *
 * @author Alumno
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Object> Listona = new ArrayList<>();
        Perro aux1 = new Perro();
        Carro aux2 = new Carro();
        Fruta aux3 = new Fruta();
        
        Listona.add(aux1);
        Listona.add(aux2);
        Listona.add(aux3);
        
        for(Object aux:Listona){
            if(aux instanceof Perro){
                Perro aux8=(Perro)aux;
                System.out.println(aux8.toString());
            }
            if(aux instanceof Carro){
                Carro aux6=(Carro)aux;
                System.out.println(aux6.toString());
            }
            if(aux instanceof Fruta){
                Fruta aux4=(Fruta)aux;
                System.out.println(aux4.toString());
            }
        }
    }
    
}
