import java.util.Scanner;

public class Colunas_linhas {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdLados = lerNumInt();

        imprimirAsteriscos(qtdLados);

    }

    public static void imprimirAsteriscos(int qtdLados) {

        int cont = 0;

        for (int cont1 = 0; cont1 < qtdLados; cont1++) {

            for (int cont2 = 0; cont2 < qtdLados; cont2++) {

                cont++;

                if (cont % qtdLados == 0) {

                    System.out.println("" + cont);

                } else {

                    imprimir(cont + " ");

                }
            }

        }
    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimir(String texto) {

        System.out.print(texto);

    }
}