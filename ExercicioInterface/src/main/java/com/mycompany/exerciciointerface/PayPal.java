/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciointerface;

/**
 *
 * @author RAULBOEHME
 */
public class PayPal implements Pagamento {
    private String email;

    public PayPal(String email){
        this.email = email;
    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println( " Pagamento de R$" + valor + " feito com sucesso na sua conta PayPal" );
    }

    @Override
    public String obterDetalhes() {
        System.out.println(email);
           return email;
           
    }
}
