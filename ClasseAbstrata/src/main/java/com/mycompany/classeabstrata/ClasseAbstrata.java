/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeabstrata;

/**
 *
 * @author RAULBOEHME
 */
public class ClasseAbstrata {

    public static void main(String[] args) {
        Sofa sofa = new Sofa("Marrom", "Couro");
        Cama cama = new Cama("Magenta", "Madeira");
        
        sofa.montar();
        sofa.desmontar();
        cama.montar();
        cama.desmontar();
    }
}
