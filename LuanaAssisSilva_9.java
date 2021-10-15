import java.util.Scanner;
public class LuanaAssisSilva_9 {
    public static void main(String[] args) {
        boolean simetrica = true;
        Scanner teclado = new Scanner(System.in);
        double matriz [][] = new double[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                System.out.println("Informe um número real: ");
                matriz[i][j] = teclado.nextDouble();
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }
        if(simetrica){
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}