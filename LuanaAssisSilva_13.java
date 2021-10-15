import javax.swing.*;
import java.util.Scanner;
public class LuanaAssisSilva_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pessoa [][] = new String[1][2];
        for (int i = 0; i < 1; i++) {
            System.out.println("Informe o nome da pessoa : ");
            pessoa[i][0] = teclado.nextLine();
            System.out.println("Informe o apelido da pessoa: ");
            pessoa[i][1] = teclado.nextLine();
        }
        System.out.println("O nome da pessoa tem " + pessoa[0][0].length()+ " caracteres. ");
        if (pessoa[0][0].equals(pessoa[0][1])) {
            System.out.println("O nome e o apelido são iguais. ");
        }
        System.out.println("O nome e o apelido concatenado é "+pessoa[0][0].concat(pessoa[0][1]));
    }
}