package estudos.OBI;
import java.util.Scanner;
public class figurinha {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
    
        SC.nextInt();
        
        int qtdFC = SC.nextInt();

        int qtdFCompradas = SC.nextInt();

        int[] figurinhasC = lerXInts(qtdFC);

        int[] figurinhasCompradas = lerXInts(qtdFCompradas);

        int qtdCompativel = 0;

        for (int i = 0; i < figurinhasC.length; i++) {
            
            for (int j = 0; j < figurinhasCompradas.length; j++) {
                
                if(figurinhasC[i]==figurinhasCompradas[j]){
                    qtdCompativel++;
                    break;
                } 

            }

        }

        int qtdFCfaltante = qtdFC - qtdCompativel;
        System.out.println(qtdFCfaltante);

    }

    public static int[] lerXInts(int x) {

        int[] v = new int[x];

        for (int i = 0; i < x; i++) {

            v[i] = SC.nextInt();

        }

        return v;
    }
}