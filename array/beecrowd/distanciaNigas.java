package array.beecrowd;

import java.util.Scanner;

public class distanciaNigas {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

     
    }

    
    public static int contCarnerinhosDif(int[] carnerinnho) {
        int carnerinnhoMaior = 0;

        for (int i : carnerinnho) {

            if (i>carnerinnhoMaior) {
                carnerinnhoMaior = i;
            }
        }

        int[] contador = new int[carnerinnhoMaior+1];

        for (int i = 0; i < carnerinnho.length; i++) {
            contador[carnerinnho[i]] = 1;
        }

        return contV(contador);
    }

    public static int contV(int[]v) {
        int soma = 0;
        for (int i : v) {
            soma+=i;
        }
        return soma;
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
