/*em um loop que so acaba quando x ou y é < = a 0 (while true)
 *
 *            se recebe um xis e um iplison
 *            verifica se eles n sao menor ou inguais a 0
 *            verifica qual é maior e qual é menor
 *            imprimir tds os numeros do intervalo e somalos(for)
 *            imprimr a soma
 * 
 */

import java.util.Scanner;

public class MB_1101_IntervaloSoma {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirVariasSomas();
    }

    public static void imprimirVariasSomas() {

        int valor1;
        int valor2;
        int x;
        int y;
        
        while (true) {
    
            int somatoria = 0;

            valor1 = lerNumInt();
            valor2 = lerNumInt();

            if (valor1 <= 0 || valor2 <= 0) {
                break;
            }

            x = Math.max(valor1, valor2);
            y = Math.min(valor1, valor2);

            for (int cont = y; cont <= x; cont++) {

                System.out.print(cont+" ");

                somatoria = somatoria + cont;

            }

                imprimir("Sum=" + somatoria);
            
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