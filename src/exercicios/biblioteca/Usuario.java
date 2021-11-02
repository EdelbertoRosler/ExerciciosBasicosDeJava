package exercicios.biblioteca;
import exemplos.biblioteca.enums.TipoUsuario;

import java.util.Objects;

public class Usuario {
    private String nome, endereco;
    private int id;
    TipoUsuario tipoUsuario;


    public void cadastroUsuario(int id, TipoUsuario tipoUsuario, String nome, String endereco){
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void excluirUsuario(TipoUsuario tipoUsuario, int id){
        if (this.tipoUsuario == tipoUsuario && this.id == id){
            this.tipoUsuario = null;
            this.nome = null;
            this.endereco = null;
        }
    }

    @Override
    public String toString() {
        return "Usuário: \n" +
                "   id= " + id + "\n" +
                "   tipoUsuario= " + tipoUsuario.getDescricao() + "\n" +
                "   nome= " + nome + "\n" +
                "   endereco= " + endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id &&
                Objects.equals(nome, usuario.nome) &&
                Objects.equals(endereco, usuario.endereco) &&
                tipoUsuario == usuario.tipoUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, id, tipoUsuario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
