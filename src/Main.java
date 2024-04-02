//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int number = scanner.nextInt();
                while (number<-9 || number > 9 ){
                    number = scanner.nextInt();
                }
                matriz[i][j] = number;
            }
            scanner.nextLine();
        }
        int maxSum = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                //primera fila
                int maxSumTemp = matriz[i][j];
                maxSumTemp = maxSumTemp + matriz[i][j+1];
                maxSumTemp = maxSumTemp + matriz[i][j+2];
                //segunda fila
                maxSumTemp = maxSumTemp + matriz[i+1][j+1];
                //tercera fila
                maxSumTemp = maxSumTemp + matriz[i+2][j];
                maxSumTemp = maxSumTemp + matriz[i+2][j+1];
                maxSumTemp = maxSumTemp + matriz[i+2][j+2];
                //comparacion
                if ( i==0 && j==0){
                    maxSum = maxSumTemp;
                } else {
                    if(maxSum < maxSumTemp){
                        maxSum = maxSumTemp;
                    }
                }
            }
        }
        System.out.println(maxSum);
        scanner.close();
    }
}