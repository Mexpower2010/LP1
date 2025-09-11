package estudos.OBI;

import java.util.Scanner;

public class casamentoInt {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = lerInt();
        int num2 = lerInt();
        int mNum = Math.max(num1, num2);

        int tamanho=calcularTvet(mNum);
        int[] v1 = fazerVetor(num1, tamanho);
        int[] v2 = fazerVetor(num2, tamanho);

        num1 = 0;
        num2 = 0;

        int cont1 = 0;
        int cont2 = 0;
        int qtdMenor1 = 0;
        int qtdMenor2 = 0;

        for (int i = 0; i < v2.length; i++) {
            if (v1[i]>v2[i]) {
                v2[i] = 0;
                num1 += v1[i]*Math.pow(10, cont1);
                cont1++;
                qtdMenor2++;
            }else if (v2[i]>v1[i]){
                v1[i] = 0;
                num2 += v2[i]*Math.pow(10, cont2);
                cont2++;
                qtdMenor1++;
            }else{
                num1 += v1[i]*Math.pow(10, cont1);
                num2 += v2[i]*Math.pow(10, cont2);
                cont1++;
                cont2++;
            }
        }
        if (qtdMenor1 == v2.length) {
            num1 = -1;
        }
        if (qtdMenor2 == v2.length) {
            num2 = -1;
        }

        System.out.println(num2);
        System.out.println(num1);
    }

    public static void imprimirV(int[] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]+" ");
        }
        System.out.println();
    }

    public static int calcularTvet(int mNum) {
        int t=0;
        int temp = mNum;
        while (temp>0) {
            temp/=10;
            t++;
        }
        return t;
    }

    public static int[] fazerVetor(int num, int tamanho) {
        int[]v = new int[tamanho];

        for (int i = 0; i < v.length; i++) {
            v[i] = num%10;
            num /=10;
        }

        return v;
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
