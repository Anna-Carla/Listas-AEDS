import java.util.*;
public class atv3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int vet [] = new int [10];
        int soma=0;

        System.out.println("Digite os números: ");

        for (int i = 0; i < vet.length; i++) {
            vet [i] = sc.nextInt();
            soma += vet[i];
        }
        System.out.println("Números maiores que a média: ");
        for (int i = 0; i < vet.length; i++) {
            if(vet[i]>(soma/10)){
                System.out.print(vet[i]+" ");
            }
        }
        sc.close();
    }
}