    /*ele recebe uma qtd de rounds ou instancias dai a cada round um ataque uma defesa e o level de
    *Dabriel e Guarte ganhando quem tem o maior valor de golpe ((Ataque+Defesa)/2 + bonus(se level for par))
    *e caso for iguais da empate
    * 
    * 
    * 
    */

    import java.util.Scanner;

    public class MB_2221_BatalhaPokemon {

        final static Scanner LER = new Scanner(System.in);

        public static void main(String[] args) {
            int instancias = lerNumInt(); 
            
            imprimirInstancias(instancias);
        }

        public static void imprimirInstancias(int instancias){


            for (int i = 0; i < instancias; i++) {
                int bonus = lerNumInt(); 
                
                int ataqueD = lerNumInt();
                int defesaD = lerNumInt();
                int levelD = lerNumInt();
                
                int ataqueG = lerNumInt();
                int defesaG = lerNumInt();
                int levelG = lerNumInt();
                
                double valorDabriel = calcularValorGolpe(ataqueD, defesaD, levelD, bonus);
                double valorGuarte = calcularValorGolpe(ataqueG, defesaG, levelG, bonus);

                imprimirVencedor(valorDabriel, valorGuarte);
                
            }
        }

        public static double calcularValorGolpe(int A, int D, int L, int bonus) {
            double valor = (A + D) / 2.0;
            if (L % 2 == 0) { 
                valor += bonus;
            }
            return valor;
        }

        public static void imprimirVencedor(double valorDabriel, double valorGuarte) {
            
            if (valorDabriel>valorGuarte) {
                imprimir("Dabriel");
            } else if (valorGuarte>valorDabriel) {
                imprimir("Guarte");
            }else{
                imprimir("Empate");
            }

        }

        public static int lerNumInt() {
            int valor = LER.nextInt();
            return valor;
        }

        public static void imprimir(String texto) {
            System.out.println(texto);
        }
    }