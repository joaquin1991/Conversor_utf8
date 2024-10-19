/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pantalla;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface pares_Defecto {
    
    public static List<Par_De_Letras> conseguirPares(){
    List<Par_De_Letras> par = new ArrayList<Par_De_Letras>();
    par.add(new Par_De_Letras("Á", "A'"));
    par.add(new Par_De_Letras("á", "a'"));
    par.add(new Par_De_Letras("É", "E'"));
    par.add(new Par_De_Letras("é", "e'"));
    par.add(new Par_De_Letras("Í", "I'"));
    par.add(new Par_De_Letras("í", "i'"));
    par.add(new Par_De_Letras("Ó", "O'"));
    par.add(new Par_De_Letras("ó", "o'"));
    par.add(new Par_De_Letras("Ú", "U'"));
    par.add(new Par_De_Letras("ú", "u'"));
    par.add(new Par_De_Letras("Ñ", "N'"));
    par.add(new Par_De_Letras("ñ", "n'"));
    par.add(new Par_De_Letras("¡", "!"));
    par.add(new Par_De_Letras("¿", "?"));
    
    return par;
    }
    
    
}
