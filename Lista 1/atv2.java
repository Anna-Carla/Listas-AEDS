import java.util.*;

public class atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, seq = 0, anterior = 0, cont = 0;

        System.out.println("Insira os números: ");

        while (num != -1) {
            num = sc.nextInt();
            //System.out.println("contador é " + cont);
            if (num > anterior) {
                cont++;
                anterior = num;
                if (seq < cont) {
                    seq = cont;
                }
            } else if (num < anterior && num != -1) {
                cont = 1;
                anterior = num;
            }
        }
        System.out.println("A maior sequência é: " + seq);
        sc.close();
    }
}
