package examen.pkg2_claudiacortes;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia Cortes
 */
public class Planetas implements Serializable{
    String Nombre;
    int Temperatura;
    String Anillos;
    String Tipo_superficie;
    int Distancia_Tierra;

    public Planetas() {
    }

    public Planetas(String Nombre, int Temperatura, String Anillos, String Tipo_superficie, int Distancia_Tierra) {
        this.Nombre = Nombre;
        this.Temperatura = Temperatura;
        this.Anillos = Anillos;
        this.Tipo_superficie = Tipo_superficie;
        this.Distancia_Tierra = Distancia_Tierra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public String isAnillos() {
        return Anillos;
    }

    public void setAnillos(String Anillos) {
        this.Anillos = Anillos;
    }

    public String getTipo_superficie() {
        return Tipo_superficie;
    }

    public void setTipo_superficie(String Tipo_superficie) {
        this.Tipo_superficie = Tipo_superficie;
    }

    public int getDistancia_Tierra() {
        return Distancia_Tierra;
    }

    public void setDistancia_Tierra(int Distancia_Tierra) {
        this.Distancia_Tierra = Distancia_Tierra;
    }

    @Override
    public String toString() {
        return "Planetas{" + "Nombre=" + Nombre + ", Temperatura=" + Temperatura + ", Anillos=" + Anillos + ", Tipo_superficie=" + Tipo_superficie + ", Distancia_Tierra=" + Distancia_Tierra + '}';
    }
    
}
