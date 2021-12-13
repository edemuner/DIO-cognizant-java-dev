package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int multiplicando = 0;

        System.out.println("Digite a tabuada desejada: ");
        try{
            multiplicando = scan.nextInt();
            for (int i = 1; i <= 10; i++){
                System.out.println(multiplicando + " X " + i + " = " + multiplicando * i);
            }
        }
        catch (InputMismatchException erro){
            System.out.println("Apenas números!");
        }


    }
}
