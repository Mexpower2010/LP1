package estudos.PrefixSums.execicio;
import java.util.Scanner;
public class soma {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int x = SC.nextInt();
        int k = SC.nextInt();
        int[] v = lerXInts(x);
        int[] soma = new int[x+1];
        int cont= 0;
        for (int i = 1; i <= v.length; i++) {
            soma[i]= soma[i-1]+v[i-1];
        }
        for (int i = 1; i < soma.length; i++) {
            for (int j = 0; j < soma.length; j++) {
                if (sum(i, j, soma)==k) {
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
    public static int sum(int l, int r, int[] soma) {
        return (int)soma[r]-soma[l-1];
    }
    public static int[] lerXInts(int x) {

        int[] notas = new int[x];

        for (int i = 0; i < x; i++) {

            notas[i] = SC.nextInt();

        }

        return notas;
    }
    
}
