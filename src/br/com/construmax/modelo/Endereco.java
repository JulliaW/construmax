package br.com.construmax.modelo;

public class Endereco {
    
    private String logradouro;
    private String cidade;
    private String numero;   
    private String uf;
    private String bairro;
    private String Complemento;
    private String cep;
    
    public Endereco(String logradouro, String cidade, String numero, String uf, 
           String bairro, String cep)
   {
       this.logradouro = logradouro;
       this.cidade = cidade;
       this.numero = numero;
       this.uf = uf;
       this.bairro = bairro;
       this.cep = cep;
   }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradoro) {
        this.logradouro = logradoro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
