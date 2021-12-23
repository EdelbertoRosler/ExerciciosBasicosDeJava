package exercises.biblioteca.enums;

public enum TipoUsuario {
    ALUNO("Aluno"),
    PROFESSOR("Professor"),
    FUNCIONARIO("Funcionário");

    private String descricao;

    TipoUsuario(String descricao){ this.descricao = descricao; }

    public String getDescricao() { return descricao; }

}
