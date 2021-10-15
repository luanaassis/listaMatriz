import java.util.Scanner;
public class LuanaAssisSilva_5 {
    public static void main(String[] args) {
        double media[]= new double[10];
        double matriz [][] = new double[10][5];
        String nome[] = new String[10];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome do aluno: ");
            nome[i] = teclado.nextLine();
            for (int j = 0; j < 5; j++) {
                System.out.println(" Informe a nota da prova "+(j+1)+" do aluno "+nome[i]);
                matriz[i][j] = teclado.nextDouble();
                media[i] += matriz[i][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            media[i] = media[i] / 5;
            if (media[i] >= 7) {
                System.out.println(" O aluno " + nome[i] + " teve como média das notas " + media[i] + ", e portanto a situação dele é APROVADO.");
            } else if (media[i] < 4) {
                System.out.println(" O aluno " + nome[i] + " teve como média das notas " + media[i] + ", e portanto a situação dele é REPROVADO.");
            } else if(media[i] > 4 && media[i] < 7){
                System.out.println(" O aluno " + nome[i] + " teve como média das notas " + media[i] + ", e portanto a situação dele é EXAME ESPECIAL.");
            }
        }
    }
}
