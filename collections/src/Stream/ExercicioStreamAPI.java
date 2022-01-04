package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
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

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

    }
}
