package Map;

import java.util.*;

public class ExemploOrdenacao {

    public static void main(String[] args) {

        /*
        Dadas as seguintes informações sobre meus livros e autores favoritos e seus autores
        crie um dicionário e ordene este dicionário
        por nome e livro
        Hawking, Stephen - Uma breve história do tempo, pp 256
        Duhigh, Charles - o poder do hábito, pp 408
        Horari, Yuval Noah - 21 lições para o século 21, pp 432
         */

        System.out.println("Ordem aleatória - autor, livro");
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigh, Charles", new Livro("O Poder do Hábito", 408));
            put("Horari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\nOrdem de inserção");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigh, Charles", new Livro("O Poder do Hábito", 408));
            put("Horari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        System.out.println("\nOrdem alfabética autores");
        Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigh, Charles", new Livro("O Poder do Hábito", 408));
            put("Horari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\nOrdem alfabética nomes");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\n");


    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}
