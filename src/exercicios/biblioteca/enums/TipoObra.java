package exercicios.biblioteca.enums;

public enum TipoObra {
    LIVRO("Livro"),
    PERIODICOCIENTIFICO("PeriódicoCietífico"),
    PERIODICOINFORMATIVO("PeriódicoInformativo"),
    PERIODICODIVERSO("PeriódicoDiverso"),
    ENTRETENIMENTO("Entretenimento");

    private String descricao;

    TipoObra(String descricao){ this.descricao = descricao; }

    public String getDescricao() { return descricao; }
}
