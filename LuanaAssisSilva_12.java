import javax.swing.*;
import java.util.Scanner;
public class LuanaAssisSilva_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz [][] = new double[5][3];
        double qntT =0, maiorQT2 = 0, armazem2=0, menorEstoque =999999999, menorEst =0, maiorCusto = 0 , maiorcust = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe a qtd de estoque do produto " +(j+1)+" no armazém " +(i+1) +" : ");
                matriz [i][j] = teclado.nextDouble();
                qntT+= matriz [i][j];
            }
            if(qntT < menorEstoque){
                menorEstoque = qntT;
                menorEst = i;
            }
            System.out.println("A quantidade total do armazém "+(i+1) +" : " + qntT);
            qntT = 0;
            if (matriz [i][1]> maiorQT2){
                maiorQT2 = matriz [i][1];
                armazem2 = i;
            }
        }
        System.out.println("O armazém que tem menos estoque é o " + menorEst);
        System.out.println("O armazém que mais tem o produto dois é o "+ armazem2);
        for (int j = 0; j < 3; j++) {
            System.out.println("Informe o custo de estocagem do produto " +(j+1)+"+");
            matriz[4][j] = teclado.nextDouble();
            if(matriz[4][j] > maiorCusto){
                maiorCusto =matriz[4][j];
                maiorcust = j;
            }
        }
        System.out.println("O armazém que tem maior custo de estoque é o " + maiorcust);
    }
}