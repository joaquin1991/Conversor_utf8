/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Pantalla;

/**
 *
 * @author usuario
 */
public interface Enviador_Mensajes {
    
    public static void saludar(){
        Enviador_Mensajes.imprimir("Hola, mundo");
    }
    
    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}
