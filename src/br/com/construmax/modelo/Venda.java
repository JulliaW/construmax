package br.com.construmax.modelo;

public class Venda {
    
    private int idVenda;
    
    private Cliente cliente;
    
    private Funcionario funcionario;
    
    public Venda(int idVenda, Cliente cliente, Funcionario funcionario)
    {
       this.idVenda = idVenda;
       this.cliente = cliente;
       this.funcionario = funcionario;
    }

 public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    /*public void imprimir(){
        
        System.out.println("Venda: " + this.idVenda);
        System.out.print("Cliente: ");
        System.out.println(this.getCliente().getNome());
        System.out.print("CPF: ");
        System.out.println(this.getCliente().getDocumento());
        System.out.println("===========PEDIDO===========");
        
        for (ItemVenda item : this.itensVenda){
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
           // System.out.println(item.getValorTotal());            
            System.out.println("============================");  
        }
        
        
    }*/
    
}
