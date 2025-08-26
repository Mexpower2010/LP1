/*em um lopp que so acaba quando qdt teste for 0 recebe dois numeros
 *que representam as cartas viradas de aldo e beto respecticamente
 * então imprime o nome do vencendor logo apos de teste cont
 */

import java.util.Scanner;

public class MB_2297_Bafo {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirVariosJogos();
    }

    public static void imprimirVariosJogos() {

        int valorAldo;
        int valorBeto;
        int qtdCasos;
        int cont = 1;
        String vencedor = "";
        while (true) {

            int pontuaçaoAldo = 0;
            int pontuaçaoBeto = 0;

            qtdCasos = lerNumInt();

            if (qtdCasos <= 0) {
                break;
            }

            for (int i = 0; i < qtdCasos; i++) {

                valorAldo = lerNumInt();
                valorBeto = lerNumInt();
                pontuaçaoAldo += valorAldo;
                pontuaçaoBeto += valorBeto;

            }
            vencedor = calcularUltimoVencedor(pontuaçaoAldo, pontuaçaoBeto);
            imprimirResultado(cont, vencedor);
            cont++;

        }
    }

    public static String calcularUltimoVencedor(int pontuaçaoAldo, int pontuaçaoBeto) {
        if (pontuaçaoAldo > pontuaçaoBeto) {
            return "Aldo";
        } else {
            return "Beto";
        }

    }

    public static void imprimirResultado(int cont, String vencedor) {

        imprimir("Teste " + cont);
        imprimir(vencedor);
        imprimir("");

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