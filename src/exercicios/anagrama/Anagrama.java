package exercicios.anagrama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrama {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private static final List<Object> listaDasPalavras = new ArrayList<>();
    private static int contAnagramas = 0;

    public static void main(String[] args) throws IOException {
        prencherLista(lerTexto("Diga: "));

        System.out.println(listaDasPalavras);
        System.out.println(qntAnagramas());

    }


    /**
     * Metodo para lêr uma String
     */
    public static String lerTexto(String txt) throws IOException {
        System.out.print(txt);
        return bf.readLine();
    }


/**
 * Este metodo recebe um texto, separa as palavras dos espaços em branco e adiciona cada palavra numa lista
 */
    public static void prencherLista(String texto) {
        String[] arrayPalavras = texto.split(" ");
        Collections.addAll(listaDasPalavras, arrayPalavras);
    }


/**
 * Este metodo recebe 2 objetos(duas palavras), transforma em string, coloca eles em ordem alfabética
 * e verifica se são iguais caracter por caracter
 */
    public static boolean comparaString(Object a, Object b){
        char[] aa = a.toString().toCharArray();//Coloca o objeto em uma array de caracteres
        Arrays.sort(aa);//ordena a array
        char[] bb = b.toString().toCharArray();
        Arrays.sort(bb);
        int contChar = 0;// variável para somar a quantidade de caracteres iguais

        if (aa.length == bb.length){ //compara as 2 arrays
            for (char c : aa) {
                for (int j = 0; j < aa.length; j++) {
                    if (c == bb[j]) {
                        contChar += 1;
                        break;
                    }
                }
            }
        }
        return contChar == aa.length;
    }

    /**
     * Este metodo compara as palavras da arrayList utilizando o método comparaString e soma a quantidade
     * de anagramas presentes na List
     */
    public static String qntAnagramas(){
        for (int i = 0; i < listaDasPalavras.size() - 1; i ++ ){
            if (comparaString(listaDasPalavras.get(i), listaDasPalavras.get(i+1))){
                contAnagramas += 1;
            }
        }
        return "Quantidade de anagramas: " + contAnagramas;
    }

}
