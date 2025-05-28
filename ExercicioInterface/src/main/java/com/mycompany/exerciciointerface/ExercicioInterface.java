/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciointerface;

/**
 *
 * @author RAULBOEHME
 */
public class ExercicioInterface {

    public static void main(String[] args) {

        PayPal payál1 = new PayPal("ShaolinMatadorDePorco123@yahoo.com");
        
        payál1.processarPagamento(58347274);
        payál1.obterDetalhes();

        CartaoCredito CreditCard = new CartaoCredito("092735",423 );
        CreditCard.processarPagamento(77898);
        
        System.out.println(CreditCard.obterDetalhes());
    }
}
