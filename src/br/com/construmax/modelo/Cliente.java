package br.com.construmax.modelo;

import java.util.Calendar;

public class Cliente extends Pessoa{
    
    private String cartaoFidelidade;
    
    public Cliente(String id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco, String cartaoFidelidade)
    {
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.cartaoFidelidade = cartaoFidelidade;   
    }

    public String getCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(String cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }

}
