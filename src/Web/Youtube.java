/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

/**
 *
 * @author Omar
 */
public class Youtube {
    private String proposito;
    private String dueno;
    private String inicio;
    
    public void Web(String proposito,
     String dueno,
     String inicio){
        
        this.proposito=proposito;
        this.dueno=dueno;
        this.inicio=inicio;
        
        System.out.println();
}
     
    public String getProposito(){
    return this.proposito;
    }
    
    public void setProposito(String proposito){
        this.proposito=proposito;
    }
    
      public String getDueno(){
    return this.dueno;
    }
    
    public void setDueno(String dueno){
        this.dueno=dueno;
    }
    
      public String getInicio(){
    return this.inicio;
    }
    
    public void setInicio(String inicio){
        this.inicio=inicio;
    }
}
