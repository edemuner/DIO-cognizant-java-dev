package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];

        for (int i = 0; i <= array.length - 1; i++){
            try {
                System.out.println("Digite um número entre 0 e 100");
                int j = scan.nextInt();
                if (j >= 0 && j <= 100){
                    array[i] = j;
                }
                else {
                    System.out.println("Eu disse entre zero e cem!");
                    i --;
                }
            }
            catch (InputMismatchException erro){
                scan.nextLine();
                System.out.println("Apenas números!");
                i --;
            }
        }

        for (int i = 0; i <= array.length-1; i++){
            if (i < array.length-1) {
                System.out.println("O número é " + array[i] + " e seu sucessor é " + array[i + 1]);
            }
            else {
                System.out.println("O último número é " + array[i]);
            }
        }

    }
}
