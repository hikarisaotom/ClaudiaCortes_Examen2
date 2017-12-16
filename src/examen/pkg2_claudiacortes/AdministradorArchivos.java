/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_claudiacortes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Claudia Cortes
 */
public class AdministradorArchivos {
    ArrayList <Object> Todo = new ArrayList();
     ArrayList <Naves> N = new ArrayList();
      ArrayList <Astrounatas> A = new ArrayList();
       ArrayList <Planetas> P = new ArrayList();
    File File;

    public ArrayList<Object> getTodo() {
        return Todo;
    }

    public void setTodo(ArrayList<Object> Todo) {
        this.Todo = Todo;
    }

    public ArrayList<Naves> getN() {
        return N;
    }

    public void setN(ArrayList<Naves> N) {
        this.N = N;
    }

    public ArrayList<Astrounatas> getA() {
        return A;
    }

    public void setA(ArrayList<Astrounatas> A) {
        this.A = A;
    }

    public ArrayList<Planetas> getP() {
        return P;
    }

    public void setP(ArrayList<Planetas> P) {
        this.P = P;
    }

    public File getFile() {
        return File;
    }

    public void setFile(File File) {
        this.File = File;
    }

    public AdministradorArchivos(String Path) {
        File = new File(Path);
    }

    public void EscribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(File);
            bw = new ObjectOutputStream(fw);
            for (Object Clase : Todo) {
                bw.writeObject(Clase);
            }
            bw.flush();
        } catch (Exception ex) {
        }
        JOptionPane.showMessageDialog(null,"Archivo Guardado");
        bw.close();

        fw.close();
    }
     public void CargarArchivo(){
        try{
            Todo=new ArrayList();
          Object temp;
            if (File.exists()) {
                FileInputStream entrada=new FileInputStream(File);
                ObjectInputStream objeto =new ObjectInputStream(entrada);
                try{
                    while((temp=(Object)objeto.readObject())!=null){
                        Todo.add(temp);
                    }
                }catch(EOFException e){
                    //SIEMPRE VA A TIRAR ERROR
                    //Encontro el final del archivo.
                }
                 objeto.close();//cierre del buffer
                 entrada.close();//cierre del canal , se abren inversamete a como se abren 
                JOptionPane.showMessageDialog(null,"SE HAN CARGADO LOS ELEMENTOS");
                        
            }//fin del if
            
        }catch(Exception e){
            e.printStackTrace();
        }
        for (Object object : Todo) {
            if (object instanceof Naves) {
                Naves X = ((Naves) object);
                N.add(X);
            } else if (object instanceof Astrounatas) {
                Astrounatas X = ((Astrounatas) object);
                A.add(X);
            } else if (object instanceof Planetas) {
                Planetas X = ((Planetas) object);
                P.add(X);
            }
        }
    }
}
