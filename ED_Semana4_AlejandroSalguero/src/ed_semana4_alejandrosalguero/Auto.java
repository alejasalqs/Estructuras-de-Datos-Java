/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_semana4_alejandrosalguero;

/**
 *
 * @author ulacit
 */
public class Auto {

    private String marca, modelo;
    private int year, pasajeros;

    public Auto(String marca, String modelo, int year, int pasajeros) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.pasajeros = pasajeros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Auto: " + " marca= " + marca + " modelo= " + modelo + " year= " + year + " pasajeros= " + pasajeros+"\n";
    }
}
