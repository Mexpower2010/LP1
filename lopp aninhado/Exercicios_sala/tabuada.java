import java.util.Scanner;

public class tabuada {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        
        int multiplo = lerNumInt();

        int multiplicando = lerNumInt();

        imprimirTabuada(multiplo, multiplicando);

    }

    public static void imprimirTabuada(int multiplo, int multiplicando){

        int valor;

        for(int cont = multiplo; cont>0; cont--) {

            System.out.println("\n\t TABUADA DO "+ cont + "\t\n");

            for(int i = multiplicando; i > 0; i-- ){

                System.out.print("|\t");

                valor = cont * i;

                System.out.printf("%d * %d = %d \t", cont, i, valor);

                System.out.println("\t|");

            }

           
        
        }


    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimir(int texto){

        System.out.println(texto);

    }
}