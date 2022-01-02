package Set;

import java.lang.reflect.Array;
import java.util.*;

public class ArcoIris {

    public static void main(String[] args) {

        Set<Cor> arcoiris = new LinkedHashSet<Cor>(){{
            add(new Cor("vermelho"));
            add(new Cor("laranja"));
            add(new Cor("amarelo"));
            add(new Cor("verde"));
            add(new Cor("azul"));
            add(new Cor("anil"));
            add(new Cor("violeta"));
        }};

        System.out.println("todas as cores uma abaixo da outra");
        for (Cor cor : arcoiris){
            System.out.println(cor);
        }

        System.out.println("\nquantidade de cores");
        System.out.println(arcoiris.size());

        System.out.println("\ncores em ordem alfabética");
        Set<Cor> arcoirisTS = new TreeSet<>(new ArcoIrisComparable());
        arcoirisTS.addAll(arcoiris);
        System.out.println(arcoirisTS);

        System.out.println("\ncores na ordem inversa da que foi informada");
        List<Cor> arcoirisAr = new ArrayList<Cor>(arcoirisTS);
        for (int i = arcoirisAr.size() - 1 ; i >= 0 ; --i){
            System.out.println(arcoirisAr.get(i));
        }
        Collections.reverse(arcoirisAr);
        System.out.println(arcoirisAr);

        System.out.println("\nTodas as cores que começam com a letra v");
        Iterator<Cor> iter = arcoiris.iterator();
        while (iter.hasNext()){
            String cor = iter.next().getNome();
            if (cor.startsWith("v")){
                System.out.println(cor);
            }
        }

        System.out.println("\nRemover todas as cores que não começam com v");
        arcoiris.removeIf(aCor -> !aCor.getNome().startsWith("v"));
        System.out.println(arcoiris);

        arcoiris.clear();
        System.out.println(arcoiris.isEmpty());

    }
}

class ArcoIrisComparable implements Comparator<Cor>{


    @Override
    public int compare(Cor c1, Cor c2) {
        return c1.getNome().compareTo(c2.getNome());
    }
}
