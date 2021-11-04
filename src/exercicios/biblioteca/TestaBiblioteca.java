package exercicios.biblioteca;

import exercicios.biblioteca.enums.Language;
import exercicios.biblioteca.enums.TipoObra;
import exercicios.biblioteca.enums.TipoUsuario;

public class TestaBiblioteca {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Edelberto", "Brasileira");
        Autor autor2 = new Autor("Anthony", "Inglaterra");
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();

        usuario1.cadastroUsuario(
                101,
                TipoUsuario.ALUNO,
                "Beto",
                "Rua Luiz Carlos, n53, centro, Caxias do Sul");

        usuario2.cadastroUsuario(
                102,
                TipoUsuario.FUNCIONARIO,
                "Maria",
                "Rua Sarandi, n236, centro, Farroupilha");

        ObraLiteraria obra1 = new ObraLiteraria(
                "Nome do livro",
                "Aqui está sendo relatado o resumo da obra lierária",
                "Nome da Editora",
                autor1,
                TipoObra.LIVRO,
                Language.PORTUGUESE
        );

        ObraLiteraria obra2 = new ObraLiteraria(
                "Nome do Jornal",
                "Aqui está sendo relatado o resumo do Jornal",
                "Nome da Editora",
                autor2,
                TipoObra.PERIODICOINFORMATIVO,
                Language.ENGLISH
        );

//        System.out.println(obra1);
        System.out.println(usuario1);
        System.out.println(usuario2);
//        System.out.println(obra1.getNome());
//        usuario2.excluirUsuario(TipoUsuario.FUNCIONARIO,102);
//        System.out.println(usuario2);
    }
}
