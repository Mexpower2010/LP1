package estudos.OBI;
import java.util.Scanner;
public class suditos {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        
        int qtdNego = SC.nextInt();

        int [] niggas = criarVnumerado(qtdNego);

        int qtdRoundsSexoSelvagemComAThaisCarla = SC.nextInt();

        

        for (int i = 0; i < qtdRoundsSexoSelvagemComAThaisCarla; i++) {

            int posicaoParaSeFoder = SC.nextInt();

            for (int j = 1; j <= niggas.length; j++) {

                int posicaoQueSeFodeu = (posicaoParaSeFoder*j)-1;

                if (posicaoQueSeFodeu<=niggas.length-1) {

                    niggas[posicaoQueSeFodeu] = 0;

                }else{

                    break;

                }
            }
            niggas = reorganizarBucetinhaDeVetor(niggas);
        }
        imprimirV(niggas);
    }

    public static void imprimirV(int[] niggas) {
        if (niggas.length>10000) {
            for (int i = 0; i < 10000; i++) {
                System.out.println(niggas[i]);
            }
        }else{ 
        for (int i = 0; i < niggas.length; i++) {
            System.out.println(niggas[i]);
        }}
    }

    public static int[] reorganizarBucetinhaDeVetor(int [] v) {
        int tamanho = 0;
        for (int i : v) {
            if (i!=0) {
                tamanho++;
            }
        }
        int[] vcerto = new int[tamanho];
        tamanho = 0;//virou um cont
        for (int i = 0; i < v.length; i++) {
            
            if (v[i]!=0) {
                vcerto[tamanho] = v[i];
                tamanho++;
            }
            
        }
        return vcerto;
    }

    public static int[] criarVnumerado(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < v.length; i++) {
            v[i] = i+1;
        }
        return v;
    }

}
