/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classeabstrata;

/**
 *
 * @author RAULBOEHME
 */
public abstract class Mobilia {
    protected String cor;
    protected String material;

    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }
    
    //Método abstrato (método que não tem implementação da lógica)
    public abstract void montar();
    
    //Método Concreto ( que  possui lógica implementada)
    public void desmontar(){
        System.out.println("A mobilia foi desmontada.");
    };
}
