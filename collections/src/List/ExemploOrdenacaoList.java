package List;

import java.util.ArrayList;
import java.util.Collections;
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

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
}
