package br.com.construmax.modelo;

import java.util.Calendar;

public class Funcionario extends Pessoa{
    
    private String numeroCartaoPonto;
    
    public Funcionario(String id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco, String numeroCartaoPonto) {
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.numeroCartaoPonto = numeroCartaoPonto;
    }

    public String getNumeroCartaoPonto() {
        return numeroCartaoPonto;
    }

    public void setNumeroCartaoPonto(String numeroCartaoPonto) {
        this.numeroCartaoPonto = numeroCartaoPonto;
    }   
}
