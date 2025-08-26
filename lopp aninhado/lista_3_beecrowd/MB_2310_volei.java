/* por N vezes eu recolho 3 açoes e a 3 qtd de Açoes corretas somo elas e pelas N vezes e calculos seus respectivos
 * 3 porcents de acerto apresentando com 2 casas decimais e quebra de linha
 */

import java.util.Scanner;

public class MB_2310_volei {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 0;
        N = lerInt();
        imprimirPercentualAcertos(N);
    }

    public static void imprimirPercentualAcertos(int N) {

        int[] acoes;

        int[] acoesCertas;

        int[] totalAcoes = { 0, 0, 0 };

        int[] totalAcoesCertas = { 0, 0, 0 };

        double[] percentAcoes = new double[3];

        for (int i = 0; i < N; i++) {
            LER.next();

            acoes = lerXInts(3);

            acoesCertas = lerXInts(3);

            totalAcoes = somarXcoisas(totalAcoes, 3, acoes);

            totalAcoesCertas = somarXcoisas(totalAcoesCertas, 3, acoesCertas);
        }

        percentAcoes = calcularXpercents(percentAcoes, 3, totalAcoes, totalAcoesCertas);
        imprimirPercentuaisFinais(percentAcoes);
    }

    public static double calcularPercent(int contarAcimaMedia, int qtdNotas) {
        double porcent = ((double) contarAcimaMedia / qtdNotas) * 100;
        return porcent;
    }

    public static void imprimirPercentuaisFinais(double[] percentAcoes) {

        System.out.printf("Pontos de Saque: %.2f %s\n", percentAcoes[0], "%.");
        System.out.printf("Pontos de Bloqueio: %.2f %s\n", percentAcoes[1], "%.");
        System.out.printf("Pontos de Ataque: %.2f %s\n", percentAcoes[2], "%.");

    }

    public static double[] calcularXpercents(double[] percentAcoes, int x, int[] totalAcoes, int[] totalAcoesCertas) {

        for (int i = 0; i < x; i++) {

            percentAcoes[i] = calcularPercent(totalAcoesCertas[i], totalAcoes[i]);

        }

        return percentAcoes;
    }

    public static int[] somarXcoisas(int[] somas, int x, int[] aSerSomado) {

        for (int i = 0; i < x; i++) {

            somas[i] += aSerSomado[i];

        }

        return somas;
    }

    public static int[] lerXInts(int x) {

        int[] notas = new int[x];

        for (int i = 0; i < x; i++) {

            notas[i] = lerInt();

        }

        return notas;
    }

    public static int lerInt() {
        int valor;
        valor = LER.nextInt();
        return valor;
    }
}