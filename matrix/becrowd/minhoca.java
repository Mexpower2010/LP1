import java.util.Scanner;

public class minhoca {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int x = SC.nextInt();
        int k = SC.nextInt();

        int [][] matrix = criarMatrixPronta(x, k);
        int[] vetorDeSomas = calcularVSomas(matrix);

        System.out.println(imprimirMaxValor(vetorDeSomas));
        
    }

    public static int imprimirMaxValor(int[] vetorDeSomas) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < vetorDeSomas.length; i++) {
            if(vetorDeSomas[i]>max){
                max = vetorDeSomas[i];
            }
        }
        return max;
        
    }

    public static int[] calcularVSomas(int[][] matrix) {
        int tamanhoV = matrix.length + matrix[0].length;
        int [] vetorDeSomas = new int [tamanhoV];
        for (int i = 0; i < matrix.length; i++) {
            int somaL = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                somaL += matrix[i][j];
            }
            vetorDeSomas[i] = somaL;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int somaC = 0;
            for (int j = 0; j < matrix.length; j++) {
                somaC += matrix[j][i];
            }
            vetorDeSomas[matrix.length + i] = somaC;
        }
        return vetorDeSomas;
    }
    public static int sum(int l, int r, int[] soma) {
        return (int)soma[r]-soma[l-1];
    }
    public static int[] lerXInts(int x) {

        int[] matrix = new int[x];

        for (int i = 0; i < x; i++) {

            matrix[i] = SC.nextInt();

        }

        return matrix;
    }


    public static int[][] criarMatrixPronta(int x, int y) {

        int[][] matrix = new int[x][y];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=SC.nextInt();
            }
        }

        return matrix;
    }

    
}
