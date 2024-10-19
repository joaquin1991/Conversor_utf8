/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Pantalla;

/**
 *
 * @author usuario
 */
public interface recortarTitulo {
    public static String buscarDireccion(String rutaRecibida){
    String rutaConseguida = null;
    Integer barra = rutaRecibida.lastIndexOf(".");
    rutaConseguida = rutaRecibida.substring(0, (barra));
    rutaConseguida = rutaConseguida + "2.srt";
    return rutaConseguida;
    }
}
