import java.util.Scanner;
public class LuanaAssisSilva_6 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double amostras[][] = new double[6][20];
        double media[] = new double[6];
        double desvio[] = new double [6];
        for(int i = 0; i < 6; i++){
            for (int j =0; j < 20; j++){
                System.out.println("Informe as amostras da linha de produção " + (i+1)+" : ");
                amostras[i][j] = teclado.nextDouble();
                media[i] += amostras[i][j];
            }
            media[i] = media[i]/6;
            System.out.println("A média da linha de produção "+ (i+1)+" é "+ media[i]);
        }
        for(int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {
                desvio[i] = Math.pow((media[i] - amostras[i][j]), 2);
            }
            desvio[i] = desvio[i]/20;
            desvio[i] = Math.sqrt(desvio[i]);
            System.out.println("O desvio da linha de produção "+ (i+1)+" é "+ desvio[i]);
            if (desvio[i] < 385 || desvio[i] > 395) {
                System.out.println("Precisa ser revisada.");
            } else {
                System.out.println("Não precisa ser revisada.");
            }
        }

    }
}

