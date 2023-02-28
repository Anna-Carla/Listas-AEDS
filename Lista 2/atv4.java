import java.util.*;
public class atv4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int x, y;

    System.out.print("Digite o x: ");
    x = sc.nextInt();
    System.out.print("Digite o y: ");
    y = sc.nextInt();

    System.out.println("Resultado: " + mdc(x, y));
    sc.close();
    }

    public static int mdc (int x, int y){
        if(x==y){
            return x;
        }
        if(x>y){
            return mdc(x-y, y);
        }
            return mdc(x, y-x);
    }
}
