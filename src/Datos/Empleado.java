/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import fecha.Fecha;
import java.util.ArrayList;

/**
 *
 * @author 203pc1
 */
public class Empleado {

    //tipo de usuario

    int tipoUsuario;
    String login;
    String pass;
    String nombre;
    int identificador;
    //en un arraylist el indice cambia al eliminar NO SE PUEDE USAR
    //si no se pone dentro de <> tipo (Correo) se crea uno generico
    ArrayList<Correo> bEntrada;

    public Empleado(int t, String l, String p, String n, int i) {
        //OBLIGATORIO INSTANCIAR ARRAYLIST AUNQUE ESTE VACIO
        tipoUsuario = t;
        login = l;
        pass = p;
        nombre = n;
        identificador = i;
        bEntrada = new ArrayList<>();
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Correo> getbEntrada() {
        return bEntrada;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setbEntrada(ArrayList<Correo> bEntrada) {
        this.bEntrada = bEntrada;
    }

    public int getIdentificador() {
        return identificador;
    }
    //CUANDO SE USE TOSTRING DEVUELVE EL NOMBRE 
    
    @Override
    public String toString() {
        return nombre;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // todo el correo a la vez
    public void recibirCorreo(Correo c){
        bEntrada.add(c);
    }
    // cada elemento del correro
    public void recibirCorreo(String asunto, String Texto, int codigoEmisor, Fecha fecha){
        Correo c= new Correo(asunto,Texto, codigoEmisor, fecha);
        bEntrada.add(c);
    }
}
