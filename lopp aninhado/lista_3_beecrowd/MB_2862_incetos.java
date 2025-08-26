/*recebe N vezes um nivel de poder se for > que 8000 ele grita Mais de 8000! e se for menor Inseto!
 * 
 */

import java.util.Scanner;

public class MB_2862_incetos {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int N = lerNumInt();
        imprimirInsetoNVezes(N);
    }

    public static void imprimirInsetoNVezes(int N) {

        for (int i = 0; i < N; i++) {
            
            int nivelDePoder = lerNumInt();

            imprimirInseto(nivelDePoder);
        }

    }

    public static void imprimirInseto(int nivelDePoder) {
        
        if (nivelDePoder>8000) {
            imprimir("Mais de 8000!");
        }else{
            imprimir("Inseto!");
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