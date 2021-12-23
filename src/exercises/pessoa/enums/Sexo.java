package exercises.pessoa.enums;

public enum Sexo {
    M("masculino"),
    F("feminino");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
