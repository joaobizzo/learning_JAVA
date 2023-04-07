// Classe FuncionarioMedio que extende FuncionarioBasico
public class FuncionarioMedio extends FuncionarioBasico {
    // Atributo que armazena a renda total do funcionário com Ensino Médio, calculada como a renda total do Ensino Básico
    // mais um adicional de 50% sobre essa renda.
    int rendaTotalEM = rendaTotalEB + (rendaTotalEB * 50/100);
    // Método getter para retornar o nome da escola do funcionário
    public String getEscola() {
        return escola;
    }
    // Método setter para definir o nome da escola do funcionário
    public void setEscola(String escola) {
        this.escola = escola;
    }
    }

