package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Dados {

    public static void main(String[] args) {


        Random gerador = new Random();

        Map<Integer, Integer> jogo = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        for (int i = 0; i < 100; ++i) {
            int num = gerador.nextInt(6) + 1;
            System.out.println(num);
            jogo.put(num, jogo.get(num) + 1);
        }

        System.out.println(jogo);
    }
}
