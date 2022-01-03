package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMaisEficiente);

//        System.out.println("\n");
//        System.out.println("\n");
//        System.out.println("\n");
    }

}
