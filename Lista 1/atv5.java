import java.util.*;
public class atv5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mat [] [] = new int [50] [50];
    int somaD=0, somaSEC=0;

    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat.length; j++) {
            mat [i] [j] = sc.nextInt();
        }
    }

    /*IMPRESSÃO DA MATRIZ
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
            System.out.print(mat[i][j]+" ");
        }
        System.out.print("\n");
    }*/

    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat.length; j++) {
            if(i==j){
                somaD += mat [i] [j];
            }
        }
    } 

    for (int i = 0; i < mat.length; i++) {
        for (int j = mat.length-1; j >= 0; j--) {
                somaSEC += mat [j] [i];
            i++;
        }
    }

    System.out.println("Diagonal 1: "+somaD);
    System.out.println("Diagonal 2: "+somaSEC);
    sc.close();
    }
}