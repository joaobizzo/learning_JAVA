// Classe FuncionarioGrad que extende FuncionarioMedio
public class FuncionarioGrad extends FuncionarioMedio {
    // Atributo que armazena o nome da universidade em que o funcionário se graduou
    String universidade;
    // Atributo que armazena a renda total do funcionário graduado, calculada como a renda total do Ensino Médio 
    // mais um adicional de 100% sobre essa renda.
    int rendaTotalGrad = rendaTotalEM + (rendaTotalEM * 100/100);

    // Método getter para retornar o nome da universidade em que o funcionário se graduou
    public String getUniversidade() {
        return universidade;
    }

    // Método setter para definir o nome da universidade em que o funcionário se graduou
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}