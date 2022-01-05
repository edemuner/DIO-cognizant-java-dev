package Stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {

    public static void main(String[] args) {


        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String");

        /*
        Observar o processo de simplificação
         */

//            numerosAleatorios.stream().forEach(new Consumer<String>() {
//                @Override
//                public void accept(String s) {
//                    System.out.println(s);
//                }
//            });

//        numerosAleatorios.stream().forEach(s -> System.out.println(s));

//        numerosAleatorios.forEach(s -> System.out.println(s));

            /* apenas a forma como eu faria antes de conhecer a stream
            convenhamos que também é muito simples
            porém esse exemplo de utilização também é o mais simples possível
             */
//        for (String num : numerosAleatorios){
//            System.out.println(num);
//        }

        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                // o output só tem 4 números porque o set não aceita repetição
                .forEach(System.out::println);

        System.out.println("\nTransforme a lista de string em lista de inteiros");
//
//
        /*
         novamente o processo de simplificação - ou abstração
        */
//        numerosAleatorios.stream()
//                        .map(new Function<String, Integer>() {
//                            @Override
//                            public Integer apply(String s) {
//                                return Integer.parseInt(s);
//                            }
//                        });

//        numerosAleatorios.stream()
//                        .map(s -> Integer.parseInt(s));

        System.out.println(numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList()));

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista");
//        numerosAleatorios.stream()
//                        .map(Integer::parseInt)
//                        .filter(new Predicate<Integer>() {
//                            @Override
//                            public boolean test(Integer i) {
//                                if (i % 2 == 0 && i > 2){
//                                    return true;
//                                }
//                            }
//                        })
//                .collect(Collectors.toList());
        List<Integer> paresgt2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList());
        System.out.println(paresgt2);


        System.out.println("\nMostre a média dos números");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

//        inserindo numa variável e imprimindo com .getAsDouble()
//        System.out.println(average.getAsDouble());

        System.out.println("\nRemova os valores ímpares");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatorios1.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatorios1);


        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

    }
}
