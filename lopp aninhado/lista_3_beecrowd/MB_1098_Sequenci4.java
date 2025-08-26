/*imprimir uma sequencia onde a cada 3 vezes que o j(começa em 1) aumenta um mais i 
 * (segundo for), aumenta 0,2 i e reseta o j em 1
 * 
 */

import java.util.Scanner;

public class MB_1098_Sequenci4 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirSequencia();
    }

    public static void imprimirSequencia() {

        for (double i = 0; i <= 2; i = i + 0.2) {

            for (int j = 1; j <= 3; j += 1) {

                imprimirFormatado((i), "I=");
                imprimirFormatado((j + i), " J=");
                System.out.println();
                
            }

        }

    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimirFormatado(double i, String tex) {

        if (Math.abs(i - Math.round(i)) < 0.001) {
            System.out.printf("%s%d", tex, Math.round(i));
        } else {
            System.out.printf("%s%.1f", tex, i);
        }

    }
}