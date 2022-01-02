package Set;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {


        System.out.println("Crie um conjunto e adicione as notas");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5.0");
        System.out.println("\nAdiciona na lista a nota 8.0 na posição 4");
        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0");
        System.out.println("\nExiba a terceira nota adicionada");
        System.out.println("\nRemova a nota da posição 0");
        // impossível

        System.out.println("\nConfira se a nota 5.0 está no conjunto");
        System.out.println(notas.contains(5.0));


        System.out.println("\nExiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas");
        System.out.println(soma / notas.size());

        System.out.println("\nRemova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista");
        notas.removeIf(aDouble -> aDouble > 7d);
        System.out.println(notas);


        System.out.println("\nExiba todas as notas na ordem em que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<Double>(){{
            add(7d);
            add(8.5);
            add(9.3);
            add(5d);
            add(7d);
            add(0d);
            add(3.6);
        }};
        System.out.println(notas2);


        System.out.println("\nExiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\nApague todo o conjunto");
        notas.clear();
        System.out.println(notas.isEmpty());
        System.out.println(notas2.isEmpty());

        System.out.println("\n");
        System.out.println("\n");
    }
}
