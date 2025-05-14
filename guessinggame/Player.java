/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;
import java.util.Scanner;
/**
 *
 * @author RAULBOEHME
 */
public class Player {
    private String name;
    public int plays;
    
    /*
    Criar um atributo pontuação para o player
    criar um método que incrementa a pontuação e outro que mostra o número de jogadas
    mudar a lógica do jogo para, no final, mostrar quantas jogadas o player precisou fazer até acertar
    */
    
    
    public Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.name = scanner.nextLine();
    }
    
    public String getName(){
        return name;
    }

    public int getPlays() {
        return plays;
    }

    
    
 
       
    
}
