/*
vai coletando uma qtd x de 1 ou 0 sendo um favoravel e 0 enquanto tiver algo na bacia do teclado(has.next).
E se qtd1 for >= que dois terços de x da impeachtman e se nao caso arquivado
*/import java.util.Scanner;

public class MB_2540_impeachman {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirImpeatchemas();

    }

    public static void imprimirImpeatchemas() {

        while (temEntrada() == true) {

            int voto;

            int qtdvotos1 = 0;

            float qtdVotos = lerNumInt();

            for (int i = 0; i < qtdVotos; i++) {

                voto = lerNumInt();

                if (voto == 1) {

                    qtdvotos1++;

                }
            }
            imprimir(resultadoImpeachtman(qtdVotos, qtdvotos1));

        }
    }

    public static boolean temEntrada() {
        return LER.hasNext();
    }

    public static String resultadoImpeachtman(float qtdvotos, int qtdvotos1) {

        String result = "";

        float calculo = (float)((2.0 / 3.0) * qtdvotos);

        if (qtdvotos1 >= calculo) {

            result = "impeachment";

        } else {

            result = "acusacao arquivada";

        }

        return result;
    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimir(String texto) {

        System.out.println(texto);

    }
}