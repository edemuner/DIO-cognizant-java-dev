package arrays;

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[] array = new char[6];
        int count = 0;

        for (int i = 0; i <= 5; i++){
                System.out.println("Digite um caractere");
                array[i] = scan.next().charAt(0);
        }

        for (int i = 0 ; i <= array.length - 1; i++){
            if (array[i] != 'a' && array[i] != 'e' && array[i] != 'i' && array[i] != 'o' && array[i] != 'u'){
                count ++;
                System.out.println(array[i]);
            }
        }
        System.out.println(count);
    }
}
