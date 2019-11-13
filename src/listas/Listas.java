/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ///ARRAY
ArrayList<String> Arrayyyyy = new ArrayList<String>();
Arrayyyyy.add("hola 0");
Arrayyyyy.add(1, "hola 1");
Arrayyyyy.add(2, "hola 2");

        System.out.println(Arrayyyyy.size());
        Arrayyyyy.remove(0);
        System.out.println(Arrayyyyy.size());
        System.out.println(Arrayyyyy.get(0));
        System.out.println(Arrayyyyy.toString());
        Arrayyyyy.iterator();
        //LISTA 
List<String> listaa= new ArrayList<>();
listaa.add("hola0");
listaa.add("hola1");
listaa.add("hola2");
listaa.add("jjj3");
        System.out.println(listaa.size());
        System.out.println(listaa.get(0));
        System.out.println(listaa.get(1));
        listaa.remove(0);
        System.out.println(listaa.size());
        System.out.println(listaa.get(0));
        System.out.println(listaa.get(1));
         
        LinkedList<String> linkeddd= new LinkedList<>();
linkeddd.add("0");
linkeddd.add("1");
linkeddd.add("2");
linkeddd.add("3");
linkeddd.add("4");
linkeddd.add("5");
linkeddd.add("6");
 
    }
    
}
