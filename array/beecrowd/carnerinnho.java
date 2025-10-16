package array.beecrowd;

import java.util.Scanner;
import java.util.Arrays;


public class carnerinnho {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int rounds = lerInt();
        for (int i = 0; i < rounds; i++) {
            int qtdcarnerinhos = lerInt();
            int[] carnerinnho = lerXInts(qtdcarnerinhos);
            System.out.println(contCarnerinhosDif(carnerinnho));
        }
    }

    
    public static int contCarnerinhosDif(int[] carnerinnho) {

        Arrays.sort(carnerinnho);
        int carnerinhoDif = 1;
        for (int i = 1; i < carnerinnho.length; i++) {
            if(carnerinnho[i] != carnerinnho[i-1]){
                carnerinhoDif++;
            }
        }
        return carnerinhoDif;
    }

    public static int contV(int[]v) {
        int soma = 0;
        for (int i : v) {
            soma+=i;
        }
        return soma;
    }

    public static int[] criarVde0(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        return v;
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
