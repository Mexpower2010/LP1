package estudos.PrefixSums;

import java.util.Scanner;

public class somaSubsequente {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int[] v = lerXInts(6);
        int[] pre = new int[v.length + 1];
        for (int i = 1; i <= v.length; i++) {
            pre[i] = pre[i - 1] + v[i - 1];
        }
        int sum = sum(2, 6, pre);
        System.out.println();
        imprimirV(pre);
        System.out.println();
        System.out.println(sum);
    }

    public static int sum(int l, int r, int[] pre) {
        int sum = pre[r] - pre[l - 1];
        return sum;
    }

    public static int[] lerXInts(int x) {

        int[] notas = new int[x];

        for (int i = 0; i < x; i++) {

            notas[i] = SC.nextInt();

        }

        return notas;
    }

    public static void imprimirV(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}