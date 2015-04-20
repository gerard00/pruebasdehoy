/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import fecha.Fecha;

/**
 *
 * @author gerardo
 */
public class Correo {
    
    private String asunto;
    private String texto;
    private int codigoEmisor;
    private Fecha fecha;

    public Correo(String asunto, String Texto, int codigoEmisor, Fecha fecha){
        
    }
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String visualizar() {
        return fecha.visualizar();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCodigoEmisor() {
        return codigoEmisor;
    }

    public void setCodigoEmisor(int codigoEmisor) {
        this.codigoEmisor = codigoEmisor;
    }
    
    public String getFecha(){
        return fecha.visualizar();
    }
    
   
    
}
