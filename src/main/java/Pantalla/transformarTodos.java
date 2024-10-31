/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Pantalla;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public final class transformarTodos {
    public List<Par_De_Letras> pares;
    public String fraseGuardada;
    public static String flecha = "-->";
        
    public void guardarCambios(DefaultTableModel modelo){
        this.pares = new ArrayList<Par_De_Letras>();
        int cantidad = modelo.getRowCount();
        for (int i = 0; i < cantidad; i++ ){
            String reemplazar = String.valueOf(modelo.getValueAt(i, 0));
            String por = String.valueOf(modelo.getValueAt(i, 1));
            Par_De_Letras par = new Par_De_Letras(reemplazar, por);
            this.pares.add(par);
            }  
        Archivero.guardar(this.pares);
            
 
    }
    
    public void cargarArchivo(){
        this.pares = Archivero.cargar();
        if (this.pares.isEmpty()){
           this.pares = pares_Defecto.conseguirPares();
           Archivero.guardar(this.pares);
           
        }
       
    }
    
    public transformarTodos() throws IOException {
        this.cargarArchivo();    
   
        
    }
    
    public void guardarFrase(String a, String b){
    this.fraseGuardada = this.fraseGuardada.replace(a, b);
    }
    
    public String usar(String frase){
        this.fraseGuardada = frase;
        pares.forEach(par->this.guardarFrase(par.reemplazable,par.reemplazada));
        return this.fraseGuardada;
        
    }
    
    public String alterar(String renglon, Integer segundos){
    Integer posicion = renglon.indexOf(flecha);
    if (posicion < 0)
    {return renglon; }
    else
    {
       try{ 
        String horaDesde = this.sumarTiempo(renglon.substring(0, 8), segundos);
        String horaHasta = this.sumarTiempo(renglon.substring(17, 25), segundos);
        String renglonNuevo = horaDesde + renglon.substring(8, 17);
        renglonNuevo = renglonNuevo + horaHasta + renglon.substring(25);
        return renglonNuevo;} catch(Exception e){Enviador_Mensajes.imprimir(renglon); return renglon;}
    }
        
    }
    
    public String sumarTiempo(String hora, Integer segundos){
    String tiempo;
    LocalTime tiempoOriginal =  (LocalTime.parse(hora)).plusSeconds(segundos);
    tiempo = tiempoOriginal.toString();
    return tiempo;

    }

}
