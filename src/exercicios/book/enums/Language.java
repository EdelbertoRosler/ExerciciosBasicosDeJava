package exercicios.book.enums;

public enum Language {
    PORTUGUESE("Portuguese"),
    ENGLISH("English"),
    SPANISH("Spanish"),
    FRANCE("France"),
    JAPANESE("Japanese"),
    CHINESE("Chinese");

    private String description;

    Language(String description){ this.description = description; }

    public String getDescription() { return description; }
}
