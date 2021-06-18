package sistema_entrega;

public class Cliente {
    private String cpf;
    private String nome;
    public Endereço endereco;
    private Regiao regiao[];
    
    public Cliente(String cpf, String nome, Endereço endereco){
        this.cpf = cpf;
        this.nome = nome;
        this.endereco.cep = endereco.cep;
        this.endereco.numero = endereco.numero;
        this.endereco.bairro = endereco.bairro;
        this.endereco.cidade = endereco.cidade;
    }
    
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereço getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.nome = endereco;
    }
    
  
    public void identificar(){
        
    }
}

