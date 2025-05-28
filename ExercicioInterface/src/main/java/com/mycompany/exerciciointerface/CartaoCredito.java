/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciointerface;

/**
 *
 * @author RAULBOEHME
 */
public class CartaoCredito implements Pagamento{
    
    private String numeroCartao;
    private int codSeguranca;
    
    public CartaoCredito(String numeroCartao, int CodSeguranca){
        this.codSeguranca = codSeguranca;
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " feito com Sucesso!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public String obterDetalhes() {
        return numeroCartao.substring(numeroCartao.length()- 4);
    }
}
