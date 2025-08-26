/*em um lopp que so acaba quando qdt teste for 0 recebe dois numeros ve o maior e
 *soma um na pontuação respectiva apresentando-a no final do segundo loop
 * 
 */

import java.util.Scanner;

public class MB_1397_jogoDoMaior {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirVariosJogos();
    }

    public static void imprimirVariosJogos() {

        int valor1;
        int valor2;
        int qtdCasos;
        

        while (true) {

            int pontuaçao1 = 0;
            int pontuaçao2 = 0;
            
            qtdCasos = lerNumInt();

            if (qtdCasos <= 0) {
                break;
            }

            for (int i = 0; i < qtdCasos; i++) {

                valor1 = lerNumInt();
                valor2 = lerNumInt();

                if (v1ehMaior(valor1, valor2)) {
                    pontuaçao1++;
                }
                if (v2ehMaior(valor1, valor2)) {
                    pontuaçao2++;
                }
            }
            imprimir(pontuaçao1 + " " + pontuaçao2);
        }
    }

    public static boolean v1ehMaior(int valor1, int valor2) {

        if (valor1 > valor2) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean v2ehMaior(int valor1, int valor2) {

        if (valor1 < valor2) {
            return true;
        } else {
            return false;
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