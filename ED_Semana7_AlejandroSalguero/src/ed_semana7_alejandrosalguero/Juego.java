/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana7_alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class Juego {

    private String nombre, plataforma;
    private int year;

    public Juego(String nombre, String plataforma, int year) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Juego: Nombre: " + nombre + ", Plataforma: " + plataforma + ", Año: " + year + '\n';
    }
}
