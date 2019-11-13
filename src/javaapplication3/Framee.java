/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;



import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author CRUZLEIJA
 */
public class Framee extends JFrame {

    public Framee() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(10,7));
        JPanel panelarriba = new JPanel(new GridLayout(1,10));
        JPanel panellat = new JPanel(new GridLayout(2,3));
        // creamos los botones
        Dimension dim = new Dimension(20,20);
        Botones btna = new Botones("A", dim, Color.red);
        Botones btnb = new Botones("B", dim, Color.red);
        Botones btnc = new Botones("C", dim, Color.red);
        Botones btnd = new Botones("D", dim, Color.red);
        Botones btne = new Botones("E", dim, Color.red);
        Botones btnf = new Botones("F", dim, Color.red);
        Botones btng = new Botones("G", dim, Color.red);
        Botones btnh = new Botones("H", dim, Color.red);
        Botones btni = new Botones("I", dim, Color.red);
        Botones btnj = new Botones("J", dim, Color.red);
        Botones btnk = new Botones("K", dim, Color.red);
        Botones btnl = new Botones("L", dim, Color.red);
        Botones btnm = new Botones("M", dim, Color.red);
        Botones btnn = new Botones("N", dim, Color.red);
        Botones btnñ = new Botones("Ñ", dim, Color.red);
        Botones btno = new Botones("O", dim, Color.red);
        Botones btnp = new Botones("P", dim, Color.red);
        Botones btnq = new Botones("Q", dim, Color.red);
        Botones btnki = new Botones("K", dim, Color.red);
        
        Botones btnr = new Botones("R", dim, Color.red);
        Botones btns = new Botones("S", dim, Color.red);
        Botones btnt = new Botones("T", dim, Color.red);
        Botones btnu = new Botones("U", dim, Color.red);
        Botones btnv = new Botones("V", dim, Color.red);
        Botones btnw = new Botones("W", dim, Color.red);
        Botones btnx = new Botones("X", dim, Color.red);
        Botones btny = new Botones("Y", dim, Color.red);
        Botones btnz = new Botones("Z", dim, Color.red);
        
        
        
        Botones btn0 = new Botones("0", dim, Color.BLUE);
        Botones btn1 = new Botones("1", dim, Color.BLUE);
        Botones btn2 = new Botones("2", dim, Color.BLUE);
        Botones btn3 = new Botones("3", dim, Color.BLUE);
        Botones btn4 = new Botones("4", dim, Color.BLUE);
        Botones btn5 = new Botones("5", dim, Color.BLUE);
        Botones btn6 = new Botones("6", dim, Color.BLUE);
        Botones btn7 = new Botones("7", dim, Color.BLUE);
        Botones btn8 = new Botones("8", dim, Color.BLUE);
        Botones btn9 = new Botones("9", dim, Color.BLUE);
        
         Botones btnArr = new Botones("↑", dim, Color.GRAY);
         Botones btnAba = new Botones("→", dim, Color.GRAY);
         Botones btnIz = new Botones("←", dim, Color.GRAY);
         Botones btnDer = new Botones("↓", dim, Color.GRAY);
         
         panelCentral.add(btna);
         panelCentral.add(btnb);
         panelCentral.add(btnc);
         panelCentral.add(btnd);
         panelCentral.add(btne);
         panelCentral.add(btnf);
         panelCentral.add(btng);
         panelCentral.add(btnh);
         panelCentral.add(btni);
         panelCentral.add(btnj);
         panelCentral.add(btnki);
         panelCentral.add(btnl);
         panelCentral.add(btnm);
         panelCentral.add(btnn);
         panelCentral.add(btnñ);
         panelCentral.add(btno);
         panelCentral.add(btnp);
         panelCentral.add(btnq);
         panelCentral.add(btnr);
         panelCentral.add(btns);
         panelCentral.add(btnt);
         panelCentral.add(btnu);
         panelCentral.add(btnv);
         panelCentral.add(btnw);
         panelCentral.add(btnx);
         panelCentral.add(btny);
         panelCentral.add(btnz);
        
        
        
         panelarriba.add(btn1);
         panelarriba.add(btn2);
         panelarriba.add(btn3);
         panelarriba.add(btn4);
         panelarriba.add(btn5);
         panelarriba.add(btn6);
         panelarriba.add(btn7);
         panelarriba.add(btn8);
         panelarriba.add(btn9);
         panelarriba.add(btn0);
         
         panellat.add(btnAba);
         panellat.add(btnArr);
         panellat.add(btnDer);
         panellat.add(btnIz);
         
        
        
       /* ListenerB a= new ListenerB();
        EscucharTeclas b= new EscucharTeclas();
        btn1.addActionListener(a);
        btn2.addActionListener(a);
        btn3.addActionListener(a);
        btn4.addActionListener(a);
        btn5.addActionListener(a);
        btn1.EscucharTeclas(a);
        */
       
         
        // TODO add your handling code here:
    
       // TODO add your handling code here:
   
             
        
       btn1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
                int key = ke.getKeyCode();
                
                if (key==KeyEvent.VK_0){
                    btn0.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_1){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_2){
                    btn2.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_3){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_4){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_5){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_6){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_6){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_8){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_9){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_A){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_B){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_C){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_D){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_E){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_F){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_G){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_H){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_I){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_J){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_K){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_L){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_M){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_N){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_O){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_P){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_Q){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_R){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_S){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_T){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_U){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_V){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_X){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_Y){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_Z){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_UP){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_DOWN){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_LEFT){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_RIGHT){
                    btn1.setBackground(Color.blue);
                
                
                
                
            }}

            @Override
            public void keyReleased(KeyEvent ke) {
               
                int key = ke.getKeyCode();
                
                if (key==KeyEvent.VK_0){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_1){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_2){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_3){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_4){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_5){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_6){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_6){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_8){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_9){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_A){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_B){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_C){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_D){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_E){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_F){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_G){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_H){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_I){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_J){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_K){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_L){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_M){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_N){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_O){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_P){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_Q){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_R){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_S){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_T){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_U){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_V){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_X){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_Y){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_Z){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_UP){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_DOWN){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_LEFT){
                    btn1.setBackground(Color.blue);
                }
                if (key==KeyEvent.VK_RIGHT){
                    btn1.setBackground(Color.blue);
                
                
                
                
            }
            }
            
            
            
        });
       panelCentral.setVisible(true);
       panelarriba.setVisible(true);
       panellat.setVisible(true);
       
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        add(panelarriba,BorderLayout.NORTH);
        add(panellat,BorderLayout.SOUTH);
        setDefaultCloseOperation(Framee.EXIT_ON_CLOSE);
        
    } 
       
       } 