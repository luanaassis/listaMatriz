import java.util.Scanner;
public class LuanaAssisSilva_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double recebe[][] = new double[5][3];
        String resp = "S";
        do{
            System.out.println("Informe qual a manicure p/ atendimento de 0 a 4: ");
            int manicure = teclado.nextInt();
            System.out.println("Informe o serviço 0 p unha dos pés/ 1 p unhas da mão/ 2 p podologia: ");
            int servico = teclado.nextInt();
            if (servico == 0 ){
                recebe[manicure][0] += (10*0.5);
            } else if (servico == 1 ){
                recebe[manicure][1] += (15*0.5);
            } else if (servico == 2 ){
                recebe[manicure][2] += (30*0.5);
            } else {
                System.out.println("Opção Inválida.");
            }
            System.out.println("Deseja informar sobre mais um atendimento? S / N");
            resp = teclado.nextLine();
        } while (resp=="S");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A manicure "+ i+ " recebe "+recebe[i][j]+ ", pelo trabalho " + j);
            }
        }
    }
}