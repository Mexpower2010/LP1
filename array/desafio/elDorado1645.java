package array.desafio;

import java.util.Scanner;

public class elDorado1645 {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int N = lerInt();
            int sequencias = lerInt();
            if (N == 0 && sequencias == 0) {
                break;
            }
            int[] nums = lerXInts(N);
            int qtdSequencias = calcularQtdSequenciasCrescentes(nums, sequencias);
            System.out.println(qtdSequencias);
        }
    }

    public static int calcularQtdSequenciasCrescentes(int[] nums, int sequencias) {
        int contNumEmSequencia = 0;
        int contSequencias = 0;
        for (int i = (nums.length-1); i >= 0; i--) {
            if (i == 0 ) {
                if (nums[i] == nums[i+1] - 1) {
                    contNumEmSequencia++;
                    if (contNumEmSequencia%sequencias == 0) {
                        contSequencias++;
                        contNumEmSequencia = 0;
                    }
                }else{
                    contNumEmSequencia = 0;
                }
            }else{ 
                if (nums[i] == nums[i-1] + 1) {
                    contNumEmSequencia++;
                    if (contNumEmSequencia%sequencias == 0) {
                        contSequencias++;
                        contNumEmSequencia = 0;
                    }
                }else{
                    contNumEmSequencia = 0;
                }
            }
        }
        return contSequencias;
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
