package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int evenSum = 0;
        int oddSum = 0;
        boolean flag  = true;

        while (flag) {
            System.out.println("Digite o número de números a serem digitados");
            try {
                count = scan.nextInt();
                if (count <= 0) {
                    System.out.println("Apenas números maiores que zero");
                    scan.nextLine();
                    continue;
                }
                flag = false;
            } catch (InputMismatchException nonNumeric) {
                scan.nextLine();
                System.out.println("Apenas números!");
            }
        }

        do{
            System.out.println("Digite um valor");
            try {
                int val = scan.nextInt();
                if (val > 0){
                    if (val % 2 == 0) evenSum ++;
                    else oddSum ++;
                    count --;
                }
                else {
                    System.out.println("Apenas números maiores que zero");
                    scan.nextLine();
                }
            } catch (InputMismatchException nonNumeric){
                scan.nextLine();
                System.out.println("Apenas números - valor errado");
            }
        }while (count > 0);

        System.out.println("Número de pares: " + evenSum + "\nNúmero de ímpares: " + oddSum);
    }
}
