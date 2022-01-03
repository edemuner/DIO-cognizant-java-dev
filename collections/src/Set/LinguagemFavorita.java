package Set;

import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private String ide;
    private Integer ano;

    public LinguagemFavorita(String nome, String ide, int ano) {
        this.nome = nome;
        this.ide = ide;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return ano == that.ano && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ide, ano);
    }

    @Override
    public int compareTo(LinguagemFavorita li) {
        return nome.compareTo(li.getNome());
    }
}
