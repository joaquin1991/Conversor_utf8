/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Pantalla;

import java.io.File;

/**
 *
 * @author usuario
 */
public interface reemplazador {
    public static void cambiar(String direccion){
        String nuevoNombre = recortarTitulo.buscarDireccion(direccion);
        File archivoViejo = new File(direccion);
        String nombreBorrar = direccion + "aa";
        File archivoViejoProvisorio = new File(nombreBorrar);
        archivoViejo.renameTo(archivoViejoProvisorio);
        File archivoBueno = new File(nuevoNombre);
        File archivoBuenoNuevoNombre = new File(direccion);
        archivoBueno.renameTo(archivoBuenoNuevoNombre);
        archivoViejoProvisorio.delete();
        
    }
}
