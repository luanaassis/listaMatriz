import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de semanas: ");
        int s = teclado.nextInt();
        double matriz [][] = new double[s][7];
        double media = 0, diaAM = 0, menorP = 99999999;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Informe a produção do dia "+(j+1)+", da semana "+(i+1)+":");
                matriz[i][j]= teclado.nextDouble();
                media += matriz [i][j];
            }
        }
        media = media/(s*7);
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j]>media){
                  diaAM++;
                }
            }
        }
        System.out.println( "RELATÓRIO DE PRODUÇÃO RELATIVO À " + s + " SEMANAS");
        System.out.println("Produção média = " + media);
        System.out.println("Número de dias com produção acima da média = " + diaAM );
        System.out.println("INDICAÇÃO DOS DIAS DE MÍNIMA PRODUÇÃO: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j]<menorP){
                    menorP = (j+1);
                    System.out.println("Semana " + (i+1) + " .......... DIA "+ menorP );
                }
            }
        }
    }
}