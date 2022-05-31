package br.com.construmax.modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class Venda {
    
    private Calendar dataVenda;
    private int numeroVenda;
    private int numeroNota;
    
    private Cliente cliente;
    
    private ArrayList<ItemVenda> itens;
    private double valorTotal;
    
    private Funcionario funcionario;

    public Calendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Calendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    /*public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }*/

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public void imprimir(){
        
        System.out.println("Venda: " + this.numeroVenda);
        System.out.print("Cliente: ");
        System.out.println(this.getCliente().getNome());
        System.out.print("CPF: ");
        System.out.println(this.getCliente().getDocumento());
        System.out.println("===========PEDIDO===========");
        
        for (ItemVenda item : this.itens){
            System.out.print("Código de barras: ");
            System.out.println(item.getProduto().getCodigoDeBarras());
            System.out.print("Descrição: ");
            System.out.println(item.getProduto().getDescricao());
            System.out.print("Marca: ");
            System.out.println(item.getProduto().getMarca());
            System.out.print("Quantidade: ");
            System.out.println(item.getQuantidade());
            System.out.print("Valor unitário: ");
            System.out.println(item.getProduto().getPreco());
            System.out.print("Valor total: ");
            System.out.println(item.getValorTotal());            
            System.out.println("============================");  
        }
        
        
    }
    
}
