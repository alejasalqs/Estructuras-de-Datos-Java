/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandrostaller2;

/**
 *
 * @author Alejandro Salguero
 */
public class Libro {
    private String titulo, autor, editorial;
    private int paginas, año;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Libro(String titulo, String autor, String editorial, int paginas, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
        this.año = año;
    }

    @Override
    public String toString() {
        return "\nLibro: " + "Titulo: " + titulo + ", Autor: " + autor + ", Editorial: " + editorial + ", Paginas= " + paginas + ", Año= " + año;
    }
}
