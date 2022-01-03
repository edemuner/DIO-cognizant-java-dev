package Map;

import java.util.*;

public class ExemploMap {


    public static void main(String[] args) {

        /*
        Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
        modelo = gol - consumo = 14.4km/L
        modelo = uno - consumo = 15.6/L
        modelo = mobi - consumo = 16.1km/L
        modelo = hb20 - consumo = 14.5km/L
        modelo = kwid - consumo = 15.6km/L
         */

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double>  carrosPopulares = new HashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("\nSubstitua o consumo do gol por 15.2km/L");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicinário");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno");
        System.out.println(carrosPopulares.get("uno"));

        System.out.println("\nExiba o terceiro modelo adicionado");
        // impossível

        System.out.println("\nExiba os modelos");
        System.out.println(carrosPopulares.keySet());

        System.out.println("\nExiba os consumos dos carros");
        System.out.println(carrosPopulares.values());

        System.out.println("\nExiba o modelo mais econômico e seu consumo");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        System.out.println(Collections.max(carrosPopulares.values()));
        System.out.println(consumoMaisEficiente);

        // forma apropriada para localizar outra entrada com o mesmo valor
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente);
            }
        }


        System.out.println("\nExiba o modelo menos econômico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMenosEficiente +
                        " - " + consumoMenosEficiente);
            }
        }


        System.out.println("\nExiba a soma dos consumos");
        Double soma = 0d;
        for (Double consumo : carrosPopulares.values()) soma += consumo;
        System.out.println(soma);

        System.out.println("\nExiba a média dos consumos deste dicionário");
        System.out.println(soma / carrosPopulares.size());


        System.out.println("\nRemova os modelos com o consumo igual a 15.6");
        Collection<Double> consumos = carrosPopulares.values();
        consumos.removeIf(foo -> foo.equals(15.6));
        System.out.println(consumos);

        System.out.println("\nExiba os carros na ordem em que foram informados");
        Map<String, Double>  carrosPopulares1 = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("\nExiba o dicionário ordenado pelo modelo");
        Map<String, Double>  carrosPopulares2 = new TreeMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("\nApague o dicionário de carros");
        carrosPopulares.clear();

        System.out.println("\nConferir se está vazio");
        System.out.println(carrosPopulares.isEmpty());

//        System.out.println("\n");
    }

}
