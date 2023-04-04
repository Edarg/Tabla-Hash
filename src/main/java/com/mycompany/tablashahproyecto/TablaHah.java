/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablashahproyecto;

/**
 *
 * @author Eddy Argueta
 */
public class TablaHah {
    
     static final int Tamanio = 120;
    int correlativo = 2000;
    private Sesion_Virtual[] tabla;

    //Constructor 
    public TablaHah() {
        this.tabla = new Sesion_Virtual[Tamanio];
        for (int i = 0; i < Tamanio; i++) {
            this.tabla[i] = null;
        }
    }

    //metodo de Multiplicacion 
    static final double R = 0.618034;

    static int MetodoMultiplicacion(int x) {
        double d;
        int indice;
        d = R * x - Math.floor(R * x);
        indice = (int) (Tamanio * d);

        return indice;
    }

    //metodo para solucionar colisiones y asigar indice si hay colision
    public int indice(int codigoEntrada) {
        int i = 0;
        int asignar;

        asignar = MetodoMultiplicacion(codigoEntrada);

        //verfica si hay colisiones, si hay colisión asigna nuevo indice
        while (this.tabla[asignar] != null && tabla[asignar].getEntrada() != codigoEntrada) {
            i++;
            asignar = asignar + i * i;
            asignar = asignar % Tamanio;
        }

        

        return asignar;
    }

    //metodo para insertar un 
    public void Insertar(Sesion_Virtual entrada) {
        int indice;
        
        //declaros un temporal para hacer un corretalivo automatica
        Sesion_Virtual temp;
        temp = entrada;  
        
        //mando el correlativo 2000 para que asigne un indice a sesión que se ingresa
        entrada.setEntrada(correlativo);
        
        //aumentamos el corretalivo + 1
        correlativo = correlativo + 1;
        
        //obtenemos el valor del indice
        indice = indice(entrada.getEntrada());
        
        //asignamos la sesion en el indice obtenido
        this.tabla[indice] = entrada;
    }

    //metodo para buscar una Entrada por Nombres
    public String Buscar(String Nombre) {

        //hacemos un ciclo para que recorra la lista de 120 espacios 
        for (int i = 0; i < Tamanio; i++) {
            Sesion_Virtual sv;

            //asignamos a sv lo que tiene la tabla en la posicion correspondiente
            sv = tabla[i];

            //declaramos un if para dejar pasar solo las posicione que tengan info
            if (sv != null) {
                //imprimimos los datos de la persona que buscamos si existe en la lista
                if (Nombre.equals(sv.getNombre())) {
                    return i+" ; " +sv.getEntrada()+" ; " +sv.getNombre()+" ; " +sv.getNacimiento();
                    
                   
                   
                }
            }

        }
         return null;

    }
    
    //metodo para eliminar  una entrada
    public void Eliminar(int Entrada){
        
        int posicion;
        posicion = indice(Entrada);
        if(tabla[posicion]!=null){
            this.tabla[posicion] = null;
        }
        
    }
    
    //metodo para actualiar
    public void actualizar(Sesion_Virtual sv ){
        
        int posicion;
        posicion = indice(sv.getEntrada());
        
        this.tabla[posicion].setNombre(sv.getNombre());
        this.tabla[posicion].setNacimiento(sv.getNacimiento());
        
    }
    
    

    public void listar() {
        System.out.println("\n\n Indice | No. Entrada | Nombre | Fecha de Nacimiento");

        for (int u = 0; u < Tamanio; u++) {
            if (this.tabla[u] != null) {
                System.out.println(u + " , " + tabla[u].getEntrada() + " , " + tabla[u].getNombre() + " , " + tabla[u].getNacimiento());
            }
        }
    }
    
   
    
}
