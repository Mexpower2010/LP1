import java.util.Scanner;

public class MarceloFilho_1329_CaraCoroa {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        imprimirResusltGame();
    }

    public static void imprimirResusltGame() {

        while (true) {
            int pontM = 0;
            int pontJ = 0;
            int qtdRound = lerInt();
            if (qtdRound == 0) {
                break;
            }

            for (int i = 0; i < qtdRound; i++) {
                int num = lerInt();
                if (num == 0) {
                    pontM++;
                } else {
                    pontJ++;
                }
            }
            imprimirFormatado(pontM, pontJ);
        }

    }

    public static void imprimirFormatado(int pontO, int pontT) {

        imprimir("Mary won " + pontO + " times and John won " + pontT + " times");

    }

    public static void imprimir(String tex) {
        System.out.println(tex);
    }

    public static int lerInt() {
        return LER.nextInt();
    }
}