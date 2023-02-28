import java.util.*;
public class atv4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mat [] [] = new int [4] [3];
    int somaCol [] = new int [3];
    int soma=0;

    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
            mat [i] [j] = sc.nextInt();
        }
    }

        /*IMPRESSÃO DA MATRIZ
        System.out.println("\n");
    
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }*/

    for (int j = 0; j < mat[0].length; j++) {
        for (int i = 0; i < mat.length; i++) {
            soma += mat [i] [j];
            somaCol [j] = soma;
        }
        soma = 0;
    }    

    System.out.println("A Soma da coluna 1: "+somaCol [0]);
    System.out.println("A Soma da coluna 2: "+somaCol [1]);
    System.out.println("A Soma da coluna 3: "+somaCol [2]);

    sc.close();
    }
}