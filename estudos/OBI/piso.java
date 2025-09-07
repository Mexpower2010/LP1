package estudos.OBI;
import java.util.Scanner;
public class piso {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
    
        int l = SC.nextInt();
        int c = SC.nextInt();

        int tipo1 = 0;
        int tipo2 = 0;

        tipo2 = (c-1)*2+(l-1)*2;
        for (int i = 0; i < (c+(c-1)); i++) {
            if (i%2 == 0) {
                tipo1+=l;
            }else{
                tipo1+=(l-1);
            }
        }
        System.out.println(tipo1);
        System.out.println(tipo2);
    }
}