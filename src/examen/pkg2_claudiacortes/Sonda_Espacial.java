package examen.pkg2_claudiacortes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia Cortes
 */
public class Sonda_Espacial extends Naves{
    String Material;
    int Peso;

    public Sonda_Espacial() {
        super();
    }

    public Sonda_Espacial(String Material, int Peso) {
        this.Material = Material;
        this.Peso = Peso;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Sonda_Espacial{" + "Material=" + Material + ", Peso=" + Peso + '}';
    }
    @Override
      public int[] CalcularTiempo(){
        int [] Tiempos=new int[2];
        
        return Tiempos;
    }
}
