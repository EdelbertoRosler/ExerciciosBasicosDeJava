package exercises.jogo;

import exercises.jogo.enuns.Posicao;

import javax.xml.crypto.Data;
import java.util.Objects;

public class Jogador {
    private int id, numero, qualidade, cartoes;
    private String nome, apelido;
    private String dataNascimento;
    private Boolean suspenso = false;
    private Posicao posicao;

    public Jogador(int id, int numero, int qualidade, int cartoes, String nome, String apelido, Posicao posicao, String dataNascimento) {
        this.id = id;
        this.numero = numero;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.nome = nome;
        this.apelido = apelido;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
    }



    public String jogadorSuspenso(){
        if (this.cartoes >= 3){
            suspenso = true;
        }
        return suspenso ? "SUSPENSO": "APTO A JOGAR";
    }

    @Override
    public String toString() {
        return posicao.getDescricao() + ": " + numero +
                " - Jogador: " + nome +
                " (" + apelido + ")" +
                " - " + dataNascimento +
                " - CONDIÇÃO: " + jogadorSuspenso();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jogador)) return false;
        Jogador jogador = (Jogador) o;
        return id == jogador.id && numero == jogador.numero && qualidade == jogador.qualidade && cartoes == jogador.cartoes && Objects.equals(nome, jogador.nome) && Objects.equals(apelido, jogador.apelido) && Objects.equals(posicao, jogador.posicao) && Objects.equals(dataNascimento, jogador.dataNascimento) && Objects.equals(suspenso, jogador.suspenso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, qualidade, cartoes, nome, apelido, posicao, dataNascimento, suspenso);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidade() {
        return qualidade;
    }

    public void setQuantidade(int quantidade) {
        this.qualidade = quantidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public void setCartoes(int cartoes) {
        this.cartoes = cartoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Boolean getSuspenso() {
        return suspenso;
    }

    public void setSuspenso(Boolean suspenso) {
        this.suspenso = suspenso;
    }
}
