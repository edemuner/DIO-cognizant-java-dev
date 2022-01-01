package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicios1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima? [s/n]");
        respostas.add(scan.nextLine());
        System.out.println("Esteve no local do crime? [s/n]");
        respostas.add(scan.nextLine());
        System.out.println("Mora perto da vítima? [s/n]");
        respostas.add(scan.nextLine());
        System.out.println("Devia para a vítima? [s/n]");
        respostas.add(scan.nextLine());
        System.out.println("Já trabalhou com a vítima? [s/n]");
        respostas.add(scan.nextLine());

        int positivas = countPositive(respostas);
        if (positivas == 5) System.out.println("Assassina");
        else if (positivas >= 3) System.out.println("Cúmplice");
        else if (positivas >= 2) System.out.println("Suspeita");
        else System.out.println("Inocente");


    }

    public static int countPositive(List<String> list){
        int num = 0;
        for (String r : list){
            if (r.equalsIgnoreCase("s")) num += 1;
        }
        return num;
    }
}
