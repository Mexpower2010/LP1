package estudos.OBI;
import java.util.Scanner;
public class calcada {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int x = SC.nextInt();
        int[] calcada = lerXInts(x);
        int qtdNumCirculado = calcularNumCirculados(calcada);
        System.out.println(qtdNumCirculado);
    }

    public static int calcularNumCirculados(int[]calcada) {
        int qtdNumCirculado = 0;
        int[] numsP = {0,0};
        int ultimoNumContado = 0;
    

        for (int i = 1; i < calcada.length; i++) {
            for (int j = 0; j < calcada.length; j++) {
                if (calcada[i] == calcada[j]) {

                    if (i != calcada.length-1){
                        
                    
                        if (calcada[i-1]!= calcada[i] && calcada[i+1] != calcada[i]&& i!=j) {

                            if (calcada[i]!= ultimoNumContado) {

                            if (numsP[0]==0) {

                                numsP[0] = calcada[i];

                                ultimoNumContado = calcada[i];

                                qtdNumCirculado++;

                            }else if (numsP[1]== 0 && numsP[0]!= calcada[i]) {

                                numsP[1] = calcada[i];

                                ultimoNumContado = calcada[i];

                                qtdNumCirculado++;

                            }else if (numsP[0] == calcada[i] || numsP[1] ==calcada[i]) {

                                ultimoNumContado = calcada[i];
            
                                qtdNumCirculado++;
                            }}
                        }
                    }else{
                        if (calcada[i-1]!= calcada[i] && i!=j) {

                            if (calcada[i]!= ultimoNumContado) {

                            if (numsP[0]==0) {

                                numsP[0] = calcada[i];

                                ultimoNumContado = calcada[i];

                                qtdNumCirculado++;

                            }else if (numsP[1]== 0 && numsP[0]!= calcada[i]) {

                                numsP[1] = calcada[i];

                                ultimoNumContado = calcada[i];

                                qtdNumCirculado++;

                            }else if (numsP[0] == calcada[i] || numsP[1] ==calcada[i]) {

                                ultimoNumContado = calcada[i];
            
                                qtdNumCirculado++;
                            }}
                        }
                    }
                }
            }
        }

        return qtdNumCirculado;
    }

    public static int[] lerXInts(int x) {

        int[] notas = new int[x];

        for (int i = 0; i < x; i++) {

            notas[i] = SC.nextInt();

        }

        return notas;
    }
}
