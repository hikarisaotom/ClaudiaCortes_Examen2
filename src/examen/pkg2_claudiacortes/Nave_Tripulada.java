package examen.pkg2_claudiacortes;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Claudia Cortes
 */
public class Nave_Tripulada extends Naves{
    String Lugar_Despegue;
    ArrayList<Astrounatas>Tripulantes=new ArrayList();

    public Nave_Tripulada() {
        super();
    }

    public String getLugar_Despegue() {
        return Lugar_Despegue;
    }

    public void setLugar_Despegue(String Lugar_Despegue) {
        this.Lugar_Despegue = Lugar_Despegue;
    }

    public ArrayList<Astrounatas> getTripulantes() {
        return Tripulantes;
    }

    public void setTripulantes(ArrayList<Astrounatas> Tripulantes) {
        this.Tripulantes = Tripulantes;
    }

    public Nave_Tripulada(String Lugar_Despegue) {
        this.Lugar_Despegue = Lugar_Despegue;
    }
public void Agregar(Astrounatas A){
    Tripulantes.add(A);
}
    @Override
    public String toString() {
        return "Nave_Tripulada{" + "Lugar_Despegue=" + Lugar_Despegue + ", Tripulantes=" + Tripulantes + '}';
    }
    
    @Override
      public int[] CalcularTiempo(){
        int [] Tiempos=new int[2];
        
        return Tiempos;
    }
    
    
}
