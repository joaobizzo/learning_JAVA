public class Funcionario {

    // Atributos
    String nome, codigoFunc, cargoComissao;
    int rendaBasica=1000;
    
    // Comissões adicionais de diferentes cargos
    int rendaGerente=1500;
    int rendaSupervisor=600;
    int rendaVendedor=250;
    
    // Métodos para acessar e modificar os atributos
    public String getNome() {
    return nome;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }
    
    public String getCodigo() {
    return codigoFunc;
    }
    
    public void setCodigo(String codigoFunc) {
    this.codigoFunc = codigoFunc;
    }
    
    public String getComissao() {
    return cargoComissao;
    }
    
    public void setComissao(String cargoComissao) {
    this.cargoComissao = cargoComissao;
    }
    }
    
    
    
    
    
    