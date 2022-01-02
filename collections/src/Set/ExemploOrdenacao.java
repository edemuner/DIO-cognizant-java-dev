package Set;

import java.util.*;

public class ExemploOrdenacao {

    public static void main(String[] args) {


        /* Dadas as seguintes informações sobre minhas séries favoritas,
        crie um conjunto e ordene este conjunto exibindo
        (nome - genero - tempo de episódio)

        Série 1 = got, fantasia, 60
        Série 2 = dark, drama, 60
        Série 3 = that 70's show, comédia, 60
         */


        System.out.println("Ordem aleatória");
        Set<Serie> minhasSeries = new HashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70's show", "comedia", 25));
        }};
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " +
                serie.getTempo());

        System.out.println("\nOrdem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<Serie>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that 70's show", "comedia", 25));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " +
                serie.getTempo());

        System.out.println("\nOrdem natural (tempo episódio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " +
                serie.getTempo());


        System.out.println("\nOrdem Nome/Genero/Tempo");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " +
                serie.getTempo());

        System.out.println("\nOrdem genero");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " +
                serie.getTempo());

        System.out.println("\nOrdem tempo");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempo());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + " - " +
                serie.getTempo());
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempo(), s2.getTempo());
    }
}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareTo(s2.getGenero());
    }
}

class ComparatorTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return Integer.compare(s1.getTempo(), s2.getTempo());
    }
}