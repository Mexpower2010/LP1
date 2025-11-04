package matrix.becrowd;

import java.util.Scanner;

public class matrizv {

    final static Scanner SC = new Scanner(System.in);

    public static int[][] criarMatrix(int N) {
        int[][] matrix = new int[N][N];
        int inicio = N / 3;
        int fim = N - inicio - 1;
        int centro = N / 2;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 0;
            }
        }
        
       
        for (int i = inicio; i <= fim; i++) {
            for (int j = inicio; j <= fim; j++) {
                matrix[i][j] = 1;
            }
        }
        
        for (int i = 0; i < N; i++) {
            matrix[i][i] = 2; 
            matrix[i][N - 1 - i] = 3; 
        }
        
        matrix[centro][centro] = 4;
        
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