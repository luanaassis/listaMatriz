import java.util.Scanner;
public class LuanaAssisSilva_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de cidades: ");
        int c = teclado.nextInt();
        int custo = 0;
        int cidades[] = new int[c];
        int matrizA [][] = new int[c][c];
        System.out.println("Informe a ordem das cidades na rota: ");
        for (int i =0; i<c;i++){
            cidades[i] = teclado.nextInt();
        }
        for (int i =0; i<c;i++){
            for (int j =0; j<c;j++){
                System.out.println("Informe o custo de transporte da cidade "+ i + " para " + j + ":");
                matrizA[i][j] = teclado.nextInt();
            }
        }
        for (int i =0; i<(c);i++){
            custo += matrizA [cidades[i]][cidades[i+1]];
        }
        System.out.println("O custo da rota informada é " + custo );
    }
}
