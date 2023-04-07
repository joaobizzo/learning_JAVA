
public class Empresa {
    // declaração do atributo contrato como um array de Funcionario
    private Funcionario[] contrato;
    // construtor que recebe como parâmetro a quantidade de funcionários do contrato
    public Empresa(int quantidade) {
        // inicializa o array contrato com a quantidade de funcionários especificada
        this.contrato = new Funcionario[quantidade];
    }

    // construtor padrão que inicializa o array contrato com 5 funcionários
    public Empresa() {
        this.contrato = new Funcionario[5];
    }

    // método que retorna o array contrato
    public Funcionario[] getContrato() {
        return contrato;
    }

    // método que define o array contrato
    public void setContrato(Funcionario[] contrato) {
        this.contrato = contrato;
    }
}
