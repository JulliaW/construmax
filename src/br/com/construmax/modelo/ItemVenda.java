package br.com.construmax.modelo;

public class ItemVenda {
    
    private Produto produto;
    private double quantidade;
    private double valorTotal;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /*public double getValorTotal() {
        return this.produto.getPreco() * quantidade;
    }*/

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
