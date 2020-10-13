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
public class Producto {
    public int id_producto;
    public String nombre;
    public int precio;

    public Producto(int id_producto, String nombre, int precio) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void editar(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
