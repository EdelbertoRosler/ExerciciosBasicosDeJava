package exercises.biblioteca;

import java.util.Objects;

public class Autor {
    private String nome, naionalidade;

    public Autor(String nome, String naionalidade) {
        this.nome = nome;
        this.naionalidade = naionalidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) &&
                Objects.equals(naionalidade, autor.naionalidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, naionalidade);
    }

    public String toString() {
        if (this.nome != null) {
            return this.nome + " - " + this.naionalidade;
        }
        return "";
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getNaionalidade() { return naionalidade; }

    public void setNaionalidade(String naionalidade) { this.naionalidade = naionalidade; }

}
