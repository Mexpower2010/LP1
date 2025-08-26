import java.util.Scanner;

public class MB_1091_casaNlogonia {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdCasas;

        int limiteX;

        int limiteY;

        while (true) {

            qtdCasas = lerNumInt();

            if (qtdCasas == 0) {

                break;

            }

            limiteX = lerNumInt();

            limiteY = lerNumInt();

            imprimirNovasCasas(qtdCasas, limiteX, limiteY);
        }

    }

    public static void imprimirNovasCasas(int qtdCasa, int limiteX, int limiteY) {

        int cordenadaX = 0;
        int cordenadaY = 0;
       

        for (int i = 0; i < qtdCasa; i++) {

            cordenadaX = lerNumInt();

            cordenadaY = lerNumInt();

            imprimir(verificarQuadrante(cordenadaX, cordenadaY, limiteX, limiteY));

        }

    }

    public static void imprimir(String texto) {

        System.out.println(texto);

    }

    public static String verificarQuadrante(int cordenadaX, int cordenadaY, int limiteX, int limiteY) {

        String Quadrante = null;

        if (cordenadaX != limiteX && cordenadaY != limiteY) {

            if (cordenadaX > limiteX && cordenadaY > limiteY) {
                Quadrante = "NE";
            } else if (cordenadaX < limiteX && cordenadaY > limiteY) {
                Quadrante = "NO";
            } else if (cordenadaX < limiteX && cordenadaY < limiteY) {
                Quadrante = "SO";
            } else {
                Quadrante = "SE";
            }

        } else {
            Quadrante = "divisa";
        }

        return Quadrante;
    }

    public static int lerNumInt() {

        int valor = 0;

        valor = LER.nextInt();

        return valor;

    }
}