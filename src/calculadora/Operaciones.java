/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Alumno 
 */
public class Operaciones {
    
    private double num1;
    private double num2;
    private double respuesta;
    private char operacion;

    
    public Operaciones(double num1, double num2, char operacion) {
        
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
    }
    
        
    public void mostrarResultado(){
        
        System.out.println(this.getNum1()+" "+this.operacion+" "+this.getNum2()+" = "+this.respuesta);
        
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(double respuesta) {
        this.respuesta = respuesta;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
    
    
}
