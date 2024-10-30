/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pantalla;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public interface Archivero {
    public static String archivo = "Configuraciones.txt";
    public static String archivoBinario = "Configuraciones.bin";
    
    public static List<Par_De_Letras> cargar(){
    List<Par_De_Letras> pares = new ArrayList<Par_De_Letras>();
    
     //File config = new File(archivo);
         File config = new File(archivoBinario);
     
     if (config.exists()){
    //     Scanner lector;
        /*try {
            lector = new Scanner(config);
            while (lector.hasNextLine()) {
      
                String renglon = lector.nextLine();
                Integer espacio = renglon.indexOf(" ");
                String a = renglon.substring(0, espacio);
                String b = renglon.substring(espacio + 1);
                Par_De_Letras par = new Par_De_Letras(a, b);
                pares.add(par);
         
            }
                lector.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivero.class.getName()).log(Level.SEVERE, null, ex);
        }
          */
        try (ObjectInputStream abriendo = new ObjectInputStream(new FileInputStream(archivoBinario))){
        pares = (List<Par_De_Letras>) abriendo.readObject();
        abriendo.close();
        }
        catch (Exception e){
        System.err.println("Error");
        }

     }
       
    return pares;
    }
    
 /*   public static String escribir (Par_De_Letras par){
        return (par.reemplazable + " " + par.reemplazada + "\n");
    }
   */ 
    public static void guardar(List<Par_De_Letras> pares){
      File esBorrable = new File(archivoBinario);
        if (esBorrable.exists()){
            esBorrable.delete();
            
        }
   /*     try {
            FileWriter config = new FileWriter(archivo);
           pares.forEach(par->{
                try {
                    config.write(Archivero.escribir(par));
                } catch (IOException ex) {
                    Logger.getLogger(Archivero.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
         
       config.close();
        } catch (IOException ex) {
            Logger.getLogger(Archivero.class.getName()).log(Level.SEVERE, null, ex);
        }
     */   
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivoBinario))){
            salida.writeObject(pares);
            salida.close();
            
        } catch (Exception ex) {
            Logger.getLogger(Archivero.class.getName()).log(Level.SEVERE, null, ex);
        }
         
 }
    
}
