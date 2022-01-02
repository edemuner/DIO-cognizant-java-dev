package Set;

import java.util.Objects;

public class Serie implements Comparable<Serie>{

    private String nome;
    private String genero;
    private Integer tempo;

    public Serie(String nome, String genero, Integer tempo) {
        this.nome = nome;
        this.genero = genero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempo.equals(serie.tempo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempo);
    }


    @Override
    public int compareTo(Serie serie) {
        int tempo = Integer.compare(getTempo(), serie.getTempo());
        if (tempo != 0) return tempo;
        return getGenero().compareTo(serie.getGenero());
    }
}
