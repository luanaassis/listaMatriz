import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz1[][] = new double[3][5];
        double valLinha [] = new double[3];
        double soma = 0, maior = 0, maiorL=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe um valor: ");
                matriz1[i][j] = teclado.nextInt();
                soma += matriz1[i][j];
            }
            valLinha[i]  = soma;
        }
        for (int i = 0; i < 3; i++) {
            if (valLinha[i]>maior){
                maior = valLinha[i];
                maiorL=i+1;
            }
        }
        System.out.println("A linha que contém o maior número é "+maiorL);
    }
}
