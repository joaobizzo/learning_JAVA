public class matrizjava {
    public static void main(String[] args) {
        int n = 6;
        int i, j;

        char tabela[][] = new char[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                try{
                    if(i%j == 0 || j%i == 0){
                        System.out.print("*");
                    }
                 }
                  catch(java.lang.ArithmeticException e){
                    System.out.print("");
                }
            System.out.print("_");
            }
            System.out.println();
        }
    }
}
