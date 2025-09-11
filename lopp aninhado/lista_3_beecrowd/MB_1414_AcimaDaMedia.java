/*o codigo recebe uma qtd de turmas e para cada turma a qtd de alunos e a nota de cada um
 *e calcula a media da turma, quantos da turma foram acima da media e qual a porcentagem
 *de alunos acima da media apresentando com 3 casas apos a virgula
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MB_1414_AcimaDaMedia {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirPorcentAlunosAcimaDaMedia();
    }

    public static void imprimirPorcentAlunosAcimaDaMedia() {

        int qtdSalas = lerNumInt();
        for (int i = 0; i < qtdSalas; i++) {

            int qtdNotas = lerNumInt();
            int[] notas = lerNotas(qtdNotas);
            double media = calcularMedia(notas);
            int contarAcimaMedia = calcularAcimaMedia(media, notas);
            double percentAcimaMedia = calcularPercentAcimaMedia(contarAcimaMedia, qtdNotas);
            imprimirFormatado(percentAcimaMedia, "%");
        }

    }

    public static double calcularPercentAcimaMedia(int contarAcimaMedia, int qtdNotas) {
        double porcent = ((double) contarAcimaMedia / qtdNotas) * 100;
        return porcent;
    }

    public static int calcularAcimaMedia(double media, int[] notas) {
        int i = 0;
        for (int nota : notas) {
            if (nota > media) {
                i++;
            }
        }
        return i;
    }

    public static double calcularMedia(int[] notas) {
        int soma = 0;
        double media = 0;
        for (int nota : notas) {
            soma += nota;
        }
        media = (double) soma / notas.length;
        return media;
    }

    public static int[] lerNotas(int qtdNotas) {

        int[] notas = new int[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {

            notas[i] = lerNumInt();

        }

        return notas;
    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimirFormatado(double i, String tex) {

        BigDecimal num = new BigDecimal(i);
        num = num.setScale(3, RoundingMode.HALF_EVEN);

        System.out.printf("%.3f%s\n", num, tex);

    }

    public static void imprimir(String texto) {

        System.out.println(texto);

    }
}