/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 *
 * @author AlejandroSalguero
 */
public class Clientes {
    
    /*Creacion de objeto de cliente*/
    
    
    private String nombre, apellido;
    private int telefono, cantidadPaquetes;

    public Clientes(String nombre, String apellido, int telefono, int cantidadPaquetes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cantidadPaquetes = cantidadPaquetes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantidadPaquetes() {
        return cantidadPaquetes;
    }

    public void setCantidadPaquetes(int cantidadPaquetes) {
        this.cantidadPaquetes = cantidadPaquetes;
    }

    @Override
    public String toString() {
        return "\n{Clientes Nombre: " + nombre + ", Apellido: " + apellido + ", Telefono: " + telefono + ", Cantidad de Paquetes: " + cantidadPaquetes + '}';
    }
    
    
    
}
