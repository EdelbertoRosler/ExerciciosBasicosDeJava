package exercicios.biblioteca;

import exercicios.biblioteca.enums.Language;
import exercicios.biblioteca.enums.TipoObra;

import java.util.Objects;

public class ObraLiteraria {
    private String nome, resumo, editora;
    private boolean midia_digital;
    private Autor autor;
    private TipoObra tipoObra;
    private Language language;


    public String GerarResumo() { return resumo; }

    public ObraLiteraria(String nome, String resumo, String editora, Autor autor, TipoObra tipoObra, Language language) {
        this.nome = nome;
        this.resumo = resumo;
        this.editora = editora;
        this.autor = autor;
        this.tipoObra = tipoObra;
        this.language = language;
    }

    @Override
    public String toString() {
        return "ObraLiteraria:\n" +
                "   nome= " + nome + "\n" +
                "   resumo= " + resumo + "\n" +
                "   editora= " + editora + "\n" +
                "   midia_digital= " + midia_digital + "\n" +
                "   autor= " + autor + "\n" +
                "   tipoObra= " + tipoObra.getDescricao() + "\n" +
                "   language= " + language.getDescricao();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObraLiteraria)) return false;
        ObraLiteraria that = (ObraLiteraria) o;
        return midia_digital == that.midia_digital &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(resumo, that.resumo) &&
                Objects.equals(editora, that.editora) &&
                Objects.equals(autor, that.autor) &&
                tipoObra == that.tipoObra &&
                language == that.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, resumo, editora, midia_digital, autor, tipoObra, language);
    }

    public String getNome() {
        return nome;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getEditora() {
        return editora;
    }

    public boolean isMidia_digital() {
        return midia_digital;
    }

    public void setMidia_digital(boolean midia_digital) {
        this.midia_digital = midia_digital;
    }

    public Autor getAutor() {
        return autor;
    }

    public TipoObra getTipoObra() {
        return tipoObra;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
