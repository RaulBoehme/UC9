package com.mycompany.primeiroprojeto;

import java.time.Clock;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAULBOEHME
 */
public class Tipos {
    
    String meuNome = "Raul";
    char minhaInicial = 'R';
    int minhaIdade = 18;
    double minhaAultura = 1.86;
    boolean verdadeiroOuFalso = true;
    
    public void verificarIdade(int idade){
        if (idade >= 18){
            System.out.println("Voce é maior de idade, pois tem " + idade + " anos.");
        }else {
        System.out.println("Voce é menor de idade, pois tem apenas " + idade + " anos.");

        }
    }
    
    public int cauculaSoma(int num1, int num2){
    return num1 + num2;
    }
    
    public void nacionalidade(String pais){
        
        switch (pais) {
            case "Brasil":
                System.out.println("Voce é brasileiro(a)");
            break;
            case "Argentina":
            System.out.println("Voce é argentino(a)");
            break;
            default:
                System.out.println("Nacionalidade nao encontrada.");
            break;
        }
        
    }
}
