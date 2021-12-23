package exercises.jogo.enuns;

public enum Posicao {
    GOLEIRO("Goleiro"),
    ZAGUEIRO("Zagueiro"),
    LATERALDIREITO("Lateral Direito"),
    LATERALESQUERDO("Lateral Esquerdo"),
    VOLANTE("Volante"),
    MEIA("Meia"),
    MEIAATACANTE("Meia Atacante"),
    CENTROAVANTE("Centroavante");

    private String descricao;

    Posicao(String descricao){ this.descricao = descricao; }

    public String getDescricao(){ return descricao; }
}
