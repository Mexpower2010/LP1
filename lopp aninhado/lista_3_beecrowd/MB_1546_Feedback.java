/*recebe um qtd dias(for) seguido de um qtd reclamações(for) sendo que a cada reclamação 
 *imprime o nome de um profissional que fica responsavel pelo problema
 *
 *
 */

import java.util.Scanner;

public class MB_1546_Feedback {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirVariosFeedback();
    }

    public static void imprimirVariosFeedback() {

        int valor;
        int qtdDias = lerNumInt();

        for (int i = 0; i < qtdDias; i++) {
            int qdtReclamações = lerNumInt();

            for (int j = 0; j < qdtReclamações; j++) {

                valor = lerNumInt();

                imprimirResponsavel(valor);
            }
        }

    }

    public static void imprimirResponsavel(int valor) {

        // switc case valido
        if (valor == 1) {
            imprimir("Rolien");
        } else if (valor == 2) {
            imprimir("Naej");
        } else if (valor == 3) {
            imprimir("Elehcim");
        } else {
            imprimir("Odranoel");
        }

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