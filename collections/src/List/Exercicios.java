package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicios {

    public static void acimaMedia(List<Double> lista){
        Double soma = 0d;
        for (Double mes : lista){
            soma += mes;
        }
        Double media = soma / lista.size();

        for (Double mes : lista){
            if (mes > media){
                System.out.println(mes(lista.indexOf(mes)) + mes);
            }
        }

    }

    public static String mes(int num){
        switch (num){
            case 0:
                return "Janeiro: ";
            case 1:
                return "Fevereiro: ";
            case 2:
                return "Março: ";
            case 3:
                return "Abril: ";
            case 4:
                return "Maio: ";
            case 5:
                return "Junho: ";
            default:
                return "";
        }
    }

    public static void main(String[] args) {

        List<Double> tempSemestre = new ArrayList<Double>(){{
            add(33d);
            add(32d);
            add(35.3);
            add(30d);
            add(27d);
            add(26.4);
        }};

        acimaMedia(tempSemestre);

    }
}
