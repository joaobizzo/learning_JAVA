// Declaração da classe Main, que contém o método main
public class Main {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis de pagamento com e sem comissão
        int pagamentoComissao = 0;
        int pagamento = 0;

        // Instanciação dos objetos das classes de funcionários
        Funcionario f1 = new Funcionario();
        FuncionarioBasico f2 = new FuncionarioBasico();
        FuncionarioMedio f3 = new FuncionarioMedio();
        FuncionarioGrad f4 = new FuncionarioGrad();

        // Impressão dos salários básicos de cada tipo de funcionário
        System.out.println("Salário base: " + f1.rendaBasica);
        System.out.println("Salário Funcionário Apenas Com Ensino Básico: " + f2.rendaTotalEB);
        System.out.println("Salário Funcionário Com Ensino Médio: " + f3.rendaTotalEM);
        System.out.println("Salário Funcionário Graduado: " + f4.rendaTotalGrad);

        // Declaração e inicialização da variável de quantidade de funcionários
        int quantidade = 10;

        // Declaração e inicialização do array de funcionários com a quantidade especificada
        Funcionario[] contrato = new Funcionario[quantidade];

        // Loop para preencher o array de funcionários e acumular o valor a ser pago a eles
        for (int i = 0; i < quantidade; i++) {
            // Se a posição atual no array for menor que 4, cria um novo FuncionarioBasico e o adiciona ao array
            if (i < 4) {
                FuncionarioBasico funcionarioBasico = new FuncionarioBasico();
                contrato[i] = funcionarioBasico;
                pagamento = pagamento + f2.rendaTotalEB; // Acumula o valor a ser pago ao funcionário
            }
            // Se a posição atual no array for menor que 8, cria um novo FuncionarioMedio e o adiciona ao array
            else if (i < 8) {
                FuncionarioMedio funcionarioMedio = new FuncionarioMedio();
                contrato[i] = funcionarioMedio;
                pagamento = pagamento + f3.rendaTotalEM; // Acumula o valor a ser pago ao funcionário
            }
            // Caso contrário, cria um novo FuncionarioGrad e o adiciona ao array
            else if (i < 10) {
                FuncionarioGrad funcionarioGrad = new FuncionarioGrad();
                contrato[i] = funcionarioGrad;
                pagamento = pagamento + f4.rendaTotalGrad; // Acumula o valor a ser pago ao funcionário
            }
        }

        // Calcula o valor total a ser pago incluindo comissões e o armazena na variável pagamentoComissao
        pagamentoComissao = pagamento + (f1.rendaGerente) + (f1.rendaSupervisor * 2) + (f1.rendaVendedor * 7);

        // Impressão do custo total por tipo de funcionário e do custo total com comissão
        System.out.println("Custo total por ensino: " + pagamento);
        System.out.println("Custo total com comissão inclusa: " + pagamentoComissao);
    }
}
