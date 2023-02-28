import java.util.*;
public class atv3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("Digite um número: ");
    n = sc.nextInt();
    conversor(n);
    sc.close();
    }
    public static void conversor (int n){
        if(n==1){
            System.out.print(n);
        } else {
            conversor(n/2);
            System.out.print(n%2);
        }
    }
}
