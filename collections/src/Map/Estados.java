package Map;

import java.util.*;

public class Estados {

    public static void main(String[] args) {


        Map<String, Integer> estados = new HashMap<String, Integer>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);

        System.out.println("Substituindo a população do RN");
        estados.put("RN", 3534165);
        System.out.println(estados);
        
        System.out.println("\nConferindo se há PB, se não, adicionando");
        if (!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);

        System.out.println("\nExibir na ordem informada");
        Map<String, Integer> estados1 = new LinkedHashMap<String, Integer>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados1);

        System.out.println("\nExibir estados e populações em ordem alfabética");
        Map<String, Integer> estados2 = new TreeMap<String, Integer>();
        estados2.putAll(estados);
        System.out.println(estados2);

        System.out.println("Estado com maior população");
        Integer maiorPopulacao = Collections.max(estados.values());
        for (Map.Entry entry : estados.entrySet()){
            if (entry.getValue() == maiorPopulacao){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("Estado com menor população");
        Integer menorPopulacao = Collections.min(estados.values());
        for (Map.Entry entry : estados.entrySet()){
            if (entry.getValue() == menorPopulacao){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        System.out.println("Exibir a soma das populações");
        int soma = 0;
        for (int pop : estados.values()){
            soma += pop;
        }
        System.out.println(soma);

        System.out.println("Exibir a média");
        System.out.println(soma / estados.size());

        System.out.println("Remover estados com população menor que 4 mi");
        Collection<Integer> pops = estados.values();
        pops.removeIf(pop -> pop < 4000000);
        System.out.println(estados);

        estados.clear();
        System.out.println(estados);

    }
}

