import java.util.Arrays;

public class Criacao {

    public static String calculadora(int v1, int v2) {

        double[] doubleList = new double[4];

        doubleList[0] = v1 + v2;
        doubleList[1] = v1 - v2;
        doubleList[2] = v1 * v2;
        doubleList[3] = (double) v1 / v2;

        return Arrays.toString(doubleList);
    }


    public void cumprimentador(int hora) {
        if ((hora > 0 && hora < 6) || (hora >= 18 && hora <= 24)) {
            System.out.println("Boa noite");
        } else if (hora > 6 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Hora inválida");
        }
    }

    public double calculadoraEmprestimo(double valorEmprestimo) {
        double valorDeCalculo;

        if (valorEmprestimo <= 100) {
            valorDeCalculo = valorEmprestimo * 1.3;
        }
        else if (valorEmprestimo <= 1000){
            valorDeCalculo = (valorEmprestimo - 100) * 1.2;
            valorDeCalculo += 130;
        }
        else {
            valorDeCalculo = (valorEmprestimo - 1100) * 1.1;
            valorDeCalculo += 330;
        }

        return valorDeCalculo;
    }
}
