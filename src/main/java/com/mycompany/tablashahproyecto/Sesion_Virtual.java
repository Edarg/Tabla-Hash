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
public class Sesion_Virtual {
    
     public int Entrada;
    
    public String Nombre, Nacimiento;
    
    public Sesion_Virtual(){
    }

    public Sesion_Virtual(String Nombre, String Nacimiento) {
        this.Entrada = 0;
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
    }
    
     public Sesion_Virtual(int Entrada,String Nombre, String Nacimiento) {
        this.Entrada = Entrada;
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    
    public int getEntrada() {
        return Entrada;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
    
}
