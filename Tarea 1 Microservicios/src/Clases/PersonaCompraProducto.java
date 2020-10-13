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
public class PersonaCompraProducto {
    public int id_compra;
    public int id_presona;
    public int id_producto;
    public String fecha;       

    public PersonaCompraProducto(int id_compra, int id_presona, int id_producto, String fecha) {
        this.id_compra = id_compra;
        this.id_presona = id_presona;
        this.id_producto = id_producto;
        this.fecha = fecha;
    }
    
    public void editar(int id_presona, int id_producto, String fecha) {
        this.id_presona = id_presona;
        this.id_producto = id_producto;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "PersonaCompraProducto{" + "id_compra=" + id_compra + ", id_presona=" + id_presona + ", id_producto=" + id_producto + ", fecha=" + fecha + '}';
    }
    
}
