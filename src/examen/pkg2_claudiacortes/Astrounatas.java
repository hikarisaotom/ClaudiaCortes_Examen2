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
public class Astrounatas implements Serializable{
    String Nombre;
    String Nacionalidad;
    double Sueldo;
    String Experiencia;
    String Sexo;
    int Peso;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public Astrounatas() {
    }

    public Astrounatas(String Nombre, String Nacionalidad, double Sueldo, String Experiencia, String Sexo, int Peso) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Sueldo = Sueldo;
        this.Experiencia = Experiencia;
        this.Sexo = Sexo;
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Astrounatas{" + "Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", Sueldo=" + Sueldo + ", Experiencia=" + Experiencia + ", Sexo=" + Sexo + ", Peso=" + Peso + '}';
    }
    
}
