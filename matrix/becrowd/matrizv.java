
import java.util.Scanner;

public class matrizv {

    final static Scanner SC = new Scanner(System.in);

    public static int[][] criarMatrix(int N) {
    int[][] matrix = new int[N][N];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            matrix[i][j] = 0;
            
            if (i == j) {
                matrix[i][j] = 2;
            }else if (i + j == N - 1) {
                matrix[i][j] = 3;
            }
            if (i >= N/3 && i < N - N/3 && j >= N/3 && j < N - N/3) {
                matrix[i][j] = 1;
            }
            
            if (i == N/2 && j == N/2) {
                matrix[i][j] = 4;
            }
        }
    }
    
    return matrix;
}
    public static void imprimirMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        while (SC.hasNextInt()) {
            int N = SC.nextInt();
            int[][] matrix = criarMatrix(N);
            imprimirMatrix(matrix);
            System.out.println(); 
        }
    }
}