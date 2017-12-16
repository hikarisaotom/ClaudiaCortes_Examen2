package examen.pkg2_claudiacortes;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

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
    boolean vive=true;
    boolean avanza=true;
    JProgressBar Ida;
    JProgressBar Regreso;

    public Hilo_Expedicion(Naves Nave, Planetas Destino, JProgressBar Ida, JProgressBar Regreso) {
        this.Nave = Nave;
        this.Destino = Destino;
        this.Ida = Ida;
        this.Regreso = Regreso;
    }

    public Hilo_Expedicion() {
    }

    public Hilo_Expedicion(JProgressBar Ida, JProgressBar Regreso) {
        this.Ida = Ida;
        this.Regreso = Regreso;
    }

    public boolean isAvanza() {
        return avanza;
    }

    public void setAvanza(boolean avanza) {
        this.avanza = avanza;
    }

    public JProgressBar getRegreso() {
        return Regreso;
    }

    public void setRegreso(JProgressBar Regreso) {
        this.Regreso = Regreso;
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
    public void run() {
        JOptionPane.showMessageDialog(null,"Empezando Expedicion");
         double Contador_Tiempo = 0.0;
        double Tiempo[] = Nave.CalcularTiempo();
        double Tiempo_Ida = Tiempo[0] * 1000;
        double Tiempo_Regreso = Tiempo[1] * 1000;
        System.out.println("TIEMPO DE IDA"+Tiempo_Ida);
        System.out.println("TIEMPO DE REGRESO"+Tiempo_Regreso);
        boolean bandera=true;
           boolean bandera_1=true;
        while (avanza== true) {
            int cont = 0;
            int segundo = 0;
            while (vive== true) {
                if (cont < Tiempo_Ida) {
                    Ida.setValue(cont + 1);
                    cont++;
                } else {
                    if (bandera) {
                         JOptionPane.showMessageDialog(null, "La nave llego al destino");
                         bandera=false;
                    }
                    Regreso.setValue(segundo +20);
                    segundo= segundo +20;
                    System.out.println("REGRESO "+Regreso.getValue());
                    if(segundo >= Tiempo_Regreso){
                        avanza = false;
                        JOptionPane.showMessageDialog(null, "La nave llego a la Tierra");
                    }
                }


                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    // Logger.getLogger(HiloLLuvia.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }// fin del vivi

        }// fin de avanzar
    }
//    @Override
//    public void run() {
//        boolean Bandera = true;
//         boolean Bandera_1 = true;
//        double Contador_Tiempo = 0.0;
//        double Tiempo[] = Nave.CalcularTiempo();
//        double Tiempo_Ida = Tiempo[0] * 1000;
//        double Tiempo_Regreso = Tiempo[1] * 1000;
//        Ida.setMaximum((int) Tiempo_Ida);
//        Regreso.setMaximum((int) Tiempo_Regreso);
//        System.out.println("TIEMPO DE IDA: "+Tiempo_Ida);
//        System.out.println("TIEMPO REGRESO: "+Tiempo_Regreso);
//        System.out.println("BANDERA"+Bandera);
//        System.out.println("BANDERA 1"+Bandera_1);
//        
//        while (vive) {
//            if (avanza) {
//                System.out.println("TIEMPO ACTUAL"+Tiempo_Regreso);
//                if (Bandera) {
//                    System.out.println("BANDERA" + Bandera);
//                    System.out.println("BANDERA 1" + Bandera_1);
//                    int Valor = (int) Contador_Tiempo;
//                    if (Contador_Tiempo >= Tiempo_Ida) {
//                        Contador_Tiempo = 0.0;
//                        Bandera_1 = true;
//                        Bandera = false;
//                        JOptionPane.showMessageDialog(null, "Llego al planeta");
//                    } else {
//                        Ida.setValue(Valor);
//                        System.out.println("VALOR DE LA PROGRESS"+Ida.getValue());
//                    }
//                }
//                
//                
//                if (Bandera_1) {
//                    int Valor = (int) Contador_Tiempo;
//                    if (Contador_Tiempo >= Tiempo_Regreso) {
//                        Contador_Tiempo = 0.0;
//                        Bandera_1 = false;
//                        Bandera = false;
//                        JOptionPane.showMessageDialog(null, "Llego a la Tierra");
//                    } else {
//                        Regreso.setValue(Valor);
//                         System.out.println("VALOR DE LA PROGRESS"+ Regreso.getValue());
//                    }
//                }
//                
//                if (!Bandera_1&&!Bandera) {
//                    JOptionPane.showMessageDialog(null,"Viaje Terminamos");
//                    vive=false;
//                    avanza=false;
//                }
//                try {
//                    Thread.sleep(50);
//                } catch (InterruptedException ex) {
//
//                }
//                Contador_Tiempo += 20;
//            }
//        }
//    }
    
    
}
