/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Pantalla;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author usuario
 */
public class Conversor_uft8 {

    
    public static Boolean ejecutar(String direccion, transformarTodos transformador) throws FileNotFoundException, IOException {

       File viejo = new File(direccion);
       if (viejo.exists()){
            String rutaNueva = recortarTitulo.buscarDireccion(direccion);
            FileWriter nuevoArchivo = new FileWriter (rutaNueva);
            BufferedReader lector = new BufferedReader(new InputStreamReader(new FileInputStream(viejo), "ISO-8859-1" ));
            String renglon;
            while ((renglon = lector.readLine()) != null)
                {
                    renglon = transformador.usar(renglon);
                    nuevoArchivo.write(renglon + "\n");
                }
       
            lector.close();
            nuevoArchivo.close();
      
            return true;
       } else
       {
           return false;
       }
 
      
    }
       
}
