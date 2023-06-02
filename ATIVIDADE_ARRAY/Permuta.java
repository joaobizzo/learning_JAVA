/*
Aluno: João Bizzo Brandt
RA: 22252028
*/




//package ATIVIDADE_ARRAY;

import java.util.Scanner;

/**
 * classe Permuta verifica se dois números são permutações um do outro
 */
public class Permuta {
    /**
     * verifica se dois números são permutações um do outro, retornando false como break nos casos que não são permutações
     * e ao final, true se passar em todos os "testes"
     *
     * @param num1 o primeiro número
     * @param num2 o segundo número
     * @return true se os números são permutações um do outro, false caso contrário
     */
    public static boolean saoPermutacoes(int num1, int num2) {
        // verifica se os números são positivos
        if (num1 <= 0 || num2 <= 0) {
            return false;
        }

        // converte os números de int para strings
        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);

        // verifica se as strings possuem o mesmo numero de algarismos
        if (strNum1.length() != strNum2.length()) {
            return false;
        }

        // calcula a média entre os algarismos do array num1
        int[] mediaNum1 = new int[10];
        for (int i = 0; i < strNum1.length(); i++) {
            mediaNum1[strNum1.charAt(i) - '0']++;
        }
        
        // valcula a média entre os algarismos do array num2
        int[] mediaNum2 = new int[10];
        for (int i = 0; i < strNum2.length(); i++) {
            mediaNum2[strNum2.charAt(i) - '0']++;
        }

        // verifica se as médias são iguais
        for (int i = 0; i < 10; i++) {
            if (mediaNum1[i] != mediaNum2[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * método principal para executar o programa
     *
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Verifica se dois números são permutações um do outro");
        System.out.println("[PROIBIDO NUMERO NEGATIVO/ MAXIMO 10 ALGARISMOS]");
        System.out.println("----------------------------------------------------");

        // solicita dois números
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        // verifica se são permutações
        if (saoPermutacoes(num1, num2)) {
            System.out.println("Os números SÃO permutações um do outro");
        } else {
            System.out.println("Os números NÃO SÃO permutações um do outro");
        }

        teclado.close();
    }
}
