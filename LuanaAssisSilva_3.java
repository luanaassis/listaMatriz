import java.util.Scanner;
public class LuanaAssisSilva_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matrizA[][] = new int[3][4];
        System.out.println("Informe a qnt de linhas da matriz b: ");
        int l = teclado.nextInt();
        System.out.println("Informe a qnt de colunas da matriz b: ");
        int c = teclado.nextInt();
        int matrizB[][] = new int[l][c];
        if (l != 4){
            System.out.println("Não é possível realizar a multiplicação das matrizes. ");
        }
        else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println("Informe valores para matriz A: ");
                    matrizA[i][j] = teclado.nextInt();
                }
            }
            for (int i = 0; i < l; i++){
                for (int j = 0; j < c; j++) {
                    System.out.println("Informe valores para matriz B: ");
                    matrizB[i][j] = teclado.nextInt();
                }
            }
            int matrizC [][] = new int[3][c];
            for (int i = 0; l < matrizA.length; i++){
                for (int j = 0; j < matrizB[0].length; j++){
                    for (int m = 0; m < matrizA[0].length; m++){
                        matrizC[l][j] = matrizC[l][j] + matrizA[l][m] * matrizB[m][j];
                    }
                }
            }
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("|"+matrizC[i][j]+"|");
                }
            }
        }
    }
}