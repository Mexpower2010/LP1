package estudos.PrefixSums.execicio;
import java.util.Scanner;
public class cofre {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int N = SC.nextInt();
        int M = SC.nextInt();

        int[] vetorNuns = lerXInts(N);

        int[] vetorPosicoes = lerXInts2(M);

        int[] vetorSomas = new int[10];

        int[][] possiveisSomas = calcularPossiveisSomas(N, vetorNuns);
        for (int i = 1; i < vetorPosicoes.length; i++) {
            vetorSomas = somarV(sumV(possiveisSomas[Math.max(vetorPosicoes[i], vetorPosicoes[i-1])], possiveisSomas[Math.min(vetorPosicoes[i], vetorPosicoes[i-1])-1]), vetorSomas);
        }
        imprimirVetor(vetorSomas);
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }

    public static int[] somarV(int[] v1, int [] v2) {
        int soma[] = new int[v1.length];
        for (int i = 0; i < soma.length; i++) {
            soma[i] = v1[i] + v2[i];
        }
        return soma;
    }

    public static int[] sumV(int[] vr, int [] vl) {
        int[] sum = new int[vl.length];
        for (int i = 0; i < vl.length; i++) {
            sum[i] = vr[i] - vl[i];
        }
        return sum;
    }

    public static int[][] calcularPossiveisSomas(int N, int[] vetorNuns) {
        int[][] possiveisSomas = new int[N+1][10];

        for (int i = 1; i < possiveisSomas.length; i++) {
            possiveisSomas[i] = possiveisSomas[i - 1].clone();
            possiveisSomas[i][vetorNuns[i - 1]]++;
        }

        return possiveisSomas;
        
    }
    public static int[] calularFrequenciaPosicoes(int ateOnde, int[] vetorNuns) {
        int[] frequenciaPosicoes = new int[10];
        for (int i = 0; i < ateOnde; i++) {
            frequenciaPosicoes[vetorNuns[i]]++;
        }
        return frequenciaPosicoes;
    }
    public static int[] lerXInts2(int x) {

        int[] V = new int[x+1];

        for (int i = 1; i < V.length; i++) {

            V[i] = SC.nextInt();

        }
        V[0]=1;
      

        return V;   
        
    }

    public static int[] lerXInts(int x) {

        int[] V = new int[x];

        for (int i = 0; i < V.length; i++) {

            V[i] = SC.nextInt();

        }
      

        return V;   
        
    }
}
   
