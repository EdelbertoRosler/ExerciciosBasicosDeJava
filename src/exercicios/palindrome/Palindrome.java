package exercicios.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private static final List<Character> caracteres = new ArrayList<>();
    private static final List<Character> invertido = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        prencherListas(lerPalavra("Qual palavra? "));
        System.out.println(testePalindrome());

    }

    public static void prencherListas(String palavra) {
        for (int i = 0; i < palavra.length(); i ++){
            caracteres.add(palavra.charAt(i));
            invertido.add(0,palavra.charAt(i));
        }
    }

    public static Boolean testePalindrome(){
        int soma = caracteres.size();
        for (int i = 0; i < caracteres.size(); i ++) {
            if (caracteres.get(i) == invertido.get(i)) {
                soma -= 1;
            }
        }
        return soma == 0;
    }

    public static String lerPalavra(String txt) throws IOException {
        System.out.print(txt);
        return bf.readLine();
    }

}
