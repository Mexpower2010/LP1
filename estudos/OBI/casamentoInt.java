package estudos.OBI;

import java.util.Scanner;

public class casamentoInt {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = lerInt();
        int num2 = lerInt();
        if (num1>num2) {
            int mNum = num1;
        }else{
            int mNum = num2;
        }
        int tamanho=0;
        int temp = mNum;
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
