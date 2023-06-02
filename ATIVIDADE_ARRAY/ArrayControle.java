/*
Aluno: João Bizzo Brandt
RA: 22252028
*/



//package ATIVIDADE_ARRAY;
import java.util.Scanner;

/**
 * classe para executar o programa
 */
public class ArrayControle {
    /**
     * método principal que inicia a execução do programa
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // solicita ao usuário o tamanho máximo do array
        System.out.print("Digite o tamanho máximo do array: ");
        int maxElementos = teclado.nextInt();
        Ex1Array arr = new Ex1Array(maxElementos);

        // chama o método criaArray para preencher o array com números fornecidos pelo usuário
        arr.criaArray(teclado);

        // calcula a média dos elementos do array e exibe o resultado
        System.out.println("Média: " + arr.calculaMedia());

        teclado.close();
    }
}