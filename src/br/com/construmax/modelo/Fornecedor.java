package br.com.construmax.modelo;

import java.util.Calendar;

public class Fornecedor extends Pessoa {

    private String representacao;
   
    public Fornecedor(int id, String nome, Calendar dataNascimento, String documento, 
            String telefone, String email, Endereco endereco, String representacao)
    {
        super(id, nome, dataNascimento, documento, telefone, email, endereco);
        this.representacao = representacao;
    }

    public String getRepresentacao() {
        return representacao;
    }

    public void setRepresentacao(String representacao) {
        this.representacao = representacao;
    }    
}
