/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */

/* esta clase hará de 'base de datos', guardará las listas de personas, 
productos y compras sobre las cuales se podrá operar */
public class RegistroTemporal {
    ArrayList <Persona> personas;
    ArrayList <Producto> productos;
    ArrayList <PersonaCompraProducto> compras;
    
    public RegistroTemporal(){
        this.personas = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.compras = new ArrayList<>();
    }
    
    // CRUD Persona
    public void registrar_persona(Scanner scanIn){
        try{
            System.out.println("Ingrese id de la persona: ");
            int id = scanIn.nextInt();
            if(existe_persona(id)){
                System.out.println("Persona con id "+id+" ya se encuentra registrada");
                return;
            }
            System.out.println("Ingrese nombre de la persona: ");
            String nombre = scanIn.nextLine();
            nombre = scanIn.nextLine();
            System.out.println("Ingrese apellido de la persona");
            String apellido = scanIn.nextLine();
            System.out.println("Ingrese email de la persona");
            String correo = scanIn.nextLine();   
            Persona p = new Persona(id, nombre, apellido, correo);
            this.personas.add(p);
            System.out.println("Persona agregada exitosamente, ahora la lista se ve así:");
            leer_personas();
        }catch(Exception e){
            System.out.println("Error al agregar personas, ingrese los datos correctamente");
        }
        
    }
    
    public void eliminar_persona(Scanner scanIn){
        try{      
            System.out.println("Estos son las personas en registro actualmente: ");
            leer_personas();
            System.out.println("Ingrese id de persona a eliminar del registro");
            int id = scanIn.nextInt();
            if(!existe_persona(id)){
                System.out.println("No existe ninguna persona registrada con la id "+id);
                return;
            }
            for(Persona persona : personas){
                if(persona.id_persona == id){
                    personas.remove(persona);
                    System.out.println("Registro de persona con id: "+id+" eliminado exitosamente");
                }
            }
            }catch(Exception e){
                System.out.println("Error al eliminar registro de persona, ingrese los datos correctamente");
            }
    }
    
    public void editar_persona(Scanner scanIn){
        System.out.println("Estas son las personas ingresadas actualmente: ");
        leer_personas();
        System.out.println("Ingrese la id de la persona a editar: ");
        int id_persona = scanIn.nextInt();
        boolean opcionCorrecta = false;
        for(Persona p : personas){
            if(p.id_persona == id_persona){
                opcionCorrecta = true;
                System.out.println("Ingrese nuevo nombre de la persona: ");
                String nombre = scanIn.nextLine();
                nombre = scanIn.nextLine();
                System.out.println("Ingrese nuevo apellido de la persona");
                String apellido = scanIn.nextLine();
                System.out.println("Ingrese nuevo email de la persona");
                String correo = scanIn.nextLine();
                p.editar(nombre, apellido, correo);
                System.out.println("Persona editada exitosamente");
            }
        }
        if(!opcionCorrecta){
            System.out.println("El id que ha ingresado no corresponde a ninguna persona en el sistema");
        }
        
    }
    
    public void leer_personas(){
        for(Persona persona : personas){
            System.out.println(persona.toString());
        }
    }    
    
    // CRUD Producto
    public void registrar_producto(Scanner scanIn){
        try{
            System.out.println("Ingrese id del producto: ");
            int id = scanIn.nextInt();
            if(existe_producto(id)){
                System.out.println("Producto con id "+id+" ya se encuentra registrado");
                return;
            }
            System.out.println("Ingrese nombre del producto: ");
            String nombre = scanIn.nextLine();
            nombre = scanIn.nextLine();
            System.out.println("Ingrese precio del producto");
            int precio = scanIn.nextInt();
            Producto p = new Producto(id, nombre, precio);
            this.productos.add(p);
            System.out.println("Producto agregado exitosamente, ahora la lista se ve así:");
            leer_productos();
        }catch(Exception e){
            System.out.println("Error al agregar producto, ingrese los datos correctamente");
        }
    }
    
    public void eliminar_producto(Scanner scanIn){
        try{     
            System.out.println("Estos son los productos en registro actualmente: ");
            leer_productos();
            System.out.println("Ingrese id del producto a eliminar del registro");
            int id = scanIn.nextInt();
            if(!existe_producto(id)){
                System.out.println("No existe ningun producto registrado con la id "+id);
                return;
            }
            for(Producto producto : productos){
                if(producto.id_producto == id){
                    productos.remove(producto);
                    System.out.println("Registro de producto con id: "+id+" eliminado exitosamente");
                }
            }
            }catch(Exception e){
                System.out.println("Error al eliminar registro de producto, ingrese los datos correctamente");
            }
    }
    
