/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package He;

/**
 *
 * @author Omar
 */
public class PC {
    String modelo;
    private String marca;
    private String procesador;
    private String almacenamiento;
            
    public PC (
    String modelo,
    String marca,
    String procesador,
    String almacenamiento) {
        
    this.modelo=modelo;
    this.marca=marca;
    this.procesador=procesador;
    this.almacenamiento=almacenamiento;
        
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    public String toString (){
        String mensaje="El Modelo es "+modelo+"Marca  "+marca+" con un"+procesador+"  " +
                "y un salario de "+almacenamiento;
        return mensaje;
    }
     
    public boolean equals(Pcgaming de) {
        if (this == de) return true;
        if (de == null) return false;
        return false;
        
}}

