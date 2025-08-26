import java.util.Scanner;

public class tabuleiroXadrez {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int qtdLados = lerNumInt();

        imprimirTabuleiro(qtdLados);

    }

    public static void imprimirTabuleiro(int qtdLados) {

        for (int cont1 = 0; cont1 < qtdLados; cont1++) {

            for (int cont2 = 0; cont2 < qtdLados; cont2++) {

                if(ehPar(cont2, cont1)){

                    System.out.print("  B");

                }else{

                    System.out.print("  P");

                }
            }

            System.out.println();

        }
    }

    public static boolean ehPar(int num, int num2){

        if((num+num2)%2 == 0){
            return true;
        }else{
            return false;
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