package List;

import java.util.*;

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
        System.out.println(notas.get(2));

        System.out.println("\nExiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("\nExiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("\nExiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("\nExiba a média das notas");
        System.out.println(soma / notas.size());

        System.out.println("\nRemova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nRemova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista");
//        for (int i = 0; i <= notas.size(); i++){
//            if (notas.get(i) < 7){
//                notas.remove(i);
//            }
//        }

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 7d){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("\nApague toda a lista");
//        notas.clear();
//        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia");
        System.out.println(notas.isEmpty());

        System.out.println("Crie uma lista chamada notas 2 e" +
                "coloque todos os elementos da lista Arraylist nessa nova lista");
        List<Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-la");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-a");
        System.out.println(notas2.remove(0));
        System.out.println(notas2);

    }
}
