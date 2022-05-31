package br.com.construmax.modelo;

import java.util.Calendar;

public class Cliente {
    
    private String nome;
    private Calendar dataNascimento;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    public void setNome(String value){
        this.nome = value;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setDataNascimento(Calendar value){
        this.dataNascimento = value;
    }
    public Calendar getDataNascimento(){
        return this.dataNascimento;
    }
    
    public void setCpf(String value){
        this.cpf = value;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setTelefone(String value){
        this.telefone = value;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setEmail(String value){
        this.email = value;
    }
    public String getEmail(){
        return this.email;
    }
    
    public void setEndereco(Endereco value){
        this.endereco = value;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
    
}
