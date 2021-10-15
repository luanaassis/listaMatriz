import java.util.Scanner;
public class LuanaAssisSilva_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a =0;
        System.out.println("Informe a dimensão da matriz: ");
        int d = teclado.nextInt();
        int matriz[][] = new int[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.println("Informe um valor ");
                matriz[i][j] = teclado.nextInt();
                if (matriz[i][j]==1) {
                    a++;
                }
                if (matriz[i][j] != 0 && matriz[i][j] !=1 ) {
                    System.out.println("Não é uma a permutação.");
                }
            }
        }
        if (a==d){
            System.out.println("É permutação.");
        } else{
            System.out.println("Não é uma a permutação.");
        }
    }
}
