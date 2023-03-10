import java.util.Scanner;

public class raizquadrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura");
        int altura = input.nextInt();

        System.out.println("Digite a largura");
        int largura = input.nextInt();
        
        int area;

        area = largura * altura;

        if(altura > 0 && largura > 0){
            System.out.println("Area = " + area);
        }
        
        if(largura < 0 || altura < 0){
            System.out.println("Numero negativo");
        }
        
        else if(largura == 0 || altura == 0){
            System.out.println("Numero igual a zero");
        }
    }
}
