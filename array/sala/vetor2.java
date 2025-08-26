package array.sala;

import java.util.Scanner;

public class vetor2 {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdAlunos = lerInt();
        int[] notas = lerXInts(qtdAlunos);
        float media = calcularMedia(notas);
        int[] qtdENotasAcimaMedia = calcularQtdNotasAcimaMediaEAlunosAcimaMedia(notas, media);
        float mediaAlunosAcimaMedia = calcularMedia(qtdENotasAcimaMedia);
        System.out.println(mediaAlunosAcimaMedia);
    }

    public static int[] calcularQtdNotasAcimaMediaEAlunosAcimaMedia(int[] notas, float media) {
        int cont = 0;
        for (int i : notas) {
            if (i >= media) {
                cont++;
            }
        }
        int[] qtdEAlunosAcimaMedia = new int[cont + 1];
        qtdEAlunosAcimaMedia[0] = cont;
        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > media) {
                qtdEAlunosAcimaMedia[i + 1] = notas[i];
            }

        }
        return qtdEAlunosAcimaMedia;
    }

    public static float calcularMedia(int[] notas) {
        int somanotar = 0;
        for (int i : notas) {
            somanotar += i;
        }
        float media = (float) somanotar / notas.length;
        return media;
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

        valor = SC.nextInt();

        return valor;

    }
}
