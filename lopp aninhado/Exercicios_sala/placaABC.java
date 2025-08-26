import java.util.Scanner;

public class placaABC {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        imprimirPlacas();

    }

    public static void imprimirPlacas(){

        int unidade = 0;
        int dezena = 0;
        int centena = 0;
        int milhar = 0;

        for(int cont4 = milhar; cont4<10; cont4++) {

            for(int cont3 = centena; cont3 < 10; cont3++ ){

                for (int cont2 = dezena; cont2 < 10; cont2++) {
                    
                    for (int cont1 = unidade; cont1 < 10 ; cont1++) {

                        System.out.printf("\tABC - %d%d%d%d\n",cont4,cont3,cont2,cont1);
                        
                    }
                }
            }    
        }


    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimir(String texto){

        System.out.println(texto);

    }
}