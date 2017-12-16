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
public class Naves {
    
  int Num_Serie;
        Planetas Destino;
        int Velocidad;
    
    public Naves() {
      
        
    }

    public Naves(int Num_Serie, Planetas Destino, int Velocidad) {
        this.Num_Serie = Num_Serie;
        this.Destino = Destino;
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return "Naves{" + "Num_Serie=" + Num_Serie + ", Destino=" + Destino + ", Velocidad=" + Velocidad + '}';
    }

    public int getNum_Serie() {
        return Num_Serie;
    }

    public void setNum_Serie(int Num_Serie) {
        this.Num_Serie = Num_Serie;
    }

    public Planetas getDestino() {
        return Destino;
    }

    public void setDestino(Planetas Destino) {
        this.Destino = Destino;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    public double[] CalcularTiempo(){
        double [] Tiempos=new double[2];
        
        return Tiempos;
    }
   


  
    
}
