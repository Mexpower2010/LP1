import java.util.Scanner;

public class MarceloFilho_1547_Adivinha {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdRound = lerInt();

        imprimirGanhador(qtdRound);
    }

    public static void imprimirGanhador(int qtdRound) {

        for (int i = 0; i < qtdRound; i++) {
            int qtdAluno = lerInt();
            int num = lerInt();
            int ganhador = calcularGanhadorRodada(num, qtdAluno);
            imprimir("" + ganhador);
        }

    }

    public static void imprimir(String tex) {
        System.out.println(tex);
    }

    public static int calcularGanhadorRodada(int num, int qtdAluno) {
        int maiProx = 1000;
        int ganhador = 0;
        int ganhador2 = 0;
        for (int j = 0; j < qtdAluno; j++) {
            int numAluno = lerInt();

            if (ganhador == 0) {
                if (numAluno == num) {
                    ganhador = j + 1;
                }
                if (maiProx > (int) Math.abs((double) (num - numAluno))) {
                    maiProx = (int) Math.abs((double) (num - numAluno));
                    ganhador2 = j + 1;
                }
            }
        }
        if (ganhador == 0) {
            ganhador = ganhador2;
        }
        return ganhador;

    }

    public static int lerInt() {
        int valor = LER.nextInt();
        return valor;
    }
}