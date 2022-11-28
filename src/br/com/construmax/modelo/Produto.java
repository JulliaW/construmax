package br.com.construmax.modelo;

import java.util.Calendar;

public class Produto {
    
    private int id;
    private String descricao;
    private String preco;
    private String codigoDeBarras;
    private String quantidade;
    private String marca;

    //private Fornecedor fornecedor;

    public Produto(int id, String descricao, String preco, String codigoDeBarras, String quantidade, 
            String marca) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
        this.quantidade = quantidade;
        this.marca = marca;
    }
    
    /*public Produto(String id, String descricao, String preco, String codigoDeBarras, String quantidade, 
            String marca, Fornecedor fornecedor) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
        this.quantidade = quantidade;
        this.marca = marca;
        this.fornecedor = fornecedor;
    }*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

//    public Fornecedor getFornecedor() {
//        return fornecedor;
//    }
//
//    public void setFornecedor(Fornecedor fornecedor) {
//        this.fornecedor = fornecedor;
//    }
    
}
