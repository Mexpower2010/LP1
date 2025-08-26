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

public class MB_1160_crescimentoPop {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirQtdAnos();
    }

    public static void imprimirQtdAnos() {

    int qtdCasosTest = lerNumInt();
    for (int i = 0; i < qtdCasosTest; i++) {

        long popCity1 = lerNumLong();
        long popCity2 = lerNumLong();
        float porcent1 = lerNumfloat();
        float porcent2 = lerNumfloat();
        int anosAtePassa = 1;

        while (popCity1<popCity2 && anosAtePassa<=100) {
        
            popCity1 += (long)((popCity1*porcent1)/100);
            popCity2 += (long)((popCity2*porcent2)/100);

            anosAtePassa++;
            
        }
        imprimirResposta(anosAtePassa);
    }    
    
    }

    public static void imprimirResposta(int anosAtePassa){

           if (anosAtePassa == 101) {
            imprimir("Mais de 1 seculo.");
        }else{
            imprimir(anosAtePassa+" anos.");
        }

    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static long lerNumLong() {

        long valor;

        valor = LER.nextLong();

        return valor;

    }

    public static float lerNumfloat() {

        float valor;

        valor = LER.nextFloat();

        return valor;

    }


    public static void imprimir(String texto) {

        System.out.println(texto);

    }
}