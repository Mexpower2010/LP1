/*imprimir uma sequencia onde o J diminui de 5 em 5 e o i aumenta de 3 em 3 ate J == 0
 * 
 */

import java.util.Scanner;

public class MB_1095_Sequenci1 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirSequencia();
    }

    public static void imprimirSequencia() {

        int i = 1;
        for (int j = 60; j >= 0; j-=5) {
            
            imprimir("I="+i+" J="+ j);
            i+=3;
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