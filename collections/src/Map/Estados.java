package Map;

import java.util.HashMap;
import java.util.Map;

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
        System.out.println("Conferindo se há PB, se não, adicionando");
        if (!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);
    }
}
