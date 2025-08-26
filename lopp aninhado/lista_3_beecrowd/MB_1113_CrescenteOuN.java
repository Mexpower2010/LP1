/*em um loop que so acaba quando x é == y (while true)
 *
 *            se recebe um xis e um iplison
 *            verifica se eles sao inguais(break)
 *            verifica qual é maior e qual é maior
 *            imprimir se a ordem foi crescente ou decresente
 *
 * 
 */

import java.util.Scanner;

public class MB_1113_CrescenteOuN {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirVariasSomas();
    }

    public static void imprimirVariasSomas() {

        int valor1;
        int valor2;
        
        
        while (true) { 

            valor1 = lerNumInt();
            valor2 = lerNumInt();
            
            if (valor1 == valor2) {
                break;
            }

            imprimirOrdem(valor1, valor2);      
    }
}

    public static void imprimirOrdem(int valor1, int valor2){

            if (valor1>valor2) {
                imprimir("Decrescente");
            }else{
                imprimir("Crescente");
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