package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para calcular seu fatorial: ");
        try {
            int fator = scan.nextInt();
            int resultado = 1;
            for (; fator > 0; fator--){
                resultado *= fator;
            }
            System.out.println(resultado);
        }
        catch(InputMismatchException erro){
            System.out.println("Apenas números!");
        }
    }
}
