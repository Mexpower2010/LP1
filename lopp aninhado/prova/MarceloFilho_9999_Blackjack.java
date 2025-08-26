import java.util.Scanner;

public class MarceloFilho_9999_Blackjack {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdRound = lerInt();
        imprimirPont(qtdRound);
    }

    public static void imprimirPont(int qtdRound) {

        int pontO = 0;
        int pontT = 0;
        int empate = 0;

        for (int i = 0; i < qtdRound; i++) {
            LER.next();
            int qtdJogadasO = lerInt();
            int somaO = calcularSoma(qtdJogadasO);
            LER.next();
            int qtdJogadasT = lerInt();
            int somaT = calcularSoma(qtdJogadasT);
            pontO += calcularPontO(somaO, somaT);
            pontT += calcularPontT(somaO, somaT);
            empate += calcularEmpate(somaO, somaT);
        }

        imprimirFormatado(pontO, pontT, empate);
    }

    public static int calcularEmpate(int somaO, int somaT) {
        int valor = 0;
        if (somaO > 21 && somaT > 21) {
            valor = 1;
        } else if (somaO == somaT) {
            valor = 1;
        }
        return valor;

    }

    public static void imprimirFormatado(int pontO, int pontT, int empate) {

        String vencedor = "";
        if (pontO > pontT) {
            vencedor = "O vencedor é o Ogaiht.";
        } else if (pontT > pontO) {
            vencedor = "O vencedor é o Trebreh.";
        } else {
            vencedor = "empate";
        }
        imprimir(vencedor);
        imprimir("Ogaiht venceu " + pontO + " rodada(s).");
        imprimir("Trebreh venceu " + pontT + " rodada(s).");
        imprimir("Empataram " + empate + " rodada(s).");

    }

    public static void imprimir(String tex) {
        System.out.println(tex);
    }

    public static int calcularPontT(int somaO, int somaT) {
        int valor = 0;
        if (somaO > 21 || somaT > 21) {

            if (somaT <= 21 && somaO > 21) {
                valor = 1;
            }

        } else if (somaT > somaO) {
            valor = 1;
        }
        return valor;

    }

    public static int calcularPontO(int somaO, int somaT) {
        int valor = 0;
        if (somaO > 21 || somaT > 21) {

            if (somaO <= 21) {
                valor = 1;
            } else {
                valor = 0;
            }

        } else if (somaO > somaT) {
            valor = 1;
        }
        return valor;

    }

    public static int calcularSoma(int qtdJogadas) {
        int soma = 0;
        for (int j = 0; j < qtdJogadas; j++) {
            int num = lerInt();
            soma += num;
        }
        return soma;
    }

    public static int lerInt() {
        return LER.nextInt();
    }
}