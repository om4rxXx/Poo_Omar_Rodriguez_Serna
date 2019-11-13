/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Alumno
 */

@SuppressWarnings("serial")
public class EscucharTeclas extends JFrame implements KeyListener {
 
 private JButton button;
 
 public EscucharTeclas() {
 
  add(getbAceptar());
  inicializador();
 }
 
 private void inicializador() {
 
  setLayout(null);
  setTitle("Prueba con Teclas");
  setVisible(true);
  setSize(300, 300);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
 
 }
 
 
 
 @Override
 public void keyPressed(KeyEvent e) {
 
  int key = e.getKeyCode();
 
  if (key == KeyEvent.VK_0) {
 
   System.out.println("Presionó Enter!" + (char) key);
  }
  if (key == KeyEvent.VK_1) {
 
   System.out.println("Presionó Espacio!" + (char) key);
  }
 
 }
 
 @Override
 public void keyReleased(KeyEvent e) {
  System.out.println("Soltó una tecla");
 }
 
 @Override
 public void keyTyped(KeyEvent e) {
  System.out.println("Escribió una tecla");
 }
 
}