package exercises.strings_e_chars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharInicialMaiuscula {

    public static void main(String[] args) {
        List<Character> caracteres = new ArrayList<>();
        List<String> listaDasPalavras = new ArrayList<>();

        String name = "Edelberto Hermann Rosler";

        //separa a string em palavras e adiciona em uma lista
        String[] arrayPalavras = name.split(" ");
        Collections.addAll(listaDasPalavras, arrayPalavras);

        //adiciona as palavras em uma lista de caracteres
        for (int i = 0; i < listaDasPalavras.size(); i ++) {
            caracteres.add(listaDasPalavras.get(i).charAt(0));
        }

        //imprime as iniciais em cada palavra
        for (Character c : caracteres) {
            System.out.println(c);
        }
    }
}
