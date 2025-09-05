package estudos.OBI;

import java.util.Scanner;

public class toupeira {

    final static Scanner SC = new Scanner(System.in);

    public static int[] lerXInts(int x) {

        int[] matrix = new int[x];

        for (int i = 0; i < x; i++) {

            matrix[i] = lerInt();

        }

        return matrix;
    }

    public static void imprimirMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length- 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static int[][] criarMatrixPronta(int x, int y) {

        int[][] matrix = new int[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < y; i++) {
            int s1 = lerInt();
            int s2 = lerInt();

            matrix[s2 - 1][s1 - 1] = 1;
            matrix[s1 - 1][s2 - 1] = 1;
        }

        return matrix;
    }

    public static int lerInt() {

        int valor;

        valor = SC.nextInt();

        return valor;

    }

    public static void main(String[] args) {

        int qtdArestaSalao = lerInt();
        int qtdVerticesTuneis = lerInt();

        int[][] mapa = criarMatrixPronta(qtdArestaSalao, qtdVerticesTuneis);
        //imprimirMatrix(mapa);

        int qtdpasseios = lerInt(); 
        int qtdviagensCorretas = 0;

        for (int i = 0; i < qtdpasseios; i++) {
            boolean passeioPosivel = true;
            int tamanhoV = lerInt();
            int[] viagems = lerXInts(tamanhoV);
            for (int j = 0; j < viagems.length - 1; j++) {
                if (mapa[viagems[j]-1][viagems[j + 1]-1] == 0) {
                    passeioPosivel = false;
                    break;
                }
               
            }
            if (passeioPosivel==true) {
                qtdviagensCorretas++;
            }
        }

        System.out.println(qtdviagensCorretas);

    }
}
