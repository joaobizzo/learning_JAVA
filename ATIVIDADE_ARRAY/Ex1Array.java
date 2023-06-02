/*
Aluno: João Bizzo Brandt
RA: 22252028
*/




//package ATIVIDADE_ARRAY;
import java.util.Scanner;

/**
 * classe Array é um array de ints com tamanho máximo definido
 * permite adicionar elementos ao array e calcular a média dos elementos
 */
public class Ex1Array {
    private int[] array; // Array de inteiros
    private int maxElementos; // Número máximo de elementos permitidos
    private int numeroAtual; // Número atual de elementos no array

    /**
     * construtor da classe Array
     * @param maxElementos tamanho máximo do array
     */
    public Ex1Array(int maxElementos) {
        this.array = new int[maxElementos];
        this.maxElementos = maxElementos;
        this.numeroAtual = 0;
    }

    /**
     * adiciona um elemento ao final do array
     * @param n o elemento a ser adicionado
     * @return true se o elemento for adicionado com sucesso, false se der falha
     */
    public boolean adicionar(int n) {  //pensei em colocar try catch aqui, mas não consegui fazer corretamente. 
        if (numeroAtual < maxElementos) {  //então fiz dar erro quando o array encher
            array[numeroAtual] = n;
            numeroAtual++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * calcula a média aritmética dos elementos armazenados
     * @return média  dos elementos, retorna 0 se o array estiver vazio
     */
    public int calculaMedia() {
        int soma = 0;

        if (numeroAtual == 0) {
            return 0;
        }

        for (int i = 0; i < numeroAtual; i++) {
            soma += array[i];
        }

        return soma / numeroAtual;
    }


    /*             !!!! criei essa função extra que não foi pedida, porque vi a necessidade, ja que se repetia na questao 2 !!!*/

    /**
     * cria o array, adicionando elementos ao final
     * @param teclado Scanner para ler os elementos do array
     */
    public void criaArray(Scanner teclado) {
        for (int i = 0; i < maxElementos; i++) {
            System.out.print("Digite um número para adicionar ao array: ");
            int numero = teclado.nextInt();
            if (adicionar(numero)) {
                System.out.println("Adicionado com sucesso");
            } else {
                System.out.println("Erro ao adicionar. O array está cheio.");
                break;
            }
        }
    }

    /**
     * método main para testar a funcionalidade da classe Array
     * solicita ao usuário o tamanho máximo do array e os elementos a serem adicionados
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho máximo do array: ");
        int maxElementos = teclado.nextInt();
        Ex1Array arr = new Ex1Array(maxElementos);

        arr.criaArray(teclado);

        System.out.println("Média: " + arr.calculaMedia());

        teclado.close();
    }
}


// ps: em python eu faria em 8 linhas kkkkkk