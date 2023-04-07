// Classe FuncionarioBasico que extende Funcionario
public class FuncionarioBasico extends Funcionario {
    // Atributo que armazena o nome da escola em que o funcionário estudou
    String escola;
    // Atributo que armazena a renda total do funcionário com Ensino Básico, calculada como a renda básica mais um adicional de 10% sobre essa renda.
    int rendaTotalEB = rendaBasica + (rendaBasica * 10/100);

    // Método getter para retornar o nome da escola em que o funcionário estudou
    public String getEscola() {
        return escola;
    }

    // Método setter para definir o nome da escola em que o funcionário estudou
    public void setEscola(String escola) {
        this.escola = escola;
    }
}
