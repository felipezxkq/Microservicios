/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1.microservicios;

import Clases.Persona;
import Clases.RegistroTemporal;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author Felipe
 */
public class Tarea1Microservicios {

    /**
     * @param args the command line arguments
     */
    public RegistroTemporal registro;
    public Scanner scanIn;
    public int opcion;
    public String input;
    
    public static void main(String[] args) {
        Tarea1Microservicios tarea = new Tarea1Microservicios();
        tarea.start();
    }
    
    public void start()
    {
        registro = new RegistroTemporal();
        scanIn = new Scanner(System.in);
        menuElegirClase();
    }
    
    public void menuElegirClase(){
        System.out.println("Opciones de clases para editar: ");
        System.out.println("    1) Personas");
        System.out.println("    2) Productos");
        System.out.println("    3) Persona compra producto");   
        System.out.println("    4) Salir"); 
        opcion = scanIn.nextInt();
        switch(opcion){
            case 1:
                menuPersona();
                break;
            case 2:
                menuProducto();
                break;
            case 3:
                menuPersonaCompraProducto();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.exit(0);                
        }
    }
    
    public void menuPersona(){
        System.out.println("Menú personas: ");
        System.out.println("    1) Leer");
        System.out.println("    2) Registrar");
        System.out.println("    3) Editar");
        System.out.println("    4) Eliminar");
        System.out.println("    5) Volver atrás"); 
        opcion = scanIn.nextInt();
        switch(opcion){
            case 1:
                registro.leer_personas();
                break;
            case 2:
                registro.registrar_persona(scanIn);
                break;
            case 3:
                registro.editar_persona(scanIn);
                break;
            case 4:
                registro.eliminar_persona(scanIn);
                break;
            case 5:
                menuElegirClase();
            default:
                break;
        }
        menuRealizarMasOperaciones();
    }
    
    public void menuProducto(){
        System.out.println("Menú productos: ");
        System.out.println("    1) Leer");
        System.out.println("    2) Registrar");
        System.out.println("    3) Editar");
        System.out.println("    4) Eliminar"); 
        System.out.println("    5) Volver atrás"); 
        opcion = scanIn.nextInt();
        switch(opcion){
            case 1:
                registro.leer_productos();
                break;
            case 2:
                registro.registrar_producto(scanIn);
                break;
            case 3:
                registro.editar_producto(scanIn);
                break;
            case 4:
                registro.eliminar_producto(scanIn);
                break;
            case 5:
                menuElegirClase();
            default:
                break;
        }
        menuRealizarMasOperaciones();
    }
    
    public void menuPersonaCompraProducto(){
        System.out.println("Menú PersonaCompraProductos: ");
        System.out.println("    1) Leer");
        System.out.println("    2) Registrar");
        System.out.println("    3) Editar");
        System.out.println("    4) Eliminar");  
        System.out.println("    5) Volver atrás"); 
        opcion = scanIn.nextInt();
        switch(opcion){
            case 1:
                registro.leer_compras();
                break;
            case 2:
                registro.registrar_compra(scanIn);
                break;
            case 3:
                //registro.editar_producto(scanIn);
                break;
            case 4:
                registro.eliminar_producto(scanIn);
                break;
            case 5:
                menuElegirClase();
            default:
                break;
        }
        menuRealizarMasOperaciones();
    }
    
    public void menuRealizarMasOperaciones(){
        System.out.println("Realizar más operaciones?");
        System.out.println("    1) Si");
        System.out.println("    2) No");
        opcion = scanIn.nextInt();
        if(opcion==1){
            menuElegirClase();
        }
    }
    
}
