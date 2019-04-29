/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana5_alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class Pelicula {

    private String titulo, director;
    private int minutos, year;

    public Pelicula(String titulo, String director, int minutos, int year) {
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Película:\n " + "Título: " + titulo + ", Director: " + director + ", Minutos: " + minutos + ", Año: " + year + '\n';
    }
}
