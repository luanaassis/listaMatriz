import java.util.Scanner;
public class LuanaAssisSilva_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minMax=0;
         double matriz[][] = new double[4][7];
         double maior [] = new double[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Informe um valor real: ");
                matriz[i][j] = teclado.nextDouble();
                if(j == 0){
                    maior[i] = matriz[i][j];
                }else {
                    if (maior[i] < matriz[i][j]) {
                        maior[i] = matriz[i][j];
                    }
                }
            }
        }
        for(int j =0; j<4;j++){
            if(j == 0){
                minMax = j;
            }else{
                if(minMax < j){
                    minMax = j;
                }
            }
        }
        System.out.println(minMax);
    }
}
