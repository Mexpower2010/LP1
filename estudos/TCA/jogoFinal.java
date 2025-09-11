/*bem de jogo final contra um virus em forma de hidra(nerd) que vai fazer um RPG de "mesa",
 *uma especie de duelo com magias e armas especiais alem de levar em conta   
 *o nivel do game para matar a hidra.
 * 
 * a cada 1/3 da vida da hidra ela perde uma cabeça e fica mais forte (possivel alteração no visual)
 *
 * TODOS os status vao ser aleatorios (magias, armas, hidra(a da hidra vai depender da dificuldade))
 * 
 * o player tera uma classe com 6 magias e 2 slots de magia além de 3 armas com um especial e 1 slot de arma e um efeito por classe 
 *  
 * tera três classes 
 * 
 * as magias serão sempre ativas ou seja sem efeito passivo que dura + de um round e tem um coldow de 2 rounds
 *
 * voce pode atacar com a espada (normal ou especial) juntamente com uma magia 
 * 
 * uma espada vai ter o status, dano base, dano especial, taxa de critico, multiplicador de criticos.  
 * 
 * o dano da espada vai ser o dano base ou final vezes o multiplicador de critico se houver ou se n houver sera um
 * 
 * o dano final sera 
 */
package estudos.TCA;
import java.util.Scanner;

public class jogoFinal {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    public static float calcularMedia(int[] notas) {
        int somanotar = 0;
        for (int i : notas) {
            somanotar += i;
        }
        float media = (float) somanotar / notas.length;
        return media;
    }

    public static int[] lerXInts(int x) {

        int[] notas = new int[x];

        for (int i = 0; i < x; i++) {

            notas[i] = lerInt();

        }

        return notas;
    }

    public static int lerInt() {

        int valor;

        valor = SC.nextInt();

        return valor;

    }

}
