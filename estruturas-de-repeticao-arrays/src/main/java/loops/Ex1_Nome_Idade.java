package loops;

import java.util.Scanner;

public class Ex1_Nome_Idade {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.nextLine();
            if  (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();
            scan.nextLine();
            if (idade == 0)break;
        }
    }
}
