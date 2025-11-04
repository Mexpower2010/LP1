import java.util.Scanner;

public class areaInf {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        String O = lerChar();

        double[][] matriz = lerMatriz(12, 12);

        double S = calcularSoma(matriz);

        if (O == "S") {
            imprimirResult(S);

        }else{
            double M = calcularMedia(S);
            imprimirResult(M);
        }
    }

    public static void imprimirResult(double result) {
        System.out.printf("%.1f\n", result);
    }

    public static double calcularMedia(double soma) {
        double media = soma / 30.0;  //30 e a qtd de numeros na area superior da matriz
        return media;
    }

    public static double calcularSoma(double[][]matriz) {
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i > j && i + j > 11) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static double[][] lerMatriz(int p1, int p2) {
        double[][] matriz = new double[p1][p2];
        for (int j = 0; j < matriz.length; j++) {
            for (int j2 = 0; j2 < matriz[0].length; j2++) {
                matriz[j][j2] = LER.nextDouble();
            }
        }
        return matriz;
    }

    public static String lerChar() {
        String valor;
        valor = LER.next();
        return valor;
    }
}






