import java.util.Scanner;

public class triangulo {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int h = lerNumInt();

        imprimirTriangulo(h);

    }

    public static void imprimirTriangulo(int h) {

        for (int cont1 = 1; cont1 <= h; cont1++) {

            for (int cont2 = 1; cont2 < cont1; cont2++) {

                imprimir("*");

            }

            System.out.println("*");
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