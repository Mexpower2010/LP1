/*Fica recebendo qtdNumReclamacoes sendo que se for 0 é imprimirdo vai ter copa! se nao vai ter duas!
 *e so acaba quando der EOF(has.next)
 * 
 */

import java.util.Scanner;

public class MB_1564_vaiTerCopa {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirVariasCopas();
    }

    public static void imprimirVariasCopas() {

    
        while (LER.hasNext()) { 

            int numReclamacoes = lerNumInt();
            
            imprimirCopa(numReclamacoes);
        }
}

    public static void imprimirCopa(int valor1){

            if (valor1>0) {
                imprimir("vai ter duas!");
            }else{
                imprimir("vai ter copa!");
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