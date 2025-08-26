/*imprimir uma sequencia onde a cada 3 vezes que o j diminui um (segundo for), aumenta um i e 4 j's(primeiro for) 
 * 
 */

import java.util.Scanner;

public class MB_1097_Sequenci3 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirSequencia();
    }

    public static void imprimirSequencia() {

        int k = 7;
        for (int i = 1; i < 10; i+=2) {
            for (int j = k; j > (k - 3); j--) {
                imprimir("I=" + i + " J=" + j);
                
            }
            k+=2;
        }

    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimir(String texto) {

        System.out.println(texto);

    }
}