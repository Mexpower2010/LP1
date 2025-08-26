
/*o codigo recebe uma qtd de apresentaçoes, o nome de um competidor, o peso de sua apresentaçao 
 *e suas notas ent vc soma todas elas elimina a menor e a maior nota e multiplica pelo peso tendo
 * assim a pontuação final dele, apresenta o seu nome e logo depois sua nota
 * /

/*import java.math.BigDecimal;
import java.math.RoundingMode;*/
import java.util.Scanner;

public class MB_2311_saltosOrnamentais {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        imprimirPorcentAlunosAcimaDaMedia();
    }

    public static void imprimirPorcentAlunosAcimaDaMedia() {

        int qtdCasosTest = lerNumInt();
        for (int i = 0; i < qtdCasosTest; i++) {

            String nome = lerString();
            float peso = lerNumfloat();
            float[] notas = lerNotas();
            float pontuacao =calcularPontuacao(notas, peso);
            imprimirFormatado(nome, pontuacao);
        }

    } 

    public static float calcularPontuacao(float[] notas, float peso) {
        float soma = 0f;
        float pontuacao = 0f;
        float menorNota = 100f;
        float maiorNota = 0f;

        for (float nota : notas) {
            if (menorNota > nota) {

                menorNota = nota;

            }
            if (maiorNota < nota) {

                maiorNota = nota;
            }
            soma += nota;
        }

        soma = soma - (maiorNota + menorNota);

        pontuacao = soma * peso;

        return pontuacao;
    }

    public static float[] lerNotas() {

        float[] notas = new float[7];

        for (int i = 0; i < 7; i++) {

            notas[i] = lerNumfloat();

        }

        return notas;
    }

    public static float lerNumfloat() {

        float valor;

        valor = LER.nextFloat();

        return valor;

    }

     public static String lerString() {

        String valor;

        valor = LER.next();

        return valor;

    }

    public static int lerNumInt() {

        int valor;

        valor = LER.nextInt();

        return valor;

    }

    public static void imprimirFormatado(String tex,float i ) {

        /*BigDecimal num = new BigDecimal(i);
        num = num.setScale(2, RoundingMode.HALF_EVEN);*/

        System.out.printf("%s %.2f\n", tex, i);

    }

    public static void imprimir(String texto) {

        System.out.println(texto);

    }
}