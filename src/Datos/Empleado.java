/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

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
    ArrayList<Datos> bEntrada;

    public Empleado(int t, String l, String p, String n, int i) {
        //OBLIGATORIO INSTANCIAR ARRAYLIST AUNQUE ESTE VACIO
        tipoUsuario = t;
        login = l;
        pass = p;
        nombre = n;
        identificador = 1;
        bEntrada = new ArrayList<>();
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }
    
    

}
