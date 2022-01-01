package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

    /* Dadas as seguintes informações sobre meus gatos, crie uma lista
    e ordene esta lista exibindo:
    (nome-idade-cor);
    Gato1 - nome: Jon, idade: 18, cor: preto
    Gato2 - nome: Simba, idade: 6, cor: tigrado
    Gato3 - nome: Jon, idade: 12, cor: amarelo
     */

    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<Gato>(){{
                add(new Gato("Jon", 18, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
            }};

        System.out.println(gatos);

        System.out.println("\nOrdenando por inserção");
        System.out.println(gatos);

        System.out.println("\nOrdem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("\nOrdem natural(nome)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("\nOrdem por idade");
        Collections.sort(gatos, new ComparatorIdade());
//        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);


        System.out.println("\nOrdenando por cor");
        System.out.println("\nOrdem por idade");
        Collections.sort(gatos, new ComparatorCor());
//        gatos.sort(new ComparatorCor());
        System.out.println(gatos);


        System.out.println("\nCor, idade, Nome");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);


    }
}

class ComparatorIdade implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2){
        int cNome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (cNome == 0){
            int cCor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if (cCor == 0){
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
            else return cCor;
        }
        else return cNome;

    }
}