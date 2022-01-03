package Set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompLingFav {

    public static void main(String[] args) {


        Set<LinguagemFavorita> linguagens = new LinkedHashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("java", "intellij idea", 1991));
            add(new LinguagemFavorita("python", "pycharm", 1990));
            add(new LinguagemFavorita("c", "clion", 1972));
        }};

        Set<LinguagemFavorita> linguagens1 = new TreeSet<LinguagemFavorita>();
        linguagens1.addAll(linguagens);

        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIDE());
        linguagens2.addAll(linguagens);

        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorAnoNome());
        linguagens3.addAll(linguagens);

        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoIDE());
        linguagens4.addAll(linguagens);





        System.out.println("Ordem de inserção");
        for (LinguagemFavorita li : linguagens){
            System.out.println(li.getNome());
        }

        System.out.println("\nOrdem natural (nome)");
        for (LinguagemFavorita li : linguagens1){
            System.out.println(li.getNome());
        }

        System.out.println("\nOrdem de IDE");
        for (LinguagemFavorita li : linguagens2){
            System.out.println(li.getIde() + " - " + li.getNome());
        }

        System.out.println("\nAno e nome");
        for (LinguagemFavorita li : linguagens3){
            System.out.println(li.getAno() + " - " + li.getNome());
        }

        System.out.println("\nNome, ano e IDE");
        for (LinguagemFavorita li : linguagens4){
            System.out.println(li.getNome() + " - " + li.getAno() + " - " + li.getIde());
        }



    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita li1, LinguagemFavorita li2) {
        return li1.getIde().compareTo(li2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita li1, LinguagemFavorita li2) {
        int ano = Integer.compare(li1.getAno(), li2.getAno());
        if (ano != 0) return ano;
        return li1.compareTo(li2);
    }
}

class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita li1, LinguagemFavorita li2) {
        int nome = li1.compareTo(li2);
        if (nome != 0) return nome;

        int ano = Integer.compare(li1.getAno(), li2.getAno());
        if (ano != 0) return ano;

        return li1.getIde().compareTo(li2.getIde());
    }
}