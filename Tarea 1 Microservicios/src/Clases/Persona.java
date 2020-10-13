/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Felipe
 */
public class Persona {
    public int id_persona;
    public String nombre;
    public String apellido;
    public String email;

    public Persona(int id_persona, String nombre, String apellido, String email) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    
    public void editar(String nombre, String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }
    
   
}
