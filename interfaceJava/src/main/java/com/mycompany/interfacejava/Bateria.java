/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacejava;

/**
 *
 * @author RAULBOEHME
 */
public class Bateria implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("BA DUNS TSS");
    }

    @Override
    public void afinar() {
        System.out.println("Eu lá sei como que afina sa bagaça???");
    }
    
}
