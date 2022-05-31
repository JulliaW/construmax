package br.com.construmax.modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente();
        cliente.setNome("Maria das Dores");
        cliente.setCpf("547.823.255-8");
        cliente.setTelefone("(16)99587-5421");
        
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.set(Calendar.YEAR, 2003);
        dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
        dataNascimento.set(Calendar.DAY_OF_MONTH, 29);

        cliente.setDataNascimento(dataNascimento);
        
        Endereco endCliente = new Endereco();
        
        endCliente.setBairro("Parque dos Servidores");
        endCliente.setCep("15043-250");
        endCliente.setCidade("Ribeirão Preto");
        endCliente.setLogradoro("Rua da subida");
        endCliente.setNumero("354");
        endCliente.setUf("SP");
        
        cliente.setEndereco(endCliente);
        
        Fornecedor fornecedor = new Fornecedor();
        
        Endereco endFornecedor = new Endereco();
        
        fornecedor.setEndereco(endFornecedor);
        fornecedor.setNome("Ofere Cimentos");
        fornecedor.setCnpj("45.896.735/0001-04");
        fornecedor.setEmail("oferecimentos@gmail.com");
        fornecedor.setRepresentacao("Itaú, Votoram, CNS");
        
        endFornecedor.setBairro("Jardim dos Patos");
        endFornecedor.setCep("17073-360");
        endFornecedor.setCidade("Ribeirão Preto");
        endFornecedor.setLogradoro("Rua da Descida");
        endFornecedor.setNumero("784");
        endFornecedor.setUf("SP");
        
        Produto produto = new Produto();
        produto.setCodigoDeBarras("07300012");
        produto.setDescricao("Cimento");
        produto.setFornecedor(fornecedor);
        produto.setMarca("Itaú");
        produto.setQuantidade(100);
        produto.setPreco(52.00);
        
        Produto produto2 = new Produto();
        produto2.setCodigoDeBarras("08500014");
        produto2.setDescricao("Argamassa");
        produto2.setFornecedor(fornecedor);
        produto2.setMarca("Axton");
        produto2.setQuantidade(80);
        produto2.setPreco(30.00);
        
        Produto produto3 = new Produto();
        produto3.setCodigoDeBarras("04500098");
        produto3.setDescricao("Gesso");
        produto3.setFornecedor(fornecedor);
        produto3.setMarca("Fortaleza");
        produto3.setQuantidade(30);
        produto3.setPreco(20.00);
         
        Calendar dataVenda = Calendar.getInstance();
        dataNascimento.set(Calendar.YEAR, 2022);
        dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
        dataNascimento.set(Calendar.DAY_OF_MONTH, 28);
        
        Venda venda = new Venda();
        venda.setDataVenda(dataVenda);
        venda.setCliente(cliente);
        venda.setNumeroNota(457814);
        venda.setNumeroVenda(15478);
        
        ItemVenda item1= new ItemVenda();
        
        item1.setProduto(produto);
        item1.setQuantidade(5);
        
        ItemVenda item2= new ItemVenda();
        
        item2.setProduto(produto2);
        item2.setQuantidade(3);
        
        ItemVenda item3= new ItemVenda();
        
        item3.setProduto(produto3);
        item3.setQuantidade(7);
        
        ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
        
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        
        venda.setItens(itens);
        
        venda.imprimir();
        
    }
}
