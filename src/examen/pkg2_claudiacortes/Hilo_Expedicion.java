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
public class Hilo_Expedicion extends Thread{
    Naves Nave;
    Planetas Destino;
    boolean vive;
    boolean avanza;

    public Hilo_Expedicion() {
    }

    public Hilo_Expedicion(Naves Nave, Planetas Destino) {
        this.Nave = Nave;
        this.Destino = Destino;
    }

    public Naves getNave() {
        return Nave;
    }

    public void setNave(Naves Nave) {
        this.Nave = Nave;
    }

    public Planetas getDestino() {
        return Destino;
    }

    public void setDestino(Planetas Destino) {
        this.Destino = Destino;
    }
    
    @Override
   public void run(){
       while(vive){
           if (avanza) {
               
           }
       }
   }
}
