package estudos.OBI;
import java.util.Scanner;
public class planoEstacionamento {
    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int qtdVagas = SC.nextInt();
        int qtdNego = SC.nextInt();
        int [] vagas = criarVetor0(qtdVagas);
        int totalCabido = 0;
        for (int i = 0; i < qtdNego ; i++) {
        
            int v = SC.nextInt();
            int qtdSemVaga = 0;

            for (int j = 0; j < v; j++) {

                if (vagas[j] == 0) {
                    vagas[j] = 1;
                }else{
                    qtdSemVaga++;
                }
            }
            if (qtdSemVaga != v) { 
                totalCabido++;
            }


        }
        System.out.println(totalCabido);

    }
    public static int[] criarVetor0(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
        return v;
    }
    
}
