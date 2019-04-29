/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana._alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class Producto {

    private String nombre, marca;
    private int precio;

    public Producto(String nombre, String marca, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nProducto: " + "Nombre: " + nombre + ", Marca: " + marca + ", Precio: " + precio;
    }

}
