import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior=-99999;
        int matriz1[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Informe um valor: ");
                matriz1[i][j] = teclado.nextInt();
                if (matriz1[i][j]>maior){
                    maior = matriz1[i][j];
                }
            }
        }
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = matriz1[i][j] * maior;
                System.out.print("|"+matriz1[i][j]+"|");
            }
        }
    }
}