    public void editar_producto(Scanner scanIn){
        System.out.println("Estos son los productos en registro actualmente: ");
        leer_productos();
        System.out.println("Ingrese la id del producto a editar: ");
        int id_producto = scanIn.nextInt();
        boolean opcionCorrecta = false;
        for(Producto p : productos){
            if(p.id_producto == id_producto){
                opcionCorrecta = true;
                System.out.println("Ingrese nuevo nombre del producto: ");
                String nombre = scanIn.nextLine();
                nombre = scanIn.nextLine();
                System.out.println("Ingrese precio del producto");
                int precio = scanIn.nextInt();
                p.editar(nombre, precio);
                System.out.println("Producto editado exitosamente");
            }
        }
        if(!opcionCorrecta){
            System.out.println("El id que ha ingresado no corresponde a ningun producto en el sistema");
        }
    }    
    
    public void leer_productos(){
        for(Producto producto : productos){
            System.out.println(producto.toString());
        }
    }
    
    // CRUD PersonaCompraProducto
    public void registrar_compra(Scanner scanIn){
        try{
            System.out.println("PRODUCTOS: ");
            leer_productos();
            System.out.println();
            System.out.println("PERSONAS: ");
            leer_personas();
            
            System.out.println("Ingrese id de persona: ");
            int id_persona = scanIn.nextInt();
            while(!existe_producto(id_persona)){
                System.out.println("No existe producto, ingrése la id nuevamente");
                id_persona = scanIn.nextInt();
            }
            
            System.out.println("Ingrese id del producto: ");
            int id_producto = scanIn.nextInt();
            while(!existe_producto(id_producto)){
                System.out.println("No existe producto, ingrése la id nuevamente");
                id_producto = scanIn.nextInt();
            }
            System.out.println("Ingrese id de la compra: ");
            int id_compra = scanIn.nextInt();
            System.out.println("Ingrese fecha de compra: ");
            String fecha = scanIn.nextLine();
            fecha = scanIn.nextLine();
            PersonaCompraProducto p = new PersonaCompraProducto(id_compra, id_persona, id_producto, fecha);
            this.compras.add(p);
            System.out.println("Compra agregada exitosamente, ahora la lista se ve así:");
            leer_productos();
        }catch(Exception e){
            System.out.println("Error al agregar compra, ingrese los datos correctamente");
        }
    }
    
    public void editar_compra(Scanner scanIn){
        System.out.println("Estas son las compras: ");
        leer_compras();
        System.out.println("Ingrese la id de la compra a editar: ");
        int id_compra = scanIn.nextInt();
        boolean opcionCorrecta = false;
        for(PersonaCompraProducto c : compras){
            if(c.id_compra == id_compra){
                opcionCorrecta = true;
                System.out.println("PRODUCTOS: ");
                leer_productos();
                System.out.println("Ingrese nueva id producto: ");
                int id_producto = scanIn.nextInt();
                while(!existe_producto(id_producto)){
                    System.out.println("No existe producto, ingrése la id nuevamente");
                    id_producto = scanIn.nextInt();
                }
                
                System.out.println("PERSONAS: ");
                leer_personas();
                System.out.println("Ingrese nueva id persona: ");
                int id_persona = scanIn.nextInt();
                while(!existe_persona(id_persona)){
                    System.out.println("No existe persona, ingrése la id nuevamente");
                    id_persona = scanIn.nextInt();
                }

                System.out.println("Ingrese precio del producto");
                String fecha = scanIn.nextLine();
                fecha = scanIn.nextLine();
                c.editar(id_persona, id_producto, fecha);
                System.out.println("Compra editada exitosamente");
            }
        }
        if(!opcionCorrecta){
            System.out.println("El id que ha ingresado no corresponde a ninguna compra en el sistema");
        }        
    }
    
    public void eliminar_compra(Scanner scanIn){
        try{     
            System.out.println("Estos son las compras en registro actualmente: ");
            leer_compras();
            System.out.println("Ingrese id de la compra a eliminar del registro");
            int id = scanIn.nextInt();
            if(!existe_compra(id)){
                System.out.println("No existe ninguna compra registrada con la id "+id);
                return;
            }
            for(PersonaCompraProducto compra : compras){
                if(compra.id_compra == id){
                    compras.remove(compra);
                    System.out.println("Registro de compra con id: "+id+" eliminado exitosamente");
                }
            }
            }catch(Exception e){
                System.out.println("Error al eliminar registro de compra, ingrese los datos correctamente");
            }
    }
    
    public void leer_compras(){
        for(PersonaCompraProducto compra : compras){
            System.out.println(compra.toString());
        }
    }
    
    
    // auxiliares
    public boolean existe_persona(int id){
        for(Persona p : personas){
            if(p.id_persona==id){
                return true;
            }
        }
        return false;
    }
    public boolean existe_producto(int id){
        for(Producto p : productos){
            if(p.id_producto==id){
                return true;
            }
        }
        return false;
    }
    public boolean existe_compra(int id){
        for(PersonaCompraProducto c : compras){
            if(c.id_compra==id){
                return true;
            }
        }
        return false;
    }
    
}
