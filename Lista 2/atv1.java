import java.util.*;
public class atv1{
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int a, n;
       
       System.out.println("Digite um número: ");
       a = sc.nextInt();
       System.out.println("Digite sua potência: ");
       n = sc.nextInt();

       System.out.println("Resultado da potência: "+ potencia(a, n));
       sc.close();
    }

    public static int potencia (int a, int n){
        if(n==1){
            return a;
        }
        return a * potencia(a, n-1);
    }
}