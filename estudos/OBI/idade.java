package estudos.OBI;
import java.util.Scanner;

public class idade {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        int veia = SC.nextInt();
        int idadeF1 = SC.nextInt();
        int idadeF2 = SC.nextInt();
        
        int idadeF3 = veia-(idadeF1+idadeF2);
        
        int idadeVelho = calcularMaisVelho(idadeF1, idadeF2, idadeF3);
        
        System.out.println(idadeVelho);
    }
    public static int calcularMaisVelho(int um, int dois, int tres) {
        int maisV;
        if (um>dois && um>tres) {
            maisV = um;
        }else if (dois>um && dois>tres) {
            maisV = dois;
        }else{
            maisV = tres;
        }
        return maisV;
    }
}
