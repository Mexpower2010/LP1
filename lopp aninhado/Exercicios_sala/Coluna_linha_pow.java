import java.util.Scanner;

public class Coluna_linha_pow {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdLados = lerNumInt();

        imprimirAsteriscos(qtdLados);

    }

    public static void imprimirAsteriscos(int qtdLados) {

        double contPowMaior = 0;

        double contPowMenor = 0;

        double valor = 0;

        for (int cont1 = 0; cont1 < qtdLados; cont1++) {

            for (int cont2 = 1; cont2 < (qtdLados + 1); cont2++) {

                valor = Math.pow(2, contPowMenor);

                ImprimirValor(cont2, qtdLados, valor);

                contPowMenor++;
            }

            contPowMaior++;

            contPowMenor = contPowMaior;

        }
    }

    public static void ImprimirValor(int cont2, int qtdLados, double valor) {

        if (cont2 % qtdLados == 0) {

            System.out.printf("%.0f\n", valor);

        } else {

            System.out.printf("%.0f  ", valor);

        }

    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimir(String texto) {

        System.out.printf(texto);

    }
}