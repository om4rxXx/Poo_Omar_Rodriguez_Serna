/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareea;

import Calculadora.Division;
import Calculadora.Multiplicacion;
import Calculadora.Resta;
import Calculadora.Suma;

/**
 *
 * @author Alumno
 */
public class Tareea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
double num1 = 20;
double num2 = 5;
        
//suma
Suma sum = new Suma(num1,num2);
sum.mostrarResultado();
        
//resta
Resta res = new Resta(num1,num2);
res.mostrarResultado();
        
//multiplicacion
Multiplicacion mul = new Multiplicacion(num1,num2);
mul.mostrarResultado();
        
//division
Division div = new Division(num1,num2);
div.mostrarResultado();
    }
    
}
