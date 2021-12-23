package exercises.biblioteca.enums;

public enum Language {
    PORTUGUESE("Portuguese"),
    ENGLISH("English"),
    SPANISH("Spanish");

    private String descricao;

    Language(String descricao){ this.descricao = descricao; }

    public String getDescricao() { return descricao; }
}
