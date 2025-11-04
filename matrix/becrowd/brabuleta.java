import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class brabuleta {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int x = SC.nextInt();

        int [][] matrix = criarMatrixPronta(x, x);
        
        Set<Integer> especies = new HashSet<>();

        for (int i = 0; i < (x*2); i++) {
            especies.add(matrix[SC.nextInt()-1][SC.nextInt()-1]);
        }

        System.out.println(especies.size());
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
