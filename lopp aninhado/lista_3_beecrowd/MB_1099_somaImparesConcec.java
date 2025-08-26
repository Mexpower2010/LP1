/*ler qtd de rodadas
 *dai em cada rodada:(primieiro for)
 *
 *            se recebe um xis e um iplison
 *            verifica qual é maior e qual é menor
 *            dai somar tds os impares do intervado xis iplison(segundo for)
 *            imprimr tds eles
 * 
 */

import java.util.Scanner;

public class MB_1099_somaImparesConcec {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdTestes = lerNumInt();

        imprimirVariasSomas(qtdTestes);
    }

    public static void imprimirVariasSomas(int qtdTestes) {

        int valor1;
        int valor2;
        int x;
        int y;
        

        for (int i = 0; i < qtdTestes; i++) {

            int somatoria = 0;

            valor1 = lerNumInt();
            valor2 = lerNumInt();

            x = Math.max(valor1, valor2);
            y = Math.min(valor1, valor2) + 1;

            for (int cont = y; cont < x; cont++) {

                if (cont % 2 != 0) {
                    somatoria = somatoria + cont;
                }

            }

            imprimir("" + somatoria);
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