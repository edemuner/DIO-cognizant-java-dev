package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] arrayM = new int[3][3];

        for (int i = 0; i <= arrayM.length-1; i++){
            for (int j = 0 ;j <=arrayM.length-1; j++){
                System.out.println("Digite um valor entre 0 e 9");
                try {
                    int k = scan.nextInt();
                    arrayM[i][j] = k;
                }
                catch (InputMismatchException erro){
                    System.out.println();
                    if (j == 0){
                        i--;
                        j = 2;
                    }
                    else {
                        j--;
                    }
                }
            }
        }

        System.out.println("Aqui está seu array multidimensional!");
        for (int i = 0; i <= arrayM.length-1; i++){
            for (int j = 0; j<= arrayM.length-1; j++){
                System.out.print(arrayM[i][j]);
            }
            System.out.println();
        }
    }
}
