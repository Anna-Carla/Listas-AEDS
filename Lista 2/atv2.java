import java.util.*;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m, n;

        System.out.print("Digite seu ponto de partida: ");
        m = sc.nextInt();
        System.out.print("Digite seu ponto de parada: ");
        n = sc.nextInt();

        System.out.println("Resultado da soma: "+soma( m, n));
        sc.close();
    }

    public static int soma (int m, int n){
        if(m==n){
            return n;
        }
        return m + soma (m+1, n);
    }
}
