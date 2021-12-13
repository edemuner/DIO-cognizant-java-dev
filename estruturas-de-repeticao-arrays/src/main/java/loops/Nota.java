package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean flag = true;

        while (flag){
            int nota;
            try{
                System.out.println("Informe a nota:");
                nota = scan.nextInt();
                if (nota >= 0 && nota <= 10) {
                    System.out.println("A nota é " + nota);
                    flag = false;
                }
                else{
                    System.out.println("Valor inválido");
                }
            }
            catch (InputMismatchException erro){
                System.out.println("Nota inválida");
                scan.nextLine();
                }
        }
    }
}
