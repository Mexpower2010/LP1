package array.desafio;
import java.util.Scanner;

public class caçatesoro {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdAlunos = lerInt();
        int[] notas = lerXInts(qtdAlunos);
        int indiceTesouro = encontrarIndiceTesouro(notas);
        System.out.println(indiceTesouro);
        
    }

    public static int encontrarIndiceTesouro(int[] nums) {
        int indiceNovo = 0;
        int indice = 0;
        while (true) {
            if (nums[indiceNovo]>=0) {
                indice = indiceNovo;
                indiceNovo = nums[indiceNovo];
            }else{
                break;
            }

        }
        return indice;
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
