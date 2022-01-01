import java.util.ArrayList;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("\nExiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas.toString());

        System.out.println("\nConfira se a nota 5.0 está na lista");
        System.out.println(notas.contains(5.0));

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("\nExiba a terceira nota adicionada: ");

    }
}
