/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author Alumno
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class ListenerB implements ActionListener{

    static void add(Botones btn1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public ListenerB() {
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
     Botones aux = (Botones) e.getSource();
       
       if (aux.getText().equals("1")){
         
    }
       if (aux.getText().equals("2")){
          
         
    }
        if (aux.getText().equals("3")){
        
    }
         if (aux.getText().equals("4")){
       
    } 
         if (aux.getText().equals("5")){
        
    }
         
    
}}

