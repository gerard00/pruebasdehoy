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
public class Empresa {
    //EMPLEADO es el tipo de dato
   ArrayList <Empleado> misEmpleados;

    public Empresa() {
        //conjunto de empleados
        // no se pone <EMPLEADO> por que ya esta en la definicion
        misEmpleados= new ArrayList<>();
        //Se crea administrador ENUNCIADO
        Empleado e=new Empleado(1,"maria","pardo","Maria Pardo",0);
        Empleado i=new Empleado(2,"gerardo","moral","Gerardo Moral",1);
        // e=> tipo EMPLEADO hay que añadir un objeto del tipo puesto en los <>
        // en .add se puede poner (posicion,e) CUIDADO posicion> ultimo elemento sino ERROR
        // si no se pone nada lo coloca el ultimo
        misEmpleados.add(e);
        misEmpleados.add(i);
        
        
        
    }

    public ArrayList<Empleado> getMisEmpleados() {
        return misEmpleados;
    }
    
    //BUSQUEDA EN EMPRESA por que tiene MISEMPLEADOS
    
    public int Buscar(String l, String c){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<misEmpleados.size()){
            if(misEmpleados.get(pos).login.equals(l)&& misEmpleados.get(pos).pass.equals(c))
                encontrado=true;
            else
                pos++;
        }  
            if (!encontrado)
                pos=-1;
            
        
        return pos;
    }
    
    public int BuscarUsuario(String l){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<misEmpleados.size()){
            if(misEmpleados.get(pos).login.equals(l))
                encontrado=true;
            else
                pos++;
        }  
            if (!encontrado)
                pos=-1;
            
        
        return pos;
    }
    
    public int BuscarIdentificador(int l){
        int pos=0;
        boolean encontrado=false;
        while(!encontrado && pos<misEmpleados.size()-1){
            if(misEmpleados.get(pos).identificador==l)
                encontrado=true;
            else
                pos++;
        }  
            if (!encontrado)
                pos=-1;
            
        
        return pos;
    }
    
    
   public void guardar(Empleado e)
   {
       misEmpleados.add(e);
   }
   
   public int tipo(int pos){
         return  misEmpleados.get(pos).tipoUsuario;
        
   }
   
   public void anadir (Empleado e){
       misEmpleados.add(e);
   }
   
   public ArrayList<Empleado> empleados(){
       return misEmpleados;
   } 
   
   public void modificarempleado (int pos,String pass, String nombre, int Tipo){
       misEmpleados.get(pos).setPass(pass);
       misEmpleados.get(pos).setNombre(nombre);
       misEmpleados.get(pos).setTipoUsuario(Tipo);
   }
   
   public int identificador(int i){
       return misEmpleados.get(i).getIdentificador();
   }
}
