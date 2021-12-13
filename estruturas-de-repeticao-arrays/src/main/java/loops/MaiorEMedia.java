package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        int bigger = Integer.MIN_VALUE;

        do{
            System.out.println("Digite um valor");
            try {
                int val = scan.nextInt();
                sum += val;
                counter ++;
                if (val > bigger) bigger = val;
            } catch (InputMismatchException nonNumeric){
                scan.nextLine();
                System.out.println("Apenas números - valor errado");
            }
        }while (counter < 5);

        System.out.println("O maior número foi " + bigger + " e a média é " + sum / counter);
    }
}
